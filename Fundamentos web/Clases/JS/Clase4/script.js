let like = 0;

function me_gusta(){
    like++;
    console.log(like); //Imprime en la consola de la web la cantidad de likes
    //numero = <span class="numero"> 0 </span>
    let numero = document.querySelector(".numero");
    numero.innerText = like;
}

/* Alcance del contador de likes: Utiliza una variable global (like) que incrementa el contador de likes para todos los botones.
Actualización del HTML: Busca el elemento con la clase .numero y actualiza su texto con el valor de like.
Problema con múltiples botones: Si tienes varios botones para diferentes publicaciones, esta función no es adecuada, porque todos los botones modificarán el mismo contador global.
Actualizará siempre el mismo elemento con clase .numero. */



function me_gusta_reformado(numero){
    //numero = 1, 2, 3.... 1000...
    let numero_html = document.querySelector(".numero" + numero);
    //Selecciono el elemento que tiene la clase numero: numero = <span class="numero"> 0 </span>

    let numero_actual = numero_html.innerText;
    numero_actual++;

    numero_html.innerText = numero_actual;
}

/* Alcance del contador de likes: No depende de una variable global, sino del valor directamente presente en el HTML del elemento específico.
Actualización del HTML: Recibe un número único como argumento (numero) que le permite seleccionar un elemento único mediante la clase (por ejemplo, .numero1, .numero2, etc.).
Ventaja con múltiples botones: Esta función es más escalable, ya que puede manejar múltiples contadores para diferentes botones.
Cada botón actualiza su propio contador de likes, seleccionando dinámicamente el elemento correcto. */


