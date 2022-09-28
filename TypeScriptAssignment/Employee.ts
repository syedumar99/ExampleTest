import {Dept} from "./Dept"
class Employee extends Dept {
    id: number = 786;
    name:string = "umar"
    sal:number = 789999;

    display() {
        super.display();
        console.log(this.id);
        console.log(this.name);
        console.log(this.sal);
    }

}

let e1 = new Employee();
e1.display();