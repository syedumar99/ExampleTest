/*function getArray(items: any[]) : any[] {
    return new Array().concat(items);
}

let myNumArr = getArray([100, 200, 300]);
let myStrArr = getArray(["Hello", "World"]);
myNumArr.push("Hi");
myStrArr.push(500);*/
function getArray1(items) {
    return new Array().concat(items);
}
var myNumArr1 = getArray1([100, 200, 300]);
var myStrArr1 = getArray1(["Hello", "World"]);
myNumArr1.push(400);
myStrArr1.push("HelloTypeScript");
