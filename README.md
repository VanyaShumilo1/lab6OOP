# Blackjack Game

Це консольна гра в Блекджек на мові програмування Java. Гра використовує стандартну колоду з 52 гральних карт.

## Правила гри

1. Мета гри - набрати більше очок, ніж дилер, але не перевищувати 21 очко. Якщо набрати більше 21, то гравець програє.

2. Очки на картках рахуються так:
    - Картки "2" до "10" відповідають своїм числовим значенням (2-10 очок відповідно).
    - Картки "J", "Q" та "K" приносять по 10 очок кожна.
    - Картка "A" може бути 1 або 11 очок, залежно від ситуації.

3. Гра починається з роздачі двох карт гравцю та двох карт дилеру. Одна з карт дилера лише частково видима.

4. Гравцеві дається можливість брати ще карти ("hit") або припиняти брати картки ("stand").

5. Дилер бере карти автоматично до тих пір, поки його сума очок не стане більше або рівно 17.

6. Після закінчення обох турів, визначається переможець. Гравець перемагає, якщо його сума очок більша за суму очок дилера і не перевищує 21.

## Використання гри

1. Запустіть гру, виконавши файл `Main.java`.

2. Гра виводить інструкції для гравця та пропонує робити вибори.

3. Гравець вводить "h" для взяття додаткової карти ("hit") або "s" для припинення прийому карток ("stand").

4. Після закінчення гри, результат виводиться на екран.



