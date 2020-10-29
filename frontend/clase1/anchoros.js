

class Anchoros extends HTMLAnchorElement {
    constructor() {
        super();
    }
    connectedCallback() {
        this.addEventListener('click', e => {
            e.preventDefault();
            const result = confirm('estas seguro que queres ir?');

            if(result){
                window.location.href=e.target.href;
            }
         });
    }
}

window.customElements.define('custom-anchoros',Anchoros,{extends:'a'});