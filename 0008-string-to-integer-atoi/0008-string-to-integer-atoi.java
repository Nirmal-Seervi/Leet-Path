class Solution {
    public int myAtoi(String s) {
        String newstr = s.trim();
        int n = newstr.length();
        long num = 0;
        int sign = 1;

        
        if (n == 0) return 0;

        
        int i = 0;
        if (newstr.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (newstr.charAt(i) == '+') {
            i++;
        }

       
        while (i < n && Character.isDigit(newstr.charAt(i))) {
            num = num * 10 + (newstr.charAt(i) - '0');
            i++;

            
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        
        return (int) num * sign;
    }
}
