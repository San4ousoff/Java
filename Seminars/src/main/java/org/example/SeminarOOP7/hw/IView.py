import Service

class IView:
    def __init__(self):
        pass

    def print_result(Cat, Dog):
        if Service.age_vs_weight(Cat, Dog) == True:
            print(f"Кот {Cat.nickname} живёт столько же, сколько пёс {Dog.nickname} жрёт!")