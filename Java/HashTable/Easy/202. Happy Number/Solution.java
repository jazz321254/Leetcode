/**
 * <pre> 
 * 解題要點用一個Set表示出現過的和
 * 當再出現一次表示又回到head幾表示沒有happy number
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public boolean isHappy(int n) {
        Integer n1 = new Integer(n);
        Set<Double> tmp = new HashSet<Double>();
        Double rs = new Double(0);
        while(!n1.equals(1)){
            for(Character i: n1.toString().toCharArray())
                rs += Math.pow((double) Character.digit(i, 10), 2);
            if(tmp.contains(rs)) break;
            tmp.add(rs);
            n1 = rs.intValue();
            rs = new Double(0);
        }
        if(n1.equals(1)) return true;
        return false;
    }
}
