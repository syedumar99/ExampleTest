"use strict";
exports.__esModule = true;
exports.Address = void 0;
var Address = /** @class */ (function () {
    function Address() {
        this.streetName = "Chord Street";
        this.city = "Bengaluru";
        this.state = "Karnataka";
    }
    Address.prototype.display = function () {
        console.log(this.streetName);
        console.log(this.city);
        console.log(this.state);
    };
    return Address;
}());
exports.Address = Address;
