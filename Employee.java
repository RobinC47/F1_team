public class Employee {
    private String name;
    private String position;
    private int salary;
    private int car;

    public Employee(String name, String position, int salary, int car) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }
}
