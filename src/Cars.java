public class Cars implements Car {
     String model;
     String color;
     int horsepower;
     String countryProduced;

    public Cars(String model, String color, int horsepower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    public String toString()
    {
        return String.format("This is %s produced in %s and have %d tires", this.model,this.countryProduced,TIRES);
    }
}
