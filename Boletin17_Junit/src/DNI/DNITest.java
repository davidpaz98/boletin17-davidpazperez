package DNI;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DNITest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEValidoString() {
		DNI dni = new DNI();
		asserEquals(dni.eValido("53795959v"));
		asserEquals(dni.eValido("12348573c"));
		asserEquals(dni.eValido("-3739595v"));
	}

	private void asserEquals(boolean eValido) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testCalculaLetraString() {
		DNI dni = new DNI();
		asserEquals(dni.calculaLetra("46"));
		asserEquals(dni.calculaLetra("36"));
	}

	private void asserEquals(int calculaLetra) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testEValidoArrayListOfIntegerChar() {
		DNI dni = new DNI();
		asserEquals(dni.calculaLetra("12345678"));
		asserEquals(dni.calculaLetra("32145678"));
	}

	@Test
	public void testCalculaLetraArrayListOfInteger() {
		DNI dni = new DNI();
		asserEquals(dni.calculaLetra("32145678"));
		asserEquals(dni.calculaLetra("32165478"));
	}

}
