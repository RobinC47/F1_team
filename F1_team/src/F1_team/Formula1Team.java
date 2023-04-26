package F1_team;

import java.util.List;
import java.util.ArrayList;

public class Formula1Team {
    private String name;
    private Car car;
    private Driver driver;
    private List<Mechanic> mechanics;
    private List<TeamMember> teamMembers;

    public Formula1Team(String name) {
        this.name = name;
        mechanics = new ArrayList<>();
        teamMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public void removeMechanic(Mechanic mechanic) {
        mechanics.remove(mechanic);
    }


    public List<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
    }

    public void removeTeamMember(TeamMember member) {
        teamMembers.remove(member);
    }
}