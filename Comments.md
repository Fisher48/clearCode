Задание 3.1. 
1. `// Высадка десанта и захват первых точек.` 
for (int i = 0; i <= L * 2 - 1; i += 2) { square[battalion[i] - 1][battalion[i + 1] - 1] = 1; } В данном месте задания по Захвату карты десантниками, сложно сразу понять, что делает этот цикл, поэтому комментарий здесь уместен.
2.	`// Перерождение дерева.`
while (years < N) { …. } Указал данный комментарий, для указания того, что делает цикл while. 
3.	Также добавил комментарий в treeDigitArray[k][z] += 1; `// Ветки стареют на год`, для понимания, зачем мы прибавляем везде 1.
4.	`// Проверяем, можно ли удалить одну букву, чтобы условие задачи выполнялось.`
for (int i = 0; i < numberOfChars.length; i++) { numberOfChars[i] -= 1; ….} Указал данный комментарий для того, чтобы легче воспринималось что делается данным циклом. 
5.	`// Объединить кол-во проданных штук у одинаковых товаров.` 
while (countOfItems < N - 1) {…} В задании с автоматизацией отчетности о продажах, указал данный комментарий, он облегчает понимание, что делается в данном цикле.
6.	`// Расположить по количеству продаж или в лексикографическом порядке.` 
for (int i = 0; i < groupedSalesSummary.length; i++) { … } В последнем цикле того же самого задания, указал данный комментарий, чтобы было понятно, что происходит в последнем цикле учитывая большее количество операций.
7.	`// Изменяем на обратный порядок, двигаясь к центру (влево и вправо).` 
В задании про Футбол и возможностью упорядочить массив по возрастанию с помощью однократного применения одного из двух приёмов: во втором методе second, добавил комментарии для каждого цикла, с пояснением в какую сторону идет обработка и изменения на обратный порядок произвольной последовательной цепочки элементов.

Задание 3.2. 

Я старался не делать комментарии), потому что, в Правилах подготовки кода для автоматической проверки была дана рекомендация: «Не рекомендуется писать в коде комментарии на кириллице: при перекодировке с гитхаба на сервер могут возникнуть нечитаемые символы, что приводит к синтаксическим ошибкам.»
