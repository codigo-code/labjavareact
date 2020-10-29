

class Render extends HTMLElement {


    constructor() {
        super();
        this._frases = [
            "Una frase cualquiera",
            "Otra cosa que no se me ocurre",
            "Hola mundo",
            "hola neoris",
            "este es el lab de front",
            "algo mas ya son las 7 dante copate y larganos!"
        ]

    }

    // utilizaremos este metodo del ciclo de vida del htmlElement para evitarnos los templates
    connectedCallback() {
        // this.innerHTML --> editamos el elemento <neo-render>
        this.innerHTML = `<h1> Me Render personal</h1>
            <span id="frase"></span>
        `
        console.log('Se conecto el connectedCallback()');
        this._$elemntofrase = document.querySelector("#frase");
        setInterval(() => this._render(), 1000);


        // # id
        // . class
        // si no le ponen nada es el elemento ejmplo querySelector("span") ---> <span>
        // "[atributo]"   atributo="algo" 


    }

    _render() {
        if (this._$elemntofrase !== null) {
            this._$elemntofrase.innerHTML = this._frases[Math.floor(Math.random() * this._frases.length)]
        }
    }


    disconnectedCallback() {
        
        console.log("chauuu mataron al elemento :( ");
    }
}


window.customElements.define('neo-render', Render);