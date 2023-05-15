/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a = 0;
    let b = 1;
    
    for(let i = 0; i <= 50; i++ ){

        yield a
        
        let temp = a;
        a = b;
        b = b + temp;
        
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */