package employeetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import employees.Employee;

class EmployeeTest {
    Employee employee = new Employee();

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Before Each");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("After Each");
    }

    @Test
    @RepeatedTest(3)
    @DisplayName("String Test")
    void testSetName() {
        String n = employee.setName("HDG");
        assertEquals("HDG", n, "Name should be set correctly");
        assertEquals("HDG", employee.getName(), "Name should be retrieved correctly");
        System.out.println("String test passed");
    }

    @Test
    @RepeatedTest(3)
    @DisplayName("Age Test")
    void testSetAge() {
        int age = 34;
        int returnedAge = employee.setAge(age);
        assertEquals(age, returnedAge, "Age should be set correctly");
        assertEquals(age, employee.getAge(), "Age should be retrieved correctly");
        System.out.println("Age test passed");
    }

    @Test
    @RepeatedTest(3)
    @DisplayName("Age Value Test")
    void testIsPositive() {
        int age = 34;
        assertTrue(isPositive(age), "Age should be positive");
    }

    @Test
    @RepeatedTest(3)
    @DisplayName("Salary test")
    void salarytest1() {
    	int sa=55699;
    	int salary=	employee.setSalary(sa);
    	assertEquals(sa,employee.getSalary(),"Salary test passed");
    }
    
    @Test
    @RepeatedTest(3)
    @DisplayName("Salary Value test")
    void salarytest() {
    	int salary=55699;
    	assertTrue(isPositive(salary),"Salary is Positive");
    }
    
    
    boolean isPositive(int number) {
        return number > 0;
    }
}
