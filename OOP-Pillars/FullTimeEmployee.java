public class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double monthlyBonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlyBonus) {
        super(employeeId, name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + (department != null ? department : "Not Assigned");
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        if (monthlyBonus < 0) {
            throw new IllegalArgumentException("Bonus must be positive");
        }
        this.monthlyBonus = monthlyBonus;
    }
}
