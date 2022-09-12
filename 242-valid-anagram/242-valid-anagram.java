class Solution {
    public boolean isAnagram(String s, String t) {
        
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(s.length() != t.length()) return false;
        
        
        for (int i = 0; i < str1.length; i++){

            if(str2[i] != str1[i])
            {
                return false;
            }
        }
        return true;
        
    }
}