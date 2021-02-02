package By.Kagan.HumanInformation;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Human human = applicationContext.getBean("humanBean", Human.class);
        Abilities runAbility = applicationContext.getBean("runBean", Abilities.class);
        human.whatDoes();
        System.out.println(human.getName());
        System.out.println(human.getPatronymic());
        System.out.println(human.getSurname());
        System.out.println(human.getAge());
    }
}
