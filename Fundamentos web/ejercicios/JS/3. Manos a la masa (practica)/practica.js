var sandwich = {
    pan: "masa madre",
    proteína: "asado",
    queso: "queso suizo lacey",
    salsas: ["lechuga romana", "tomates reliquia", "salsa de rábano"]
};
    
console.log(sandwich);

function sandwichFactory(pan, proteína, queso, salsas) {
    var sandwich = {};
    sandwich.pan = pan;
    sandwich.proteína = proteína;
    sandwich.queso = queso;
    sandwich.salsas = salsas;
    return sandwich;
}
    
var s1 = sandwichFactory("trigo", "pavo", "provolone", ["mostaza", "cebolla frita", "rúcula"]);
console.log(s1);

function pizzaOven(corteza, quesos, salsa){
    var pizza= {};
    pizza.corteza = corteza;
    pizza.quesos = quesos;
    pizza.salsa = salsa;
    return pizza;
}

var pizza1 = pizzaOven("Estilo chicago", "tradicional", ["mozzarella"], ["pepperoni", "salchicha"]);
console.log(pizza1);

var pizza2 = pizzaOven("lanzada a mano", "marinara", ["mozzarella", "feta"], ["champiñones", "aceitunas", "cebollas"]);
console.log(pizza2);

// Creando otras dos pizzas con ingredientes favoritos
var pizza3 = pizzaOven("delgada", "salsa de pesto", ["mozzarella", "parmesano"], ["tomates secos", "espinacas", "alcachofas"]);
console.log(pizza3);

var pizza4 = pizzaOven("gruesa", "salsa BBQ", ["cheddar", "mozzarella"], ["pollo a la parrilla", "piña", "jalapeños"]);
console.log(pizza4);