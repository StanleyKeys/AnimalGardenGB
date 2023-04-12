import java.util.Scanner;

public class AppSystem {

    public void mainMenu() {
        System.out.println(
                """
                        Выберите пункт меню:\s
                        1. Показать всех животных\s
                        2. Показать всех домашних\s
                        3. Показать всех вьючных\s
                        4. Добавить животное\s
                        5. Удалить животное\s
                        6. Добавить команду\s
                        7. Сказать команду\s
                        8. Показать все команды\s
                        """
        );
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        if (userNumber == 1) {
            TODO();
        } else if (userNumber == 2) {
            TODO();
        } else if (userNumber == 3) {
            TODO();
        } else if (userNumber == 4) {
            TODO();
        } else if (userNumber == 5) {
            TODO();
        } else if (userNumber == 6) {
            TODO();
        } else if (userNumber == 7) {
            TODO();
        } else if (userNumber == 8) {
            TODO();
        } else {
            System.out.println("Необходимо выбрать пункт меню. Попробуйте снова. \n");
            mainMenu();
        }

    }

    public void TODO() {
        System.out.println("");
    }
}
