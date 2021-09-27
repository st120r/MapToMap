package src.main.java;

import java.util.Scanner;

public class Service {

    private String scan(int num) {
        String s = (num == 1) ? "Name: " : "Phone Number: ";
        System.out.println("Input a " + s);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void scanner() {
        System.out.println("Input a command");
        Scanner in = new Scanner(System.in);

        switch (in.nextLine()) {
            case "Добавить" -> {
                LocalRepoMap.addToPhoneBook(scan(1), scan(2));
            }
            case "Редактировать" -> {
                LocalRepoMap.editPhoneBook(scan(1), scan(2));
            }
            case "Удалить" -> {
                LocalRepoMap.deletePhoneBook(scan(1));
            }
            case "Найти Имя" -> {
                LocalRepoMap.findByName(scan(1));
            }
            case "Найти Номер" -> {
                LocalRepoMap.findByPhoneNumber(scan(2));
            }
            case "показать" -> {
                LocalRepoMap.show();
            }
        }
    }
}
