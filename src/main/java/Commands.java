public class Commands extends Animal{
    private Commands(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }

    public void GO(String name) {
        String s = String.format("%s can GO", name);
        System.out.println(s);
    }

    public void STOP(String name) {
        String s = String.format("%s can STOP", name);
        System.out.println(s);
    }

    public void JUMP(String name) {
        String s = String.format("%s can JUMP", name);
        System.out.println(s);
    }

    public void RUN(String name) {
        String s = String.format("%s can RUN", name);
        System.out.println(s);
    }

    public void VOICE(String name) {
        String s = String.format("%s can VOICE", name);
        System.out.println(s);
    }


}
