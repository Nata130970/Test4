package by.si;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Test2();

    }
    private static void Test1() {

        User[] users = new User[5];
        int mode;
        String name = "";
        String surName = "";
        String profession = "";
        int age = 0;
        int salary = 0;
        String[] tableMode = {
                "1. Введите имя  ",
                "2. Введите фамилию ",
                "3. Введите должность ",
                "4. Оклад ",
                "5. Введите возраст ",
                "6. Сохранить информацию ",
                "7. Просмотр всей информации ",
                "8. Выход "
        };

        Scanner scanner = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        do {
            for (String table : tableMode) {
                System.out.println(table);
            }
            System.out.print("Выберите режим: ");
            mode = scanner.nextInt();
            switch (mode) {
                case 1:
                    System.out.print("Введите имя: ");
                    name = scanLine.nextLine();
                    break;
                case 2:
                    System.out.print("Введите фамилию: ");
                    surName = scanLine.nextLine();
                    break;
                case 3:
                    System.out.print("Введите должность: ");
                    profession = scanLine.nextLine();
                    break;
                case 4:
                    System.out.print("Введите оклад: ");
                    salary = scanner.nextInt();

                    break;
                case 5:
                    System.out.print("Введите возраст: ");
                    age = scanner.nextInt();
                    break;
                case 6:
                    System.out.print("Задайте номер записи от 1 до 5: ");
                    int count = scanner.nextInt();
                    if (count > 5 || count < 1) {
                        System.out.println("Ошибка номера записи !!!! \nДля продолжения нажмите Enter");
                        scanLine.nextLine();
                        break;
                    }
                    users[count - 1] = new User(name, surName, profession, age, salary);
                    break;
                case 7:
                    System.out.println("Информация о пользователях: ");
                    int i = 0;
                    for (User u : users) {
                        if (u != null) {
                            System.out.println(u.getSurName() + " " + u.getName() + " " + u.professional + " " +
                                    " " + u.year() + " " + u.salary);
                            i++;
                        }
                    }
                    if (i == 0) System.out.println(" Список пользователей пуст \n");
                    System.out.println(" Для продолжения нажмите Enter");
                    scanLine.nextLine();
                    break;
                case 8:
                    break;
                default:
                    System.out.println(" **** Ошибка выбора режима !!! **** ");
                    break;
            }
        } while (mode != 8);

    }
    private static void Test2() {
        User[] users = new User[5];
        Scanner scanner = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);

        int mode;
        String name = "";
        String surName = "";
        int age = 0;
        for (int i = 0; i < users.length; i++  ){
            System.out.print("Введите имя: ");
            users[i] = new User();
            users[i].setName(scanLine.nextLine());
            System.out.print("Введите фамилию: ");
            users[i].setSurName(scanLine.nextLine());
            System.out.print("Введите возраст: ");
            users[i].age= scanner.nextInt();
        }
        int i = 0;
        for (User u : users) {
            if (u != null) {
                System.out.println(u.getSurName() + " " + u.getName() + " "  + u.year() );
                i++;
            }
        }

    }



}


