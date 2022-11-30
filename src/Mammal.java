public abstract class Mammal implements Animal{
    protected int age;
    protected double weight;

    public Mammal(int age,double weight)
    {
        this.age=age;
        this.weight=weight;
    }
    public void setFieldsInMammal(int age,double weight)
    {
        this.age=age;
        this.weight=weight;
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public abstract void walk();

    //public abstract void eat();
    @Override
    public void test()
    {
        System.out.println("Testing...");
    }
}
