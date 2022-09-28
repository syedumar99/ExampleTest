var PersonImplement = /** @class */ (function () {
    function PersonImplement() {
    }
    PersonImplement.prototype.getFullName = function () {
        return this.first + this.last;
    };
    return PersonImplement;
}());
var p1 = new PersonImplement();
p1.first = "Syed ";
p1.last = "Umar";
console.log(p1.getFullName());
