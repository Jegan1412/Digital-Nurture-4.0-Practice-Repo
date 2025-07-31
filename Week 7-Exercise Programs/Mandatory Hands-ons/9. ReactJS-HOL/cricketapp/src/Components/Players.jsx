
class Player{
    constructor(name, score, country){
        this.name = name;
        this.score = score;
        this.country = country;
    }
}

export const players = [
    new Player("Jack", 50, "Abroad"),
    new Player("Michael", 70, "Abroad"),
    new Player("John", 40, "Abroad"),
    new Player("Ann", 61, "Abroad"),
    new Player("Elisabeth", 61, "Abroad"),
    new Player("Sachin", 95, "India"),
    new Player("Dhoni", 100, "India"),
    new Player("Virat", 84, "India"),
    new Player("Jadeja", 64, "India"),
    new Player("Raina", 75, "India"),
    new Player("Rohit", 80, "India")
];