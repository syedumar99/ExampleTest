interface PersonInterface {
    first: string;
    last: string;
    getFullName(): string;
}

class PersonImplement implements PersonInterface {
    first: string;
    last: string;

    getFullName(): string {
        return this.first + this.last;
    }
}

let p1 = new PersonImplement();
p1.first = "Syed ";
p1.last = "Umar";
console.log(p1.getFullName());