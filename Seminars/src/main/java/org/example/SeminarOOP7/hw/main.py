from Vet_service import *
from Service import *

cat1 = Cat('Барсик', 5)
dog1 = Dog('Шарик', 5)

list_animal = Vet_service()
list_animal.add_animal(cat1)
list_animal.add_animal(dog1)

if Service.age_vs_weight(cat1, dog1) == True:
    print(f"Кот {cat1.nickname} живёт столько же, сколько пёс {dog1.nickname} жрёт!")
