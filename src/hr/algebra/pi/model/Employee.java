package hr.algebra.pi.model;

public class Employee {
    private String name;
    private double earnings;

    public Employee(String name) {
        this.name = name;
        this.earnings = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
