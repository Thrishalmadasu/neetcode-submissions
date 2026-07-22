class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] newDigits = new int[n+1];
        int carry = 1;
        for(int i=n-1; i>=0; i--){
            int sum = digits[i] + carry;
            carry = sum/10;
            sum%=10;
            newDigits[i+1] = sum;
        }
        newDigits[0] = carry;

        if(newDigits[0]==0) return Arrays.copyOfRange(newDigits,1,n+1);
        return newDigits;
    }
}
