//We define the usage of capitals in a word to be right when one of the following cases holds:
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.

//Example 1:
//Input: word = "USA"
//Output: true
//Example 2:
//Input: word = "FlaG"
//Output: false


class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0 || word.length() == 1) return true;
        

        Boolean firstLetter = Character.isUpperCase(word.charAt(0));

        for(int i = 1; i < word.length(); i++)
        {
            if(firstLetter==false && Character.isUpperCase(word.charAt(i)))
            {
               return false;
            }
            else
            {
                if(i != word.length()-1 && Character.isUpperCase(word.charAt(i)) != Character.isUpperCase(word.charAt(i+1)))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
