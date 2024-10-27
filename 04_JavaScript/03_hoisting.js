console.log(a);
// console.log(b);  // let and const -> temporal dead zone mein chale jaayenge
// console.log(c);

var a = 1;
let b = 2;
const c = 3


// function hoisting
// 1. funciton declaration
sayHello();
function sayHello(){
    console.log("Hello");
}

// 2. function expression (for var, let, const -> kisi ke saath ye work nhi karega)
greet();
var greet =  function(){
    console.log("Hare Krishna");
}