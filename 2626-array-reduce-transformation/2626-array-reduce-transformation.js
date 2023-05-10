/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    
    let newArr = [];
    
    let currSum = init;
    for(let curr = 0; curr < nums.length; curr++){
        
        // console.log(fn(currSum , nums[curr]))
        newArr[curr] = fn(currSum , nums[curr]);
        currSum = newArr[curr];
    }
    
    return currSum;
    
};