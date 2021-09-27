package src.main.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("""
                              Команда "Добавить" и введённые после неё имя и номер телефона будут добавлять новую запись в список.
                              Команда "Редактировать" и имя человека после неё, будут изменять номер телефона этого человека.
                              Команда "Удалить" и имя человека после неё, будут удалять выбранное имя человека из списка.
                              Команда "Найти Имя" найдет запись с именем человека.
                              Команда "Найти Номер" найдет запись с номером человека.
                """);
        Service service = new Service();
        while (true) {
            service.scanner();
        }
    }
}
