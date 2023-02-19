from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "AMS125"
    car.driver = "Jose Dement"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE233"
    car2.driver = "Maria Lamb"
    print(vars(car2))
