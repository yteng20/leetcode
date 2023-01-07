//Given two binary strings a and b, return their sum as a binary string.

//Input: a = "11", b = "1"
//Output: "100"



class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String result = "";
        int digit = 0;

        while(a.length() > 0 || b.length() > 0 || carry > 0)
        {

            if(a.length() > 0)
            {
                digit = digit + Character.getNumericValue(a.charAt(a.length()-1));
                a = a.substring(0, a.length()-1);
            }

            if(b.length() > 0)
            {
                digit = digit + Character.getNumericValue(b.charAt(b.length()-1));
                b = b.substring(0, b.length()-1);
            }

            if(carry > 0)
            {
                digit = digit + carry;
                carry = 0;
            }

            if(digit == 2)
            {
                digit = 0;
                carry = 1;
            }
            else if(digit ==3)
            {
                digit = 1;
                carry = 1;
            }

            result = Integer.toString(digit) + result;
            digit = 0;
        }

        return result;
    }
}
