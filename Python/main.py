from car import Car
from account import Account
from user import User
from uberX import UberX


if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS125", "Jose Dement", "AMD123",
              "josedeme@mail.com", "dasdadsss")
    print(vars(car))
    print(vars(car.name))

    uberX = UberX("ASE23", Account("Maria Ruiz", "ERT423", "mariar34@.mail.com", "dadadww"),
                  "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))

    user = User("Pepito perez", "12dffs", "pepito123@mail.com", "123123")
    print(vars(user))
