/* TestAddition.java
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAddition {
    
	@Test
    public void TestSimpleAddition(){
    	
        assertEquals(2, Addition.add(1,1));
    }
	
	@Test
    public void TestPositiveAndNegativeAddition(){
    	
        assertEquals(0, Addition.add(-1,1));
    }

	@Test
    public void TestZeroAndPositiveAddition(){
    	
        assertEquals(1, Addition.add(0,1));
    }

		
}
