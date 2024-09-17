package com.sahana.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Constructs a Developer with the specified name, employeeId, salary, and programming language.
     *
     * @param name the developer's name
     * @param employeeId the developer's employee ID
     * @param salary the developer's salary
     * @param programmingLanguage the developer's programming language
     */
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


}