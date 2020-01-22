

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriptionTest {
	
	@Test
	public void testprecioPorMes() {
		double esperado=100;   
		Subscription s = new Subscription(200,2) ;    
		double resultado = s.precioPorMes();   
		assertEquals (esperado, resultado,0) ; 
	}

	@Test  
	public void testprecioPorMes2() {   
		double esperado=67;   
		Subscription s = new Subscription(200,3) ;    
		double resultado= s.precioPorMes();   
		assertEquals (esperado, resultado, 0) ;  
		} 
	@Test
	void testCancel() {
		assertTrue(true);
	}
	 
	 

	
}
