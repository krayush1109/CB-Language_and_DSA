// Difference Between var, let const

var a = 10;
let b = 20;
const c = 30;

// var a = "Hare Krishna";
// let b = 55; ❌
// const c = 75; ❌
function fun(){

    console.log("");
    a = a*10;
    b = b * 10;
    // c = c * 5;
    console.log(a);
    console.log(b);
    console.log(c);
    
    console.log("");
}

console.log(a);
console.log(b);
console.log(c);

// 🎯 let aur const se banaye global variables global object ka part nahi bante, so you can’t access them as window.x ya globalThis.x
console.log(window.a);
// console.log(window.b);
// console.log(window.c);



fun()