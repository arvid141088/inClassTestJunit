package EmployeeEntryTests;
/**
 * Arvids Ceceruks
 * Employee Entry Tests
 */

import employees.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee myEmployee;

    @BeforeAll
    static void startingTests(){
        System.out.println("Beginning tests");
    }
    @AfterAll
    static void endingTests(){
        System.out.println("Tests completed");
    }

    @Test
    void testSuccess(){
        myEmployee = new Employee("Arvids C","12345");
        assertEquals("Arvids C", myEmployee.getName());
        assertEquals("12345",myEmployee.getId());
    }

    @Test
    void testFailureName(){

        assertThrows(IllegalArgumentException.class,() -> {
            myEmployee = new Employee("Arv","12345");});
    }
    @Test
    void testFailureId(){
        assertThrows(IllegalArgumentException.class,() -> {
            myEmployee = new Employee("Arvid C","123");});
    }

}
