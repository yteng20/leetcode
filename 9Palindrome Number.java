//Given an integer x, return true if x is a palindrome, and false otherwise.

//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int len = str.length();
        for(int i = 1; i <= len/2; i++)
        {
            if(str.charAt(i-1) != str.charAt(len-i))
            {
                return false;
            }
        }
        
        return true;
    }
}
