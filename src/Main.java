import java.util.*;
public class Main {
    Car car=new Cars("Leon","gray",110,"Spain");
    public void main(String[] args) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsepower()));
        System.out.println(car);
    }
}
