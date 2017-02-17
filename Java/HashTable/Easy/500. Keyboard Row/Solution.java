/**
 * <pre>
 * 用hashMap將鍵盤對應列放入
 * 再根據字串陣列依序比對 是否有完全符合即放入linkList
  時間複雜度 => O(n^2)
 * </pre>
 * 
 * @author Shawn
 */

public class Solution {
    public String[] findWords(String[] words) {
        // 先將鍵盤對應放入HashMap
        String[] keys = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < keys.length; i++){
            for(char c : keys[i].toCharArray()){
                map.put(c, i);
            }
        }
        List<String> res = new LinkedList<String>();
        // 判斷每個字串是否在同一列中
        for(String word : words){
            if(word.equals("")) continue;
            // 先取出每個word的列號
            int row = map.get(word.toLowerCase().charAt(0));
            for(char c : word.toLowerCase().toCharArray()){
                if(row != map.get(c))
                    row = -1;
            }
            if(row != -1) res.add(word); 
        }
        return res.toArray(new String[0]);
    }
}
