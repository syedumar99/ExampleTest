class Bank{

    accNumber:number=786;
    accName:string="Syed";
    balance:number=1000;

    deposit(amt:number):number{
       this.balance = amt + this.balance;
       return this.balance;
    }

    withdraw(amt:number):number{
        this.balance = this.balance - amt;
        return this.balance;

    } display(){
        console.log("Account Name: " + this.accName);
        console.log("Account Number: " + this.accNumber);
        console.log("Account Balance: " + this.balance);
    }

}

let b1 = new Bank();
b1.deposit(1000);
b1.withdraw(500);
b1.display();