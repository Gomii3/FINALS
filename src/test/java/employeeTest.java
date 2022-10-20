import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class employeeTest {

    private employee employee;

    @BeforeAll
    public static void bootUp(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        System.out.println("                    Connecting to Employee Database");
        System.out.println("");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    @BeforeEach
    public void createEmployee(){
        this.employee= new employee("Jim",15000,"Desk guy");
    }

    @Test
    @DisplayName("Salary name = C")
    public void givenSalaryOfEmployeeAbove10000Below20000_returnSalaryGradeC(){
        assertEquals("C",employee.getSalaryGrade(15000));
    }

    @Test
    @DisplayName("Salary name = B")
    public void givenSalaryOfEmployeeAbove20000Below40000_returnSalaryGradeB(){
        assertEquals("B",employee.getSalaryGrade(25000));
    }

    @Test
    @DisplayName("Salary name = A")
    public void givenSalaryOfEmployeeAbove40000_returnSalaryGradeA(){
        assertEquals("A",employee.getSalaryGrade(45000));
    }
    @Test
    @DisplayName("Salary name = error")
    public void givenSalaryOfEmployeeError_returnSalaryGradeA(){
        assertEquals("A",employee.getSalaryGrade(15000));
    }



    @AfterAll
    public static void shutDown(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        System.out.println("                    Disconnecting from Employee Database");
        System.out.println("");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
