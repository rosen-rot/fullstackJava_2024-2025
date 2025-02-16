function cambiar_titulo(elemento) {
    let genero = elemento.innerText;

    let titulo = document.querySelector("#title_select");
    titulo.innerText = genero;
}

function cambiarEstadoBoton(boton){
    boton.style.backgroundColor = 'red';
    boton.textContent = 'No disponible';
}

function inicioSesion(){
    alert("Inicio de sesión exitoso")
}