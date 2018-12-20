package components;

//@Component
public class Hammer implements Tool {
    private int weight = 900;

    public Hammer() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Hammer(int weight) {
        this.weight = weight;
    }

    public void fix() {
        System.out.println(weight);
    }
}
