

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor(){
        Property property1 = new Property("T3 Monte Belo",150000);
        assertEquals("T3 Monte Belo",property1.getDescription());
        assertEquals(150000,property1.getPrice());
    }
        
    @Test
    public void testToString(){
        Property property2 = new Property("T3 Monte Belo",150000);
        assertEquals("Descrição    : T3 Monte Belo\n Preço       : 150000.0 EUROS",property2.toString());
    }
}
