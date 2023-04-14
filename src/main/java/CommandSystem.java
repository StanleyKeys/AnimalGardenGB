import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandSystem {
    //GardenApp ga = new GardenApp();
    //subMenu sm = new subMenu();

    List<String> commandList = new ArrayList<>();

    public CommandSystem() {
        commandList.add("GO");
        commandList.add("STOP");
        commandList.add("JUMP");
        commandList.add("RUN");
        commandList.add("VOICE");
    }


    public String GO(String name) {
        return String.format("%s can GO", name);
    }

    public String STOP(String name) {
        return String.format("%s can STOP", name);
    }

    public String JUMP(String name) {
        return String.format("%s can JUMP", name);
    }

    public String RUN(String name) {
        return String.format("%s can RUN", name);
    }

    public String VOICE(String name) {
        return String.format("%s can VOICE", name);
    }

    public String USERCOMMAND(String name, String userCommand) {
        return String.format("%s can %s", name, userCommand);
    }

    public void addCommand() {
        System.out.println("Input your command: ");
        Scanner sc = new Scanner(System.in);
        String newCommand = sc.nextLine();
        commandList.add(newCommand);                // Добавляем новую команду в список.
        String result = String.format("\nThe command %s is successfuly added to Command List\n", newCommand);
        System.out.println(result);

        //showMainMenu();                            // возращаемся в главное меню.
    }

    public void showMainMenu() {
        System.out.println("Вернуться в главное меню? \n");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        if (result.equals("1") || result.equals("yes")) {
            GardenApp ga = new GardenApp();
            ga.mainMenu();
        } else if (result.equals("2") || result.equals("no") || result.equals("exit")) {
            System.exit(0);

        } else {
            System.out.println("Choose the answer, please \n");
            showMainMenu();
        }

    }

    public void showAllCommands() {
        System.out.println("The command list : \n");
        int counter = 1;
        for (String s : commandList) {
            String temp = String.format("%d. %s ", counter, s);
            System.out.println(temp);
            counter += 1;

        }
        System.out.println(" ");
        //showMainMenu();
    }

}
