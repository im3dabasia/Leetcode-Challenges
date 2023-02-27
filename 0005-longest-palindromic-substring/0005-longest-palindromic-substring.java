class Solution {
    public String longestPalindrome(String s) {
        String result = null;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int head = i, end = i;
            while (head >= 0 && end < s.length()){
                if( s.charAt(head) == s.charAt(end)){
                    if(max < (end - head + 1)){
                        max = end - head + 1;
                        result = s.substring(head, end + 1);
                    }
                }
                else break;
                head -= 1;
                end += 1;
            }
            head = i;
            end = i + 1;
            while (head >= 0 && end < s.length()){
                if( s.charAt(head) == s.charAt(end)){
                    if(max < (end - head + 1)){
                        max = end - head + 1;
                        result = s.substring(head, end + 1);
                    }
                }
                else break;
                head -= 1;
                end += 1;
            }
        }
        return result; 
    }
}