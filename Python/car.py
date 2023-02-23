# from driver import Driver
from account import Account


class Car(Account):
    id = int
    license = str
    driver = Account
    passengenger = int

    def __init__(self, license, driver):
        # super().__init__(name, document, email, password)
        self.license = license
        self.driver = driver
