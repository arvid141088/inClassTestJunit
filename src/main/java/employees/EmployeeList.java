package employees;
/**
 * Arvids Ceceruks
 * EmployeeList class
 */

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employeeList;
    private int listSize=0;

    public EmployeeList(){
        employeeList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee){

        for(Employee e : employeeList){
            if(e.equals(employee.getId())){
               throw new IllegalArgumentException("Already exist");
            }
            else{
                employeeList.add(employee);
                listSize++;
                System.out.println("Employee added");
            }
        }
    }

    public void deleteEmployee(String id){

       // Employee result = new Employee("Arvid","12345");
        //check if id is unique
        for(Employee e : employeeList){
            if(e.equals(id)){
                employeeList.remove(id);
                listSize--;
                System.out.println("Employee deleted from list");
            }
            else{
                System.out.println("No matching employee found");
            }
        }
    }

    public int getListSize(){

        return listSize;
    }

}
