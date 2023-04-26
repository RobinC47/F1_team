package F1_team;

public class Driver {
    private String name;
    private int age;
    private Formula1Team team;

    public Driver(String name, int age, Formula1Team team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Formula1Team getTeam() {
        return team;
    }

    public void setTeam(Formula1Team team) {
        this.team = team;
    }
}
