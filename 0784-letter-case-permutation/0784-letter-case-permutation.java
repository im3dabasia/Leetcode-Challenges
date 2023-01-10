class Solution {
    List<String> temp;
    public List<String> letterCasePermutation(String s) {
        temp = new ArrayList<>();
        
        helper(s.toCharArray(), 0);
        return temp;
        
    }
    private void helper(char[] arr, int index){
        
        if(index == arr.length){
            // if(!temp.contains(new String(arr))){
                temp.add(new String(arr));
            // }
            return;
        }
        
        if(Character.isDigit(arr[index])){
            helper(arr, index + 1);
            return;
        }
        else{
            
        arr[index]  = Character.toLowerCase(arr[index]);
        helper(arr, index + 1);
        arr[index]  = Character.toUpperCase(arr[index]);
        helper(arr, index + 1);
        }
    
        
    }
}

