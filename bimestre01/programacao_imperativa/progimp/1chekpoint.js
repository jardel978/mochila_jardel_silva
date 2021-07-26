for (i=1000; i>=100; i-=100) { 
    console.log(i); 
}

//----------------------------------------
function calcular (numA, numB, operacao){
    if(operacao == "+"){
        return numA+numB;}
    if(operacao == "-"){
        return numA-numB;}
    if(operacao == "*"){
        return numA*numB;}
    if(operacao == "/" && numB != 0){
        return numA/numB;}
    else{
        return "Impossível dividir!";
    }
}

let resultado = calcular(2,5,"+");
console.log("Resultado= " + resultado);

//------------------------------------------
for (i=1; i<=10; i++) { 
    console.log(i+`- CTD Certified Tech Developer’`);}

//------------------------------------------
//Xuxa
let resta = 0;
for(i = 5; i >= 3; i--){
    resta = i-1;
    console.log(i+` patinhos foram passear, além das montanhas para brincar, a mamãe gritou: "Quá, quá, quá, quá" , mas só ${resta} patinhos voltaram de lá`);
}

//-----------------------------------------
let num1 = 10;
let num2 = 20;
const num3 = 100;

num1 += num3;
num2 %= 5;
num2*=num3;
num1++;
num2--;
console.log("num1= ", num1);
console.log("num2  = ", num2);
console.log("num3= ", num3);

//-----------------------------------------
console.log(2!=="2");
//-----------------------------------------

var planeta = 6;
switch(planeta){
    case 1:
        console.log("Mercúiro, 0.37");
        break;
    case 2:
        console.log("Vênus, 0.37");
        break;
    case 3:
        console.log("Marte, 0.37");
        break;
    case 4:
        console.log("Júpiter, 0.37");
        break;
    case 5:
        console.log("Saturno, 0.37");
        break;
    case 6:
        console.log("Urano, 0.37");
        break;
}
