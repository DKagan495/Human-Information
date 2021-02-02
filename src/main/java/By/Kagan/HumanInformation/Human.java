package By.Kagan.HumanInformation;

public class Human {
    Abilities ability;
    private String Name, Surname, Patronymic;
    private int Age;
    public Human()
    {

    }

    public void setAbility(Abilities ability) {
        this.ability = ability;
    }

    public void whatDoes()
    {
        System.out.println("Human is" + ability.concreteAbility());
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
