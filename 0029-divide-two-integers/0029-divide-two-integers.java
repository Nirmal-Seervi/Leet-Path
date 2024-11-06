class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        
        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;  

        
        long quotient = 0;
        while (dividendAbs >= divisorAbs) {
            long tempDivisor = divisorAbs, multiple = 1;
            
            while (dividendAbs >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
           
            dividendAbs -= tempDivisor;
            quotient += multiple;
        }

       
        return (int) (sign * quotient);
    }
}
