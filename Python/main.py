from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS125", Account("Jose Dement", "AMD123"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("QWE234", Account("Maria Ruiz", "ERT423"))
    print(vars(car2))
    print(vars(car2.driver))
