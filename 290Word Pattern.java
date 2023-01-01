//Given a pattern and a string s, find if s follows the same pattern.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; i++)
        {
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
            {
                return false;
            }
        }
        return true; 
    }
}
