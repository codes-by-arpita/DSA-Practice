class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int dig = 0;
            
            while (num > 0) {
                dig += num % 10;
                num /= 10;
            }
            
            num = dig;
        }
        return num;
    }
}

