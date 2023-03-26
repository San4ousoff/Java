from Animal import Animal

class Cat(Animal):
    def __init__(self, nickname, age):
        super().__init__(nickname)
        self._age = age

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, new_age):
        self._age = new_age

    def __str__(self) -> str:
        return f"{self.nickname} {self._age}"