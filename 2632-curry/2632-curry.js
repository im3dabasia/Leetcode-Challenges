/**
 * @param {Function} fn
 * @return {Function}
 */


var curry = function(fn) {
   return function curried(...args) {
        console.log(fn.length + " ARGS:" + args + " LEN:" + args.length);
       
      if(args.length == fn.length) {
            console.log("hello " ,...args)
          
            return fn(...args);
      }

      return (...nextArgs) => curried(...args, ...nextArgs)
      // };
     
   };
};

// var curry = function(fn) {
//    return function curried(...args) {
//       if(args.length >= fn.length) {
//          return fn(...args);
//       }

//       return (...nextArgs) => curried(...args, ...nextArgs);
//    };
// };
/**
 * function sum(a, b) { return a + b; }
 * const csum = curry(sum);
 * csum(1)(2) // 3
 */
