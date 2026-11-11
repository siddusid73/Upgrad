// function greet(){
//     console.log("Hello JS");
// }
// console.log("start");
// setTimeout(greet,3000);
// console.log("end");

// let counter = 0;

// function showTime() {
//     let dateTime = new Date();
//     let time = dateTime.toLocaleTimeString();
//     console.log(time);
//     counter++;

//     timeOut = setTimeout(showTime, 3000);

//     if (counter > 5) {
//         clearTimeout(timeOut);
//         setTimeout(showTime, 3000);
//     } else {
//         console.log("Time stopped");
//     }
// }

// showTime();

//SetInterval
// let counter = 0;
// let interval = setInterval(function() {
//     counter++;

//  if(counter === 5){
//     clearInterval(interval);
//  }
//  let dateTime = new Date();
//  let time = dateTime.toLocaleTimeString();
//  console.log(time);
// },3000);

function greet(name, myfunction){
   console.log("Hello"+" "+name);
   myfunction();
}
function callMe(){
   console.log("Iam a callback function"
   )
}

function callMe2(){
   console.log("I am inside callme2");
}
greet("Peter", callMe2)

//callback hell
