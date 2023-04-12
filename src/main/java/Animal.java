import java.util.Random;

public abstract class Animal {
    int id = 0;
    int amount;
    String name;
    String dateOfBirth;
    int legs;

    private void getLegsAndAmount () {
        Random r = new Random();
        this.legs = r.nextInt(1, 4);
        this.amount = r.nextInt(1, 5);


    }
    public Animal(String name, String dateOfBirth) {
        this.id += 1;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        getLegsAndAmount();
    }

    public String getInfo() {
        return String.format("ID: %d, Name: %s  BirthDate: %s  Legs: %d, Amount: %d",
                this.id, this.name, this.dateOfBirth, this.legs, this.amount);
    }


}
