package hr.algebra.pi.configuration;

public class EmployeePayRates {
    public static final double EMPLOYEE_1_RATE = 0.1;
    public static final double EMPLOYEE_2_RATE = 0.11;

    public static double getRate(String name) {
        if (name.equals("employee1")) {
            return EMPLOYEE_1_RATE;
        } else if (name.equals("employee2")) {
            return EMPLOYEE_2_RATE;
        }
        return 0.0;
    }
}
