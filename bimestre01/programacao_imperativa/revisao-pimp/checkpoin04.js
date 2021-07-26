let numeros= [10, 8, 7, 99, 0, 1, 6];

// console.log(numeros.sort(function(a,b){ return a-b;}));

// console.log(numeros.sort(function(a,b){ return a*b;}));

console.log(numeros.sort(function(a,b){ return b-a;}));

// console.log(numeros.sort(function(a,b){ return a,b;}));

// console.log(numeros.sort(function(a,b){ a-b;}));
//--------------------------------------------------------

let x = 5
let y = x++ + ++x;
console.log(y)

x=3;
y = x*(x+1)*x++;
x=5;
y=3
y*=x+1
console.log(x)
console.log(y)
//--------------------------------------------------------

var z =0;
for(var i = 20; i <50; i+= 10){
    z+=i;
}
// console.log(z);
//----------------------------------------------------------
console.log("jardel".toLocaleUpperCase());
//----------------------------------------------------------
z = 2;
if(z == 5){
    console.log(z);
}
console.log("jardel".toLocaleUpperCase());


// if(z == 2){
//     console.log(z + 1);
// }
//----------------------------------------------------------

let v =5;
let fat = 1
for(let i = v; i > 1; i--){
    fat*=i;
}
console.log(fat);
//----------------------------------------------------------

for(var i = 0; i <50; i+= 10){
    console.log(i);
}
console.log(i);

//----------------------------------------------------------



//----------------------------------------------------------



