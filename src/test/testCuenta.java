package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Practica3.Cuenta;

class testCuenta {

	private static Cuenta cuenta,cuenta12345,cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		cuenta = new Cuenta(0);
		cuenta12345 = new Cuenta(50);
		cuenta67890 = new Cuenta(0);
		cuenta12345.titular = "12345";
		cuenta67890.titular = "67890";
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		cuenta.setSaldo(0);
	}
	
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresa() {
		
		cuenta.Ingresa(100);
		
		assertEquals(100, cuenta.getSaldo());
		
	}
	
	@Test
	void testRetira() {
		
		cuenta.Retira(100);
		
		assertEquals(-100, cuenta.getSaldo());
		
	}
	
	
	@Test
	void test1() {
		
		cuenta12345.Retira(200.0);
		assertEquals(-150, cuenta12345.getSaldo());
		
		
	}
	@Test
	void test2() {
		
		cuenta67890.Retira(350.0);
		assertEquals(-350, cuenta67890.getSaldo());
		
		
		
	}
	@Test
	void test3() {
		
		cuenta12345.Ingresa(100.0);
		assertEquals(-50, cuenta12345.getSaldo());
		
		
		
	}
	@Test
	void test4() {
		
		cuenta67890.Retira(200.0); //El modelo de negocio de nuestra aplicación no nos permitiria tener mas de 500 euros en descubierto
		assertEquals(-350, cuenta67890.getSaldo());
		
		
		
	}
	@Test
	void test5() {
		
		cuenta67890.Retira(150.0); //Se queda justo en el limite de descubierto, por lo que pasa la prueba
		assertEquals(-500, cuenta67890.getSaldo());
		
		
		
	}
	@Test
	void test6() {
		
		cuenta12345.Retira(200.0);
		assertEquals(-250, cuenta12345.getSaldo());
		
		
		
	}
	@Test
	void test7() {
		
		cuenta67890.Ingresa(50.0);
		assertEquals(-450, cuenta67890.getSaldo());
		
		
		
	}
	@Test
	void test8() {
		
		cuenta67890.Retira(100.0);
		assertEquals(-450, cuenta67890.getSaldo());
		
		
		
	}
	
	
	


}
