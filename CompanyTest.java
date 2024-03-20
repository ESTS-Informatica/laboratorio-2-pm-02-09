

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    /**
     * Default constructor for test class CompanyTest
     */
    private Company company1;
    private User seller2;
    private User seller1;
    private  User client1;
    private  User client2;
    private Property property1;
    private Property property2;
    
    
    public CompanyTest(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        company1 = new Company();
        
        client1 = new User("José Manuel","911111111"," zemanel@yahoo.com");
        client2 = new User("António Francisco","922222222 ","tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes","966777101","fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues ","966777152","roro@remax.pt");
        
        property1 = new Property("T3 Monte Belo",150000);
        property2 = new Property("T1 Monte Belo", 80000);
      
        
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
        assertNotEquals(company1.getClients(),null);    
        assertNotEquals(company1.getSellers(),null); 
        assertNotEquals(company1.getProperties(),null); 
        assertNotEquals(company1.getSells(),null); 
    }
    
    @Test 
    public void testRegisterClient(){
        int oldSize = company1.getClients().size();
        assertTrue(company1.registerClient(client1));
        int newSize = company1.getClients().size();
        assertEquals(oldSize +1,newSize);
        
    }
    
    @Test
    public void testRegisterClients(){
         int oldSize = company1.getClients().size();
        assertTrue(company1.registerClient(client1));
        assertTrue(company1.registerClient(client2));
        int newSize = company1.getClients().size();
        assertEquals(oldSize +2,newSize);

    }
    
    @Test 
    public void testRegisterClientDuplicate(){
        assertTrue(company1.registerClient(client2));
            assertFalse(company1.registerClient(client2));
    }
    
    @Test 
    public void testRegisterClientNull(){
        assertFalse(company1.registerClient(null));
    }
    
     @Test 
    public void testRegisterSeller(){
        int oldSize = company1.getSellers().size();
        assertTrue(company1.registerSeller(seller1));
        int newSize = company1.getSellers().size();
        assertEquals(oldSize +1,newSize);
        
    }
    
     @Test
    public void testRegisterSellers(){
         int oldSize = company1.getSellers().size();
        assertTrue(company1.registerSeller(seller1));
        assertTrue(company1.registerSeller(seller2));
        int newSize = company1.getSellers().size();
        assertEquals(oldSize +2,newSize);

    }
    
     @Test 
    public void testRegisterSellerDuplicate(){
        assertTrue(company1.registerSeller(seller2));
            assertFalse(company1.registerSeller(seller2));
    }
    
    @Test 
    public void testRegisterSellerNull(){
        assertFalse(company1.registerSeller(null));
    }
    
    @Test 
    public void testRegisterProperty(){
        int oldSize = company1.getProperties().size();
        assertTrue(company1.registerProperty(property1));
        int newSize = company1.getProperties().size();
        assertEquals(oldSize +1,newSize);
        
    }
    
     @Test
    public void testRegisterProperties(){
         int oldSize = company1.getProperties().size();
        assertTrue(company1.registerProperty(property1));
        assertTrue(company1.registerProperty(property2));
        int newSize = company1.getProperties().size();
        assertEquals(oldSize +2,newSize);

    }
    
     @Test 
    public void testRegisterPropertieDuplicate(){
        assertTrue(company1.registerProperty(property2));
            assertFalse(company1.registerProperty(property2));
    }
}
