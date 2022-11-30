public abstract class Mammal implements Animal{
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
