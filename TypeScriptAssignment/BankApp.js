var BankApp = /** @class */ (function () {
    function BankApp() {
        this.a = 10;
        this.b = 20;
    }
    BankApp.prototype.add = function () {
        console.log(this.a + this.b);
    };
    return BankApp;
}());
var x = new BankApp();
x.add();
