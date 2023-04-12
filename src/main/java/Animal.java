import java.util.Random;

public abstract class Animal {

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
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        getLegsAndAmount();
    }

    public String getInfo() {
        return String.format("Name: %s \nBirthDate: %s \nLegs: %d \nAmount: %d",
                this.name, this.dateOfBirth, this.legs, this.amount);
    }


}
