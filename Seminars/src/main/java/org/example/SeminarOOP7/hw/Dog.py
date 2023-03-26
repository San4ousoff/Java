from Animal import Animal


class Dog(Animal):
    def __init__(self, nickname, weight,):
        super().__init__(nickname)
        self._weight = weight

    @property
    def weight(self):
        return self._weight

    @weight.setter
    def weight(self, new_weight):
        self._weight = new_weight

    def __str__(self) -> str:
        return f"{self.nickname} {self._weight}"