package components;

import org.springframework.stereotype.Component;

@Component
public class Hammer implements Tool {
    private int weight = 900;

    public Hammer() {
    }

    public Hammer(int weight) {
        this.weight = weight;
    }

    public void fix() {
        System.out.println(weight);
    }
}
