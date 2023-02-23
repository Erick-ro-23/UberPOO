from car import Car


class UberX(Car):
    brand = str
    model = str

    def __init__(self, license, name, document, email, password, brand, model):
        super.__init__(license, name, document, email, password)
        self.brand = brand
        self.model = model
