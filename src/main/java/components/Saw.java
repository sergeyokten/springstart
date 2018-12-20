package components;

//@Component
public class Saw implements Tool {

    private String type = "hand";

    public void fix() {
        System.out.println(type);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
