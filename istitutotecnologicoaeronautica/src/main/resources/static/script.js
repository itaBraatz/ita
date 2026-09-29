const wrapper = document.querySelector('.wrapper');
const btnPopup = document.querySelector('.btnTest-Popup');
const iconClose = document.querySelector('.icon-close');
const Link2026 = document.querySelector('.link-2026');
const primeiraQuestao = document.querySelector(".primeiraQuestao");
const primeiroConteudo = document.querySelector(".firstContent");

primeiraQuestao.addEventListener("click", function () {

    if (primeiroConteudo.style.display === "none") {
        primeiroConteudo.style.display = "block";
    } else {
        primeiroConteudo.style.display = "none";
    }

});

btnPopup.addEventListener('click', ()=>{
    wrapper.classList.add('active-popup');
});
iconClose.addEventListener('click', ()=>{
    wrapper.classList.remove('active-popup');
});
Link2026.addEventListener('click', ()=>{
    wrapper.classList.add('link-2026');
});