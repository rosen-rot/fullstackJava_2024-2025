//Imprimir pares del 1 al 30

for(var i=2;i<=30; i+=2){
    console.log(i);
}

//Imprimir múltiplos de 4 en orden descendente desde el 100
for(let i = 100; i>= 0; i-=4){
    console.log(i);
}

//Imprime la secuencia 10,7,4,1,-2,-5
for(let i = 10; i >= -5; i-=3){
    console.log(i);
}

//Suma todos los números pares del 1 al 50
let sum = 0;
for(let i = 2; i<= 50; i+=2){
    sum+=i;
    console.log(sum);
}

//Factorial: multiplicar todos los números del 1 al 20
let mult = 1;

for (let i =1; i <= 20; i++){
    mult*= i;
    console.log(mult)
}