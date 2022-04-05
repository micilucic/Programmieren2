package com.company;

public class DemoEmp {
    public static void main(String[] args) {
        Employee mark = new Employee(4535,"Mark", 1500, "Management");
        Employee hanna = new Employee(5432, "Hanna", 1700, "Management");

       EmployeeManager ngr = new EmployeeManager();

       ngr.addEmployee(mark);
       ngr.addEmployee(hanna);

        System.out.println(ngr.findByEmpNumber(4537));

        System.out.println(ngr.findByDepartment("Management"));

        System.out.println(ngr.findByMaxSalary());

    }
}
