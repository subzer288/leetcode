package Problem;

//Given a string s, find the length of the longest substring without repeating characters.
//
//
//
//        Example 1:
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//
//        Example 2:
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.

import java.util.HashMap;

public class LongestSubString {

    public static int solution(String s){
        HashMap<Character, Integer> dic = new HashMap<>();
        int ans = 0;

        for(int right = 0, left = 0; right < s.length(); right++){
            if(dic.containsKey(s.charAt(right))){
                left = Math.max(dic.get(s.charAt(right)),left);
            }
            dic.put(s.charAt(right), right + 1);
            ans = Math.max(ans, right - left + 1 );
        }
        return ans;
    }
}
