package junittrial;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class AppTest {
	Scanner sc=new Scanner(System.in);
    @Test
    public void testApp() {
        App app = new App();
        int result =app.getaccountbalance(200000); 
        System.out.println("Enter the account balance: ");
        int ab=sc.nextInt();
        assertEquals(ab, result);
        System.out.println("Test 1 case");
    }
    
    

    @RepeatedTest(3)
    @DisplayName("done")
    @Test
    public void testApp1() {
        App app = new App();
        int result =app.getaccountbalance(200000); 
        System.out.println("(1)Enter the account balance: ");
        int ab=sc.nextInt();
        assertNotEquals(ab,result);//assertEquals(expectedValue, actualValue);
        System.out.println("test 2 case");
    }
}
