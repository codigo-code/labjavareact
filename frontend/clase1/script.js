// creamos el elemento template
const tmp = document.createElement('template');



// definimos el innerHtml --> donde le agregamos los elementos 
// aqui adentro definimos todos los elementos que interacturan 
tmp.innerHTML = `
    <div>
        <input type="text" placeholder="ingrese texto" /> <br />
        <label miPropiedad=""  />
    </div>    
`;

// definimos la clase 
class MiElemento extends HTMLElement {


    constructor() {
        super();
        console.log('Constructor');

        this._shadowRoot = this.attachShadow({ 'mode': 'open' });
        this._shadowRoot.appendChild(tmp.content.cloneNode(true));
        this.lbl = this._shadowRoot.querySelector('[miPropiedad]')
        this.inp = this._shadowRoot.querySelector('input');
        this.inp.addEventListener('input', () => {
            this.lbl.innerHTML = this.inp.value
        })

    }

    static get observedAttributes(){
        return ["demo"];
    }

    connectedCallback() {
        console.log("conected");
    }

    disconnectedCallback() {
        console.log("disconected");
    }

    attributeChangedCallback(name, oldValue, newValue) {
        console.log('cambios', name, oldValue, newValue)
    }

    
}

// para crear el elemento y mostrarlo en la pagina html
window.customElements.define('neo-input', MiElemento);