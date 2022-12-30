//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//Input: s = "abccccdd"
//Output: 7
//Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer>map = new HashMap<>();
        int count = 0;
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            if(map.get(c)%2 == 0)
            {
                count = count + 2;
            }
        }
        
        if(count < s.length())
        {
            count = count + 1;
        }
        
        return count;
    }
}
