class BankApp {
    a: number = 10;
    b: number = 20;

    add() {
        console.log(this.a + this.b);
    }
}

let x = new BankApp();
x.add();