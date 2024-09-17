package com.sahana.employees;

public class Manager extends Employee {
	private String department;

    /**
     * Constructs a Manager with the specified name, employeeId, salary, and department.
     *
     * @param name the manager's name
     * @param employeeId the manager's employee ID
     * @param salary the manager's salary
     * @param department the manager's department
     */
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
