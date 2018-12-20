package components;

import org.springframework.stereotype.Component;

@Component
public class Saw implements Tool {

    private String type = "hand";

    public void fix() {
        System.out.println(type);

    }
}
