package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {

		
	@Test 
	public void tarifasTestDescuentoAntelacion() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 30);
		Assert.assertEquals(850.0, actual,0.0000000001);
	}
	@Test 
	public void tarifasTestDescuentoMenorDeEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 15, 5);
		Assert.assertEquals(950.0, actual,0.0000000001);
	}
	@Test 
	public void tarifasTestDescuentoTerceraEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(1000, 15, 66);
		Assert.assertEquals(920.0, actual,0.0000000001);
	}
	@Test 
	public void tarifasTestDescuentoAntelacionYMenorDeEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 5);
		Assert.assertEquals(800.0, actual,0.0000000001);
	}
	@Test 
	public void tarifasTestDescuentoAntelacionYTerceraEdad() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 66);
		Assert.assertEquals(770.0, actual,0.0000000001);
	}
	
	@Test 
	public void tarifasTestSinDescuentos() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000,5, 30);
		Assert.assertEquals(1000.0, actual,0.0000000001);
	}
	/**
	@Test 
	public void tarifasTestDescuentoAntelacion() {
		double actual = CalculadorDescuentos.calculoTarifa(	1000, 21, 30);
		Assert.assertEquals(850.0, actual,0.0000000001);
	}
	*/

}
