package By.Kagan.HumanInformation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {
    static ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
    static List<Human> human = new ArrayList<Human> (Collections.singletonList(applicationContext.getBean("humanBean", Human.class)));
    public static void main(String[] args) {

for(Human human : human) {
    human.whatDoes();
    System.out.println(human.getName());
    System.out.println(human.getPatronymic());
    System.out.println(human.getSurname());
    System.out.println(human.getAge());
}
    }
}