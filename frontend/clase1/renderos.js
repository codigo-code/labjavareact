class Renderos extends HTMLElement {

    constructor() {
        super();
        this._quotes = [
            "frase1",
            "frase2",
            "frase3"
        ];
        this._$quote = null;
        this._interval = null;

    }

    connectedCallback() {

        this.innerHTML = `
            <div>
                <h1>Random</h1>
                <p><span id="quote"></span></p>
            </div>
        `;
        this._$quote = this.querySelector("#quote");
        // this._interval = setInterval(() => this._render(), 3000);
        this._setInterval(this.getAttribute("interval"));
        this._render();
    }

    _render() {
        if (this._$quote !== null) {
            this._$quote.innerHTML = this._quotes[Math.floor(Math.random() * this._quotes.length)];
        }
    }


    _setInterval(val) {
        if (this._interval !== null) {
            clearInterval(this._interval);
        }
        if (val > 0) {
            this._interval = setInterval(() => this._render(), val);
        }
    }

    // como leer en tiempo de ejecucion una variable

    static get observedAttributes() {
        return ["interval"];
    }

    attributeChangedCallback(name, oldValue, newValue) {
        this._setInterval(newValue);
    }

    disconnectedCallback() {
        clearInterval(this._interval);
    }

}

window.customElements.define('neoris-render', Renderos);