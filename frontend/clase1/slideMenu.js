

class SlideMenu extends HTMLElement{

    constructor(){
        super();
        this._root=this.attachShadow({"mode":"open"});
        this._$frame=null;
        this._open=null;
    }

    connectedCallback(){
        this._root.innerHTML=`

        <style>
        .frame{
            position:fixed;
            top:0;
            bottom:0;
            width:100%
            overflow:hidden:
            pointer-events:none;
            z-index:1000;
            transition: background-color 300mx ease-in;
        }

        .container {
            width:80%;
            max-width:400px;
            background:#FFF;
            height:100%;
            transform: translateX(-100%);
            will-change:transform;
            transition:transform 300ms ease-in;
            box-shadow(1px 0 3px black;
        }

        .title{
            display:flex;
            flex-direction:row;
            min-height:3.2em;
            font-size:1.5em;
            background-color: #F1F1F1;
            color:#444;
        }
        .title .title-content { 
            flex-grow:1;
            display:flex;
            align-items:center;
            padding-left:1em;
        
        
        }
        
        .close {
            flex-basis:100px;
            flex-grow:0;
            flex-shrink:0;
            cursor: pointer;
            display: flex;
            justifi-context:center;
            align-content:center;
            user-select:none
        }
        .frame.open{
            pointer-events: auto;
            background-color: red;
        }
        
        .frame.open .container{
            transform:none;
        }
        </style>

            <div class="frame">
                <nav class="container">
                    <div class="title">
                        <div class="title-content">
                            Menu
                        </div>
                        <a class="close">X</a>
                    </div>
                    <div class="content">
                        <a href="#">link1</a>
                    </div>
                </nav>
            </div>
        `;
    }
}

window.customElements.define('slide-menu',SlideMenu);