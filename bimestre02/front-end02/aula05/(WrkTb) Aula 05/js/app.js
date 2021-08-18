let btn = document.querySelector(".tema");
let contador = 1;
let circulo = document.querySelector(".circulo");
let circuloWhite = document.querySelector("#noturno");
btn.addEventListener("click", (event) => {
    event.preventDefault();
    contador++;
    
    if(contador % 2 == 0){
        btn.classList.remove(".tema");
        corSite = document.body.style.background = "#201e1e";
        title = document.body.style.color = "white";
        circulo.style.animation = "deslizar-1 0.3s ease forwards";
        btn.style.background = "white";
        circuloWhite.classList.add("circulo-2");
    } else{
        corSite = document.body.style.background = "rgb(219, 219, 219";
        title = document.body.style.color = "#201e1e";
        circulo.style.animation = "deslizar-2 0.3s ease forwards";
        btn.style.background = "rgb(44, 6, 80)";
        circuloWhite.classList.remove("circulo-2");
    }

})