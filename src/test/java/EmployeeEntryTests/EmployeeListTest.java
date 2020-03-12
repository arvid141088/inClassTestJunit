package EmployeeEntryTests;
/**
 * Arvids Ceceruks
 * Employee List Tests
 */
import employees.Employee;
import employees.EmployeeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListTest {

    EmployeeList employeeList;

    @Test
    void testAddEmployeeSuccess(){
        employeeList = new EmployeeList();
        Employee e1 = new Employee("John Smyth","99999");
        Employee e2 = new Employee("Sarah Conor","33333");
        employeeList.addEmployee(e1);
        employeeList.addEmployee(e2);

    }
    @Test
    void testAddEmployeeFailure(){
        employeeList = new EmployeeList();
        Employee e1 = new Employee("John Smyth","99999");
        Employee e2 = new Employee("Sarah Conor","99999");
        employeeList.addEmployee(e1);
        employeeList.addEmployee(e2);
       // assertThrows(IllegalArgumentException.class, () ->new Employee("Sarah Conor","99999"));


    }
    @Test
    void testDeleteEmployee(){

        employeeList = new EmployeeList();
        Employee e1 = new Employee("John Smyth","99999");
        Employee e2 = new Employee("Sarah Conor","55555");
        employeeList.addEmployee(e1);
        employeeList.addEmployee(e2);
        System.out.println(employeeList.getListSize());

        employeeList.deleteEmployee("55555");
        System.out.println(employeeList.getListSize());
    }

}
