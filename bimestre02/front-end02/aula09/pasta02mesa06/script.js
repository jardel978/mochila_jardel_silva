//Crie um formulário
let container = document.querySelector("main");
let parent = document.createElement("form");
parent.setAttribute("id", "login");
container.appendChild(parent);

//Um título com o texto: "Formulário"
let titulo = document.createElement("h1");
titulo.textContent = "Formulário";
parent.appendChild(titulo);

//criando funções para faciliatar a criação de inputs e botões
function fazerInput(idInput, tipo, name, placeholder, idDiv) {
    let boxInput = document.createElement("div");
    let input = document.createElement("input");
    input.setAttribute("id", idInput);
    input.setAttribute("type", tipo);
    input.setAttribute("name", name);
    input.setAttribute("placeholder", placeholder);
    boxInput.setAttribute("id", idDiv);
    boxInput.appendChild(input);
    return boxInput;
}

function fazerBtn(id, tipo, texto) {
    let btn = document.createElement("button");
    btn.setAttribute("id", id);
    btn.setAttribute("type", tipo);
    let txtBtn = document.createTextNode(texto);
    btn.appendChild(txtBtn);
    return btn;
}

//criando inputs e botão
let nome = fazerInput("nome", "text", "nome", "Seu nome", "box-nome");
let sobrenome = fazerInput("sobrenome", "text", "sobrenome", "Seu sobrenome", "box-sobrenome");
let email = fazerInput("email", "email", "email", "Seu email", "box-email");
let btn = fazerBtn("btn-01", "reset", "Limpar");

//adicionando inputs e botão ao form
parent.appendChild(nome);
parent.appendChild(sobrenome);
parent.appendChild(email);
parent.appendChild(btn);

//função para habilitar/desabilitar inputs
function desabilitarInput(idInput, idBox) {
    let input = document.querySelector(`#${idInput}`);
    let caixaInput = document.querySelector(`#${idBox}`);
    input.addEventListener('focusout', ()=> { 
        input.value == "" ? input.disabled = false : input.disabled = true 
    });
    caixaInput.onmouseover = () => { input.disabled = false };
    caixaInput.onmouseout = () => { input.value == "" ? input.disabled = false : input.disabled = true };
}
//chamando função 
desabilitarInput("nome", "box-nome");
desabilitarInput("sobrenome", "box-sobrenome");
desabilitarInput("email", "box-email");


