var car = new Car("AW456", new Account("Andres Herrera", "NJI789"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AQR567", new Account("Juan Perez", "NJH121"), "Chevrolet", "Spark");
uberX.passenger = 5;
uberX.printDataCar();

console.log("*****USERS*****");

var user = new User("Juan Perez", "NJH121", "Juanp@mail.com", "dadadad");
user.prinDataUser();

