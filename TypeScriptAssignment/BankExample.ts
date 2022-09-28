export class BankExample {
    accNumber: number;
    accName: string;
    balance: number;

    constructor(anumber: number, aname:string, b:number) {
        this.accNumber = anumber;
        this.accName = aname;
        this.balance = b;
    }

    display():void {
        console.log(this.accNumber);
        console.log(this.accName);
        console.log(this.balance);
    }
}

let b1 = new BankExample(123, "umar",234);
b1.display();