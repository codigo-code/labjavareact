
class Rangeros extends HTMLElement {

    constructor() {
        super();
        this._root = this.attachShadow({ "mode": "open" });
        this._$top = null;
        this._$bottom = null;
    }

    connectedCallback() {
        this.root.innerHTML = `

        <style>
                :host{
                    width: 4.1em;
                    heigh: 1em;
                    display:inline-block;
                    overflow:hidden;
                    user-select:none;
                    vertical-align:middle;
                    box-sizing:boder-box;
                }
        </style>
            <div>
                <div class="top">
                <span>★</span><span>★</span><span>★</span><span>★</span><span>★</span>
                </div>
                <div class="bottom">
                    <span data-value="5">★</span><span data-value="4">★</span><span data-value="3">★</span><span data-value="2">★</span><span data-value="1">★</span>
                </div>
            </div>
        `;
    }
}