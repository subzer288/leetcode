package Problem;

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
