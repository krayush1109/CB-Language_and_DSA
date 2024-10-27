
// let and const are -> Block scope

console.log("Hello");

{
    var a = 44;
    let b = 88;
    const c = 99;    
}


console.log(a);
// console.log(b);
// console.log(c);

// -------------------------------

// Function Scope
function fun(){
    var x = 15;
    let y = 20;
    const z = 25;    

    if(true){
        console.log("x inside : ", x)
        console.log("y inside : ", y);
        console.log("z inside : ", z);        
    }

}
// console.log(x); ❌

fun();

function run(){
    
    if(true){
        let m = 2;
        const n = 3;  
        
        if(true){
            var l = 1;            
        }
        
    }
    console.log(l)
    // console.log(m) ❌    
}
run();