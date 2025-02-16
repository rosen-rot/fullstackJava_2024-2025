console.log("Entramos a la página!!");

function bienvenido(){
    alert("KAGE BUNSHIN NO JUTSU!!")
}

function eliminar(elemento){
    //console.log(elemento);
    elemento.remove(); //Se elimina el elemento
    confirm("Cerrando sesion");
 
    //elemento.style.visibility = "hidden"; Oculta el elemento
}

function cambiar_texto(elemento_logo){
    elemento_logo.innerText = "Profile";
}

function cambia_imagen(elemento_img){
    elemento_img.src = "img/narutopeque.jpg";
}

function vuelve_imagen(elemento_img){
    elemento_img.src = "img/narutoicon.jpg";
    //elemento_img,style.backgroundImage = "url('image/nueva.jpg')"
}

function editar_perfil(){
    let elemento_nombre = document.querySelector("#nombre");
    let elemento_parrafo = document.querySelector("#contenido");

    elemento_nombre.innerText = "Uzumaki Naruto";
    elemento_parrafo.innerHTML = "El mejor hokage";

    elemento_nombre.style.color = "orange";
    elemento_nombre.style.backgroundColor = "beige";
}

function busqueda(){
    let input = document.querySelector('#buscador');
    let valor = input.value;
    alert("Estas buscando a " +valor);
}

/* function cambiar_modo(){
    let tarjeta_usuario =  document.querySelector("tarjeta-usuario-contenedor");
    tarjeta_usuario.classList.add("dark-mode")

    dark-mode es una clase que se creó en CSS pero no se asigna en el HTML directamente, sino que se transfiere mediant de JS.

    if(tarjeta_usuario.classList.contains("dark-mode")){
        tarjeta-usuario.classList.remove("dark-mode");
    }else{
        tarjeta-usuario.classList.add("dark-mode");
    }

} */