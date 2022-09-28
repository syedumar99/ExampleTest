/*function getArray(items: any[]) : any[] {
    return new Array().concat(items); 
}

let myNumArr = getArray([100, 200, 300]);
let myStrArr = getArray(["Hello", "World"]);
myNumArr.push("Hi");
myStrArr.push(500);*/

function getArray1<T>(items: T[]) : T[] {
    return new Array<T>().concat(items);
}

let myNumArr1 = getArray1<number>([100,200,300]);
let myStrArr1 = getArray1<string>(["Hello", "World"]);
myNumArr1.push(400);
myStrArr1.push("HelloTypeScript");
