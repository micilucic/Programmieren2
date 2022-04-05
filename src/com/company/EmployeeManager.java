package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    //Man kann die Liste auch anders erzeugen:
    //private ArrayList <Employee> employees;
    //*public EmployeManager(){   --------> der Konstruktor !! Er ist immer public, um Objekte erzeugen zu können, Liste aber trotzdem private
    //employees = new ArrayList();
    //}*

    //  Employee mark = new Employee(4535,"Mark", 1500, "Management");

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee emp : employees) {
            if (emp.getEmpNumber() == number) {
                return emp;
            }
        }
        return null;
    }

    /*public Employee findByEmpNumber(int number) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNumber()==number) {
                return employees.get(i);
            } else if (){

            }
        }*/

    public ArrayList<Employee> findByDepartment(String department) {

        //Neue List um die Mitarbeiter, die in einem Department arbeiten, zu speichern.
        ArrayList<Employee> erg = new ArrayList<>();

        for (Employee dep : employees) {
            if (dep.getDepartment().equals(department)) {
                erg.add(dep);
            }
        }
        return erg;
    }


    /*  ArrayList<Employee> findByDepartment(String department) {
          for (int i = 0; i < employees.size(); i++) {
              if (employees.get(i).getDepartment() == department) {
                  return employees.get(i);
              }
      */

    public Employee findByMaxSalary() {
        Employee highestE = null; //Mitarbeiter, der am Anfang am meisten verdient!
        double highestSalary = -1; //-1 um sicherzustellen, dass es immer jemanden gibt der mehr verdient !
        for (Employee e : employees) {
            if (e.getSalary() > highestSalary) {
                highestSalary = e.getSalary();
                highestE = e;
            }
        }
        return highestE;
    }
}



