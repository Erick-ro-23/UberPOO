from driver import Driver


class Car(Driver):
    id = int
    license = str
    # driver = str
    passengenger = int

    def __init__(self, license, name, document, email, password):
        super().__init__(name, document, email, password)
        self.license = license
        # self.driver = driver
