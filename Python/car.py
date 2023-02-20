class Car:
    id = int
    license = str
    driver = str
    passengenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
