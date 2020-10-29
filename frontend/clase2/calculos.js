

class Calculo extends HTMLElement {

    constructor() {
        super();
    }

    suma(num1, num2) {
        console.log(num1 + num2);
    }

    resta(num1, num2) {
        console.log(num1 - num2);
    }
}

class Suma extends Calculo {
    constructor() {
        super();
    }

}

class Resta extends Calculo {
    constructor() {
        super();
    }
}

window.customElements.define('neo-suma', Suma);
window.customElements.define('neo-resta', Resta);
