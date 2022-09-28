import {Address} from "./Address"
class Student extends Address {
    stdId: number = 101;
    stdName: string = "umar";
    stdStandard: string = "Tenth";

    display() {
        super.display();
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdStandard);
    }

}

let s1 = new Student();
s1.display();