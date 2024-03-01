package Problem;

//Given a string s, return the longest palindromic substring in s.
//
//Example 1:
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//
//Example 2:
//Input: s = "cbbd"
//Output: "bb"

public class LongestPalindromicSubstring {
    public static String solution (String s){
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (isPalindrome(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }

        return "";
    }
    private static boolean isPalindrome(int i, int j, String s) {
        int left = i;
        int right = j - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
