function cambiarBoton(buttonHeader){
    if(buttonHeader.innerText == "Iniciar sesión"){
        buttonHeader.innerText = "Cerrar sesión";
    }else{
        buttonHeader.innerText = "Iniciar sesión";
    }
}
/* function toggleLogin() {
    const button = document.getElementById('loginButton');
    button.textContent = button.textContent === 'Iniciar sesión' ? 'Cerrar sesión' : 'Iniciar sesión';
}
*/

function handleLike(button) {
    const card = button.closest('.card');
    const title = card.querySelector('h2').textContent;
    const likeCount = card.querySelector('.likeCount');

    // Disparar alarma
    alert(`Te gustó la definición de: ${title}`);

    // Incrementar conteo de likes
    let currentLikes = parseInt(likeCount.textContent);
    likeCount.textContent = `${++currentLikes} me gusta`;
}

function ocultar(buttonSidebar){
    buttonSidebar.style.visibility= "hidden";
}