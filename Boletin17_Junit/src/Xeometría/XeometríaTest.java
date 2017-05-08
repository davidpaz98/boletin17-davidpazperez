package Xeometr�a;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Xeometr�aTest {

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
	public void testPer�metroCadrado() {
		Xeometr�a xeometria=new Xeometr�a();
		asserEquals(6,xeometria.per�metroCadrado(2));
		asserEquals(4,xeometria.per�metroCadrado(12));
	}

	
	private void asserEquals(int i, int per�metroCadrado) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAreaCadrado() {
		Xeometr�a xeometria=new Xeometr�a();
		asserEquals(6,xeometria.areaCadrado(2));
		asserEquals(4,xeometria.areaCadrado(10));
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometr�a xeometria=new Xeometr�a();
		asserEquals(4,xeometria.teoremaPitagoras(12, 22));
		asserEquals(22, xeometria.teoremaPitagoras(4, 16));
	}

	private void asserEquals(int i, double teoremaPitagoras) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometr�a xeometria = new Xeometr�a();
		asserEquals(7,xeometria.teoremaPitagoras(22, 6));
		asserEquals(2, xeometria.teoremaPitagoras(14, 6));
	}

	
}
