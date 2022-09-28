var Bank = /** @class */ (function () {
    function Bank() {
        this.accNumber = 786;
        this.accName = "Syed";
        this.balance = 1000;
    }
    Bank.prototype.deposit = function (amt) {
        this.balance = amt + this.balance;
        return this.balance;
    };
    Bank.prototype.withdraw = function (amt) {
        this.balance = this.balance - amt;
        return this.balance;
    };
    Bank.prototype.display = function () {
        console.log("Account Name: " + this.accName);
        console.log("Account Number: " + this.accNumber);
        console.log("Account Balance: " + this.balance);
    };
    return Bank;
}());
var b1 = new Bank();
b1.deposit(1000);
b1.withdraw(500);
b1.display();
