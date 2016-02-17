package curso.testing.basico.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import curso.testing.basico.config.ConfigTest;

@RunWith(SpringJUnit4ClassRunner.class) // => spring-test
@ContextConfiguration(classes = ConfigTest.class)
public class CalculadoraServiceTest {
	@Autowired
	private CalculadoraService calculadoraService;
	
	@Test
	public void sumar() {
		int res = calculadoraService.sumar(2, 2);
		Assert.assertEquals(4, res);
	}

	@Test
	public void operadorInvalido() {
		try {
			calculadoraService.sumar(-2, 2);
			Assert.fail();
			calculadoraService.sumar(2, -2);
			Assert.fail();
			calculadoraService.restar(-2, 2);
			Assert.fail();
			calculadoraService.restar(2, -2);
			Assert.fail();
			calculadoraService.multiplicar(-2, 2);
			Assert.fail();
			calculadoraService.multiplicar(2, -2);
			Assert.fail();
			calculadoraService.dividir(-2, 2);
			Assert.fail();
			calculadoraService.dividir(2, -2);
			Assert.fail();
		} catch (Exception e) {}
	}

	@Test(expected = ResultadoInvalidoException.class)
	public void sumarResultadoInvalido() {
		calculadoraService.sumar(Integer.MAX_VALUE, 2);
	}

	@Test
	public void restar() {
		int res = calculadoraService.restar(4, 2);
		Assert.assertEquals(2, res);
	}
	
	@Test(expected = SustraendoInvalidoException.class)
	public void restarSustraendoInvalido() {
		calculadoraService.restar(2, 4);
	}

	@Test
	public void multiplicar() {
		int res = calculadoraService.multiplicar(3, 2);
		Assert.assertEquals(6, res);
	}
	
	@Test(expected = ResultadoInvalidoException.class)
	public void multiplicarResultadoInvalido() {
		calculadoraService.multiplicar(Integer.MAX_VALUE, 2);
	}

	@Test
	public void dividir() {
		int res = calculadoraService.dividir(4, 2);
		Assert.assertEquals(2, res);
	}
	
	@Test(expected = DivisorInvalidoException.class)
	public void dividirDivisorInvalido() {
		calculadoraService.dividir(4, 0);
	}

	@Test(expected = ResultadoInvalidoException.class)
	public void dividirResultadoInvalido() {
		calculadoraService.dividir(4, 3);
	}
	
}
