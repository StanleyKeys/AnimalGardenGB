import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GardenApp {

    List<Animal> petDataBase = createPetDataBase();
    List<Animal> packDataBase = createPackDataBase();
    List<Animal> allDataBase = createDataBase(petDataBase, packDataBase);



    public static void main(String[] args) {
        GardenApp ga = new GardenApp();
        ga.mainMenu();
    }

    public static void showInfo(String s) {
        System.out.println(s);
    }



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
                        9. Выход\s
                        """
        );
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        if (userNumber == 1) {
            showAllAnimals();
        } else if (userNumber == 2) {
            showPetAnimals();
        } else if (userNumber == 3) {
            showPackAnimals();
        } else if (userNumber == 4) {
            addAnimal();
        } else if (userNumber == 5) {
            deleteAnimal();
        } else if (userNumber == 6) {
            addCommand();
        } else if (userNumber == 7) {
            sayCommand();
        } else if (userNumber == 8) {
            showAllCommands();
        } else if (userNumber == 9) {
            System.exit(0);
        }
        else {
            System.out.println("Необходимо выбрать пункт меню. Попробуйте снова. \n");
            mainMenu();
        }

    }
    public void TODO() {
        System.out.println("- = This feature is under development = -");
    }

    protected List<Animal> createPetDataBase() {               // Создание БД животных
        List<Animal> dataBase = new ArrayList<>();
        Cat cat1 = new Cat("Kitty", "01.01.2001", "John");
        Dog dog1 = new Dog("Buddy", "20.10.2000", "James");
        dataBase.add(cat1);
        dataBase.add(dog1);
        return dataBase;
    }

    protected List<Animal> createPackDataBase() {               // Создание БД животных
        List<Animal> dataBase = new ArrayList<>();
        Horse horse1 = new Horse("Mustang", "01.01.2001", "yes", "no", 100);
        Donkey donkey1 = new Donkey("Mul", "20.10.2000", "yes", "no", 250);
        dataBase.add(horse1);
        dataBase.add(donkey1);
        return dataBase;
    }

    protected List<Animal> createDataBase(List<Animal> petDataBase, List<Animal> packDataBase) {
        List<Animal> dataBase = new ArrayList<>();
        dataBase.addAll(petDataBase);
        dataBase.addAll(packDataBase);
        return dataBase;
    }

    public void showAllAnimals() {                          // 1. Показать всех животных
        for (Animal animal : allDataBase) {
            System.out.println(animal.getInfo());
            System.out.println(" ");
        }
        mainMenu();
    }

    public void showPetAnimals() {                          // 2. Показать домашних животных
        for (Animal animal : petDataBase) {
            System.out.println(animal.getInfo());
            System.out.println(" ");
        }
        mainMenu();
    }

    public void showPackAnimals() {                         // 3. Показать вьючных животных
        for (Animal animal : packDataBase) {
            System.out.println(animal.getInfo());
            System.out.println(" ");
        }
        mainMenu();
    }

    public void addAnimal() {                               // 4. Добавить животное
        TODO();
    }

    public void deleteAnimal() {                            // 5. Удалить животное
        TODO();
    }


    public void addCommand() {                              // 6. Добавить команду
        CommandSystem cs = new CommandSystem();
        cs.addCommand();
        mainMenu();
    }

    public void sayCommand() {                              // 7. Сказать команду
        TODO();
    }
    public void showAllCommands() {
        CommandSystem cs = new CommandSystem();             // 8. Показать все команды
        cs.showAllCommands();
        mainMenu();
    }

}
