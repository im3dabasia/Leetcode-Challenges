class Solution {
    public List<String> removeAnagrams(String[] words) {
        for(int i = words.length -1 ;  i > 0 ; i--){
            String currWord = words[i];
            char[] charactersOfCurrWord = currWord.toCharArray();
            Arrays.sort(charactersOfCurrWord);
            String sortedCurrWord = String.valueOf(charactersOfCurrWord);
            // System.out.println(i +" " +sortedCurrWord);
            if(i < words.length -1 || i >= 1){
                // while(true){
                i--;
                String newWord = words[i];
                char[] charactersOfNewWord = newWord.toCharArray();
                Arrays.sort(charactersOfNewWord);
                String sortedNewWord = String.valueOf(charactersOfNewWord);
                // System.out.println(sortedCurrWord + "=====" +sortedNewWord);
                if(sortedCurrWord.equals(sortedNewWord)){
                    words[++i] = "";
                    // System.out.println(Arrays.toString(words));
                }else{
                    ++i;
                }

                // }                
            }

        }
        
        List<String> res = new ArrayList<>();
        for(int i = 0 ; i < words.length; i++){
            if( words[i] !=""){
                res.add(words[i]);
            }
        }
        return res;
    }
}