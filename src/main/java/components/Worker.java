package components;

import org.springframework.stereotype.Component;

//@Component
public class Worker {
    private int id = 1;
    private String name = "vasya";
    private Tool tool;

    public Worker() {
    }

    public Worker(Tool tool) {
        this.tool = tool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }


    @Override
    public String toString() {
        return "components.Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tool=" + tool +
                '}';
    }


    public void doSome() {
        tool.fix();
    }
}
