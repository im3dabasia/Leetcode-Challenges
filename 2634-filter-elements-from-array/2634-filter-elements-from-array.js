/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    
    let newArr = [];
    for(let i =0 ; i < arr.length; i++){
        
        if(fn(arr[i], i)){
            newArr.push(arr[i]);
        }
        // newArr.push(fn(arr[i], i) && arr[i])
        
    }
    
    return newArr;
    
};