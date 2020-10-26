
class Multiplicar extends HTMLElement{

    constructor(){
        super();
        
    }
    multiplico(num){
        console.log(num*10);
    }
}


class Dividir extends Multiplicar{
    constructor(){
        super();

    }

    divido(num){
        console.log(num/10);
        document.querySelector('neo-divi').innerHTML= "<p> " +num/10 +"</p>";
    }
}

window.customElements.define('neo-multi',Multiplicar);
window.customElements.define('neo-divi',Dividir);