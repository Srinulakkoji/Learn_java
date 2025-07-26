package org.SOLIDprinciples.singleResponsibilityPrinciple;

public class Employee {
    private int id;
    private String name;

    //here we are added POJO for ext data which is not inclueded in the Strong POJO
    EmployeeExt ext;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
