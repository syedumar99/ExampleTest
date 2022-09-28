export class Address {

    streetName: string = "Chord Street";
    city:string = "Bengaluru";
    state:string = "Karnataka";


    display() {
        console.log(this.streetName);
        console.log(this.city);
        console.log(this.state);
    }
}