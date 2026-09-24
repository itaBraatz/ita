const wrapper = document.querySelector('.wrapper');
const btnPopup = document.querySelector('.btnTest-Popup');
const iconClose = document.querySelector('.icon-close');
const Link2026 = document.querySelector('.link-2026');

btnPopup.addEventListener('click', ()=>{
    wrapper.classList.add('active-popup');
});
iconClose.addEventListener('click', ()=>{
    wrapper.classList.remove('active-popup');
});
Link2026.addEventListener('click', ()=>{
    wrapper.classList.add('link-2026');
});