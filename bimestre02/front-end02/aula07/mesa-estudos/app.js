//Crie um formulário
let container = document.querySelector("main");
let parent = document.createElement("form");
parent.setAttribute("id", "login");
container.appendChild(parent);

//Um título com o texto: “Login”.
let titulo = document.createElement("h1");
titulo.textContent = "Login";
parent.appendChild(titulo);

//criando funções para faciliatar a criação de inputs e botões
function fazerInput(id, tipo, name, placeholder) {
    let input = document.createElement("input");
    input.setAttribute("id", id);
    input.setAttribute("type",  tipo);
    input.setAttribute("name", name);
    input.setAttribute("placeholder", placeholder);
    return input;
}

function fazerBtn(id, tipo, texto){
    let btn = document.createElement("button");
    btn.setAttribute("id", id);
    btn.setAttribute("type", tipo);
    let txtBtn = document.createTextNode(texto);
    btn.appendChild(txtBtn);
    return btn;
}

//Um campo de input text com um placeholder: “Email”
let email = fazerInput("user", "email", "email", "Seu email");
parent.appendChild(email);

//Um campo de input password com um placeholder: “Senha”.
let senha = fazerInput("senha", "password", "senha", "Sua senha");
parent.appendChild(senha);

let caixaBtn = parent.appendChild(document.createElement("div"));
//Um botão submit com o texto “Enviar”.
let btnEnviar = fazerBtn("btn-enviar", "submit", "Enviar");
caixaBtn.appendChild(btnEnviar);

//Um botão reset com o texto “Cancelar”
let btnCancelar = fazerBtn("btn-enviar", "reset", "Cancelar");
caixaBtn.appendChild(btnCancelar);

//Insira a propriedade disabled no campo de Email.
email.setAttribute("disabled", "disabled");

//Remova o atributo placeholder do email.
email.removeAttribute("placeholder");







