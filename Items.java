public class Items {

    protected   String name;
    protected double weight;
    protected int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Items( String name, int value, double weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    public Items()
    {
        this.name="Unknown";
        this.value=0;
        this.weight=0;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Value: " + value);
        System.out.println("Weight: " + weight);
    }






}