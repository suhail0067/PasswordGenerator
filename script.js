//let age = 25
//console.log(age)
//const name = "Ankit"
console.log(name)

// function

function hello() {
    return "hello";
}

const greetarrow = () => {
    return "hello world";
}

console.log(hello());
console.log(greetarrow());



const student = {
    user : "Suhail" , 
    age: 21,
    marks: 45
};
console.log(student.user);
console.log(student.age);
console.log(student.marks)

// array
const fruits = ["Mango", "Banana", "Grapes"]

console.log(fruits[0])
console.log(fruits[1])

// map()
const number = [1, 2, 3];
const double = number.map(n => n*2);
console.log(double)

// 
const person = {name1 : "suhail", age1 : 21};
console.log(name1 , age1)