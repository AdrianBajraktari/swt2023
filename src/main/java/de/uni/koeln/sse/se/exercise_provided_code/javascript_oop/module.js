let swt = {
    modulename: "Software Engineering",
    getFullDescription: function() {
        return `Module name: ${this.modulename}`;
    }
};

let inf2 = {
    __proto__: swt,
    modulename: "Informatik II"
};

console.log(inf2.getFullDescription()); //Prints: "Module name: Informatik II"
console.log(swt.getFullDescription()); //Prints: "Module name: Software Engineering"
