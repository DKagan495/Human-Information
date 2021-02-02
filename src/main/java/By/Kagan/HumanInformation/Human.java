package By.Kagan.HumanInformation;

import java.util.ArrayList;
import java.util.List;

public class Human {
    List<Abilities> ability = new ArrayList<>();
    private String Name, Surname, Patronymic;
    private int Age;
    public Human()
    {

    }

    public void setAbility(List<Abilities> ability) {
        this.ability = (List<Abilities>) ability;
    }


    public void whatDoes()
    {
        for(Abilities ability : ability)
        System.out.println("Human is" + ability.getAbility());
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public int getAge() {
        return Age;
    }
}
