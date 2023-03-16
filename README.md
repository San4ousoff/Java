# JAVA


## Описание и структура

В репозитории размещены материалы лекций и семинаров по языку программирования Java.
1. Лекционные материалы размещаются в соответствующих папках Lecture.
2. Материалы из семинаров размещены в соответствующих папках Seminar.
3. Домашние задания находятся в папках hwN (где N - номер задания по порядку) в соответствующих папках Seminar. Каждый файл содержит условие задания и его решение.
4. Часто используемые методы вынесены в файл Lib.java.

### Домашнее задание к Семинару №1
> 1. https://leetcode.com/problems/reverse-words-in-a-string/
> 
>Учитывая входную строку s, измените порядок слов на противоположный.
Слово определяется как последовательность не пробельных символов. Слова в s будут разделены хотя бы одним пробелом.
Возвращает строку слов в обратном порядке, объединенных одним пробелом.
Обратите внимание , что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.
> - Пример:
>
>   Input: s = "  hello   world  "
>
>   Output: "world hello"

> 2. Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует
отрицательное число.
> - Пример:
> 
>   Input: 1 2 1 2 -1 1 3 1 3 -1 0
>
>   Output: 5

### Домашнее задание к Семинару №2
> 1. Дана последовательность N целых чисел. Найти сумму простых чисел.

> 2. Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

> 3. Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

### Домашнее задание к Семинару №3
> 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».

> 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.

> 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

### Домашнее задание к Семинару №4
> 1. Вывести список на экран в перевернутом виде (без массивов и ArrayList).
> - Пример:
>
>   Input: 1-> 2-> 3-> 4
>
>   Output: 4-> 3-> 2-> 1

> 2. Valid Parentheses. https://leetcode.com/problems/valid-parentheses/

### Домашнее задание к Семинару №5
> 1. Подсчитать количество вхождений каждого слова.
> - Строка для примера: Россия идет вперед всей планеты. Планета — это не Россия.
>
>   P.S.: исп. toLoverCase()


> 2. Подсчитать количество вхождений искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)

### Домашнее задание к Семинару №6

> Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

____
# ООП

### Домашнее задание к Семинару №1
1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

### Домашнее задание к Семинару №2
1. Рефакторинг любого из дз с курса по java с учетом принципов ООП

### Домашнее задание к Семинару №3
1. Добавить Comparable и/или Comparator к приложению, написанному на семинаре (Файлы прикреплены под уроком)

### Домашнее задание к Семинару №4
1. Взять за основу первое дз и добавить параметризацию (Создать единый вендинговый аппарат)
* Если по каким - то причинам первое дз не выполнено, классы с первого вебинара прикрепленны к этому уроку

> ВАЖНО!
Если используете интерфейсы, то нужно реализовывать именно их методы, а не писать собственные с тем же именем