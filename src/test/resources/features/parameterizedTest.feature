#language:ru
#encoding:UTF-8

@test
Функционал: Параметризированный запуск тестов

  Структура сценария: Проверка цены гаджета <gadgetName>
    Допустим открыта страница "https://www.demoblaze.com/"
    И выполнено нажатие на ссылку "<gadgetName>"
    Тогда цена гаджента равна "<gadgetPrice>"

    Примеры:
      | gadgetName        | gadgetPrice |
      | Samsung galaxy s6 | $360        |
      | Nokia lumia 1520  | $820        |
      | Iphone 6 32gb     | $790        |
