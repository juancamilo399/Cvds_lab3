package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;
//import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {

		
	@Test 
	public void tarifasTestDescuentoAntelacion() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 30);
		Assert.assertEquals(850.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoAntelacion2() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 22, 30);
		Assert.assertEquals(850.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoSinAntelacion() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 20, 30);
		Assert.assertNotEquals(850.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoMenorDeEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 17, 16);
		Assert.assertEquals(950.0, actual,0.0000000001);
	}
	
	
	@Test 
	public void tarifasTestDescuentoMenorDeEdad2() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 17, 17);
		Assert.assertEquals(950.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestSinDescuentoMenorDeEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 18);
		Assert.assertNotEquals(950.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoTerceraEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(1000, 17, 66);
		Assert.assertEquals(920.0, actual,0.0000000001);
	}
	
	
	
	@Test 
	public void tarifasTestDescuentoTerceraEdad2() {
		double actual = CalculadorDescuentos.calculoTarifa(1000, 17, 68);
		Assert.assertEquals(920.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestSinDescuentoTerceraEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(1000, 21, 65);
		Assert.assertNotEquals(920.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoAntelacionYMenorDeEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 17);
		Assert.assertEquals(800.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoAntelacionYMenorDeEdad2() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 22, 16);
		Assert.assertEquals(800.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestSinDescuentoAntelacionYMenorDeEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 20, 18);
		Assert.assertNotEquals(800.0, actual,0.0000000001);
	}
	
	
	@Test 
	public void tarifasTestDescuentoAntelacionYTerceraEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 66);
		Assert.assertEquals(770.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestDescuentoAntelacionYTerceraEdad2() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 22, 67);
		Assert.assertEquals(770.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestSinDescuentoAntelacionYTerceraEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 20, 65);
		Assert.assertNotEquals(770.0, actual,0.0000000001);
	}
	
	
	@Test 
	public void tarifasTestSinDescuentos2() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000,20,18);
		Assert.assertEquals(1000.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestSinDescuentos() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000,19,19);
		Assert.assertEquals(1000.0, actual,0.0000000001);
	}
	
	
	/**
	@Test(expected = ExcepcionParametrosInvalidos.class)
	public void tarifasTestParametrosIncorrectos() {
		double actual = CalculadorDescuentos.calculoTarifa(	-1, 0, 1);
	}
	*/

}
