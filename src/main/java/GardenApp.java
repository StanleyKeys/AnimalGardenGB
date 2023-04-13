import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GardenApp {

    List<Animal> petDataBase = createPetDataBase();
    List<Animal> packDataBase = createPackDataBase();
    //List<Animal> allDataBase = createDataBase(petDataBase, packDataBase);


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
        } else {
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

//    protected List<Animal> createDataBase(List<Animal> petDataBase, List<Animal> packDataBase) {
//        List<Animal> dataBase = new ArrayList<>();
//        dataBase.addAll(petDataBase);
//        dataBase.addAll(packDataBase);
//        return dataBase;
//    }

    public void showAllAnimals() {                          // 1. Показать всех животных
        for (Animal animal : petDataBase) {
            System.out.println(animal.getInfo());

        }
        for (Animal animal : packDataBase) {
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
        System.out.println(
                """
                        Какое животное вы хотите добавить?\s
                        1. Домашнее\s
                        2. Вьючное\s
                        3. Главное меню\s
                        """
        );
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine().toLowerCase();
        switch (result) {
            case "1", "домашнее" -> {
                System.out.println(
                        "Разновидность: \n" +
                                "1. Кошка" +
                                "2. Собака" +
                                "3. Хомяк" +
                                "4. Назад"
                );

                String variety = sc.nextLine().toLowerCase();
                String[] petArray = addPetSystem();

                switch (variety) {
                    case "1" -> {
                        Cat cat1 = new Cat(petArray[0], petArray[1], petArray[2]);
                        petDataBase.add(cat1);
                        System.out.println("Животное успешно добавлено.");
                        mainMenu();
                    }
                    case "2" -> {
                        Dog dog1 = new Dog(petArray[0], petArray[1], petArray[2]);
                        petDataBase.add(dog1);
                        System.out.println("Животное успешно добавлено.");
                        mainMenu();
                    }
                    case "3" -> {
                        Hamster hamster1 = new Hamster(petArray[0], petArray[1], petArray[2]);
                        petDataBase.add(hamster1);
                        System.out.println("Животное успешно добавлено.");
                        mainMenu();
                    }
                    default -> addAnimal();
                }
                break;
            }
            case "2", "вьючное" -> {
                System.out.println(
                        "Разновидность: \n" +
                                "1. Лошадь" +
                                "2. Верблюд" +
                                "3. Осел" +
                                "4. Назад"
                );
                String variety = sc.nextLine().toLowerCase();
                String[] petArray = addPackSystem();

                switch (variety) {
                    case "1" -> {
                        Horse horse1 = new Horse(petArray[0], petArray[1], petArray[2], petArray[3], parseInt(petArray[4]));
                        packDataBase.add(horse1);
                        System.out.println("Животное успешно добавлено.");
                        mainMenu();
                    }
                    case "2" -> {
                        Camel camel1 = new Camel(petArray[0], petArray[1], petArray[2], petArray[3], parseInt(petArray[4]));
                        packDataBase.add(camel1);
                        System.out.println("Животное успешно добавлено.");
                        mainMenu();
                    }
                    case "3" -> {
                        Donkey donkey1 = new Donkey(petArray[0], petArray[1], petArray[2], petArray[3], parseInt(petArray[4]));
                        packDataBase.add(donkey1);
                        System.out.println("Животное успешно добавлено.");
                        mainMenu();
                    }
                    default -> addAnimal();
                }
                break;
            }
            case "3", "exit" -> mainMenu();
            default -> {
                System.out.println("Необходимо выбрать пункт меню\n");
                addAnimal();
            }
        }
        }


    public String[] addPetSystem() {
        String[] petArray = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the pet name: \n");
        String name = sc.nextLine();
        petArray[0] = name;
        System.out.println("Input the Birth Date in format DD.MM.YYYY: \n");
        String birthDate = sc.nextLine();
        petArray[1] = birthDate;
        System.out.println("Input the name of Master: \n");
        String masterName = sc.nextLine();
        petArray[2] = masterName;
        return petArray;
    }

    public String[] addPackSystem() {
        String[] petArray = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the pet name: \n");
        String name = sc.nextLine();
        petArray[0] = name;
        System.out.println("Input the Birth Date in format DD.MM.YYYY: \n");
        String birthDate = sc.nextLine();
        petArray[1] = birthDate;
        System.out.println("Is Pack Animal has hoofs [y/n] ?: \n");
        String hoofs = sc.nextLine();
        petArray[2] = hoofs;
        System.out.println("Is Pack Animal has hump [y/n] ?: \n");
        String hump = sc.nextLine();
        petArray[3] = hump;
        System.out.println("Load Capacity ?: \n");
        String loadCapacity = sc.nextLine();
        petArray[4] = loadCapacity;
        return petArray;
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


