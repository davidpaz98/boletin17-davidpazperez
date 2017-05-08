package Xeometría;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XeometríaTest {

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
	public void testPerímetroCadrado() {
		Xeometría xeometria=new Xeometría();
		asserEquals(6,xeometria.perímetroCadrado(2));
		asserEquals(4,xeometria.perímetroCadrado(12));
	}

	
	private void asserEquals(int i, int perímetroCadrado) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAreaCadrado() {
		Xeometría xeometria=new Xeometría();
		asserEquals(6,xeometria.areaCadrado(2));
		asserEquals(4,xeometria.areaCadrado(10));
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometría xeometria=new Xeometría();
		asserEquals(4,xeometria.teoremaPitagoras(12, 22));
		asserEquals(22, xeometria.teoremaPitagoras(4, 16));
	}

	private void asserEquals(int i, double teoremaPitagoras) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometría xeometria = new Xeometría();
		asserEquals(7,xeometria.teoremaPitagoras(22, 6));
		asserEquals(2, xeometria.teoremaPitagoras(14, 6));
	}

	
}
