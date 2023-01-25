import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Entity.NumberCheck;
import MainExample.NumberMainExample;

public class TestExample {
           @Test
           public void testMainEven(){
        	   assertTrue(NumberCheck.numberCheckNumber(2));
           }
}
