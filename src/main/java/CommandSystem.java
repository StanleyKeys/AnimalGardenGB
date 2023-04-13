public class CommandSystem {

    public CommandSystem() {

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

    public void addCommand(String name, String commandName) {
        String s = String.format("%s can %s", name, commandName);
    }


}
