class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] array = Arrays.copyOf(arr,arr.length);
        Arrays.sort(array);
        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i < arr.length; i++){
            
            if(!map.containsKey(array[i])){
                map.put(array[i], k++);
            }
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.asList(map));
        
        for(int i =0;i < arr.length; i++){
            array[i] = map.get(arr[i]);
        }
        return array;
    }
}