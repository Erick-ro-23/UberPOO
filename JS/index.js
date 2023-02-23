console.log("*****Car*****");

var car = new Car("AW456", new Account("Andres Herrera", "NJI789", "adreh12@mail.com", "asdqwe"));
car.passenger = 4;
car.printDataCar();

console.log("*****UberX*****");

var uberX = new UberX("AQR567", new Account("Juan Perez", "NJH121", "juanpe14@mail.com", "qweert"), "Chevrolet", "Spark");
uberX.passenger = 5;
uberX.printDataUberX();

console.log("*****USERS*****");

var user = new User("Juan Perez", "NJH121", "Juanp@mail.com", "dadadad");
user.prinDataUser();

