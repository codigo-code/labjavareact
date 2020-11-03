const tpl = document.createElement('template');

tpl.innerHTML = `<input type="text" id="idInput" placeholder="ingrese valores" />
                <br/>
                <label dolar="valor inicial" />
                <button id="pepito">Press!!! </button>
                <div id="nuevo"></div>
        `;


class CicloVida extends HTMLElement {


    constructor() {
        super();

        this._root = this.attachShadow({ 'mode': 'open' });
        this._root.appendChild(tpl.content.cloneNode(true));
        this.dolarObj = this._root.querySelector('[dolar]');
        this.btn = this._root.querySelector("#pepito");
        this.input = this._root.querySelector("#idInput");
        this.div = this._root.querySelector("#nuevo");

        this.btn.addEventListener('click', () => {
            console.log(this.dolarObj);
        });


    }


    static get observedAttributes() {

        return ["dolar"];
    }


    attributeChangedCallback(name, oldValue, newValue) {

        console.log("cambio ---> ", name, oldValue, newValue);
        if (newValue !== "") {
            var obj = JSON.parse(newValue);
            
                this.div.innerHTML += `<b>nombre:</b>  ${obj.name} <br/> 
                                  <b>altura:</b>  ${obj.height} <br/> 
                                  <b>color de pelo:</b>  ${obj.hair_color} <br/>
            ` 
                
        }
    }

    algo() {

        console.log(obj);
    }

}

window.customElements.define('neo-cliclo', CicloVida);