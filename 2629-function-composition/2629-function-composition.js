/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	return function(x) {
        let tmp = x;
        let ans = 0;
        for(let i = functions.length -1; i >= 0; i--){
            // console.log(functions[i].toString())
            ans =  functions[i](tmp)
            // console.log(ans);
            tmp = ans;
            // console.log(tmp);
            
        }
        
        if(functions.length == 0 ) return x;
        return ans;
    }

};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */