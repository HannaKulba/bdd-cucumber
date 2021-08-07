#language:ru
#encoding:UTF-8

  @test @google
  Функционал: Проверка поиска информации в Google

    Сценарий: Проверка, что первая ссылка в Google по запросу senla, ведет на сайт https://senlainc.com
      Допустим открыта страница "https://www.google.com/"
      И в строку поиска введено значение "senla"
      И нажата кнопка "Поиск в Google"
      Тогда первая ссылка называется "SENLA | Custom Software Development Company"
      И выполнено нажатие на ссылку "SENLA | Custom Software Development Company"
      И открыт сайт "https://senlainc.com/"