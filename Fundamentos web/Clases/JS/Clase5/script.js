/* PROMESAS */

function muestraPerrito(){
    fetch("https://dog.ceo/api/breeds/image/random")
        .then(response => response.json())
        .then(data => {
            console.log(data); //Esto es un objeto JSON
            //data['message'] = url.
            let imagen = `<img alt="perrito" src="${data['message']}" ></img>`;
            //let img = "<img alt='perrito' src='"+data['message']+"'>";
            document.querySelector('.imagen-perrito').innerHTML = imagen;
        });
}

// ASYNC/AWAIT, hace lo mismo que la anterior

async function muestraPerrito() {
    let response = await fetch("https://dog.ceo/api/breeds/image/random");
    let data = await response.json();
    let imagen = `<img alt="perrito" src="${data['message']}" ></img>`;
    document.querySelector('.imagen-perrito').innerHTML = imagen;
}