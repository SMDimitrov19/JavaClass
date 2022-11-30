public class Dog extends Mammal {
    private String breed;
    public Dog(int age,double weight, String breed) {
        super(age,weight);
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog is waiting...");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking on 4 legs");
    }
    public String toString()
    {
        return super.age+" "+weight+" "+breed;
    }
}
