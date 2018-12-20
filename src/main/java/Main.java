import components.Hammer;
import components.Saw;
import components.Tool;
import components.Worker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
//        container.register(Worker.class, Hammer.class, Saw.class, Generator.class);
//        container.refresh();

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Worker bean = container.getBean("worker",Worker.class);
        Tool tool = container.getBean("hammer",Hammer.class);
        bean.setTool(tool);
        Saw saw = container.getBean(Saw.class);
        bean.setTool(saw);
        System.out.println(bean);
//
//        Worker worker2 = container.getBean("worker2", Worker.class);
//
//        System.out.println(worker2);


    }
}
