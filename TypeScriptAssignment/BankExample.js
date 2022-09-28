"use strict";
exports.__esModule = true;
exports.BankExample = void 0;
var BankExample = /** @class */ (function () {
    function BankExample(anumber, aname, b) {
        this.accNumber = anumber;
        this.accName = aname;
        this.balance = b;
    }
    BankExample.prototype.display = function () {
        console.log(this.accNumber);
        console.log(this.accName);
        console.log(this.balance);
    };
    return BankExample;
}());
exports.BankExample = BankExample;
var b1 = new BankExample(123, "umar", 234);
b1.display();
