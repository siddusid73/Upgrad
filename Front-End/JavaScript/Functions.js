const { ChevronsLeftIcon } = require("lucide-react");

function greet(){
    console.log("Good Morning");
}

greet();

//function expression
let displayPI = function(){
    console.log("PI = 3.14");
};

displayPI();

//passing funtion arguments
function greetMe(name){
    console.log(`Hello ${name}`)
}

greetMe("Siddu");

//Passing argument - function expression
let sum = function(a , b){
    console.log(a+b);
};

sum(10,20);

//return statement
function findSquare(num){
    console.log("This is before return statement");
    return num * num;
}

console.log(findSquare(5));

let square = findSquare(4);
console.log(square);

//Libary functions
//Math function - sqrt(),pow(),max(),min()

let squareRoot = Math.sqrt(4);
console.log("Square root is",squareRoot);

//String Library funtions - toUpperCase(),toLowerCase()
let brand = "upgrad";
let brandUpper = brand.toUpperCase();
console.log(brandUpper);

function sayHello(name = "Ram"){
    console.log(`Hello ${name}`);
}

sayHello("Siddu");

// function sum(x = 3,y=5){
//     return x + y;
// }

// var result = sum(7 , 15);
// var result2 = sum(7);

// console.log(result);
// console.log(result2);

//Arrow Functions
const addNumbers = (a,b) => a+b;

let person = {
    name:"Jack",
    age: 25,

    sayAge:() =>{
        console.log(this.age);
    },
};

person.sayAge();

