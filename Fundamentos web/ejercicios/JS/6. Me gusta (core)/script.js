// Seleccionamos todos los botones de "Like"
const likeButtons = document.querySelectorAll('.like-btn');

// Iteramos sobre cada botón y configuramos un evento de clic
likeButtons.forEach((button, index) => {
    button.addEventListener('click', () => {
        // Seleccionamos el contenedor del contador asociado al botón
        const likesCount = button.nextElementSibling;

        // Extraemos el número actual de "Likes" del texto
        let currentLikes = parseInt(likesCount.textContent);

        // Incrementamos el número de "Likes" y actualizamos el texto
        likesCount.textContent = `${currentLikes + 1} like(s)`;
    })
})
