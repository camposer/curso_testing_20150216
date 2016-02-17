package curso.testing.basico.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	private void validarOperador(int a) {
		if (a < 0)
			throw new OperadorInvalidoException(a);
	}

	@Override
	public int sumar(int a, int b) {
		validarOperador(a);
		validarOperador(b);
		
		long c = (long)a + b;
		if (c > Integer.MAX_VALUE)
			throw new ResultadoInvalidoException();
		
		return (int)c;
	}

	@Override
	public int restar(int a, int b) {
		validarOperador(a);
		validarOperador(b);
		
		if (b > a)
			throw new SustraendoInvalidoException(b);
			
		return a - b;
	}

	@Override
	public int multiplicar(int a, int b) {
		validarOperador(a);
		validarOperador(b);

		long c = (long)a * b;
		if (c > Integer.MAX_VALUE)
			throw new ResultadoInvalidoException();
		
		return (int)c;
	}

	@Override
	public int dividir(int a, int b) {
		validarOperador(a);
		validarOperador(b);
		
		if (b == 0)
			throw new DivisorInvalidoException(b);
		else if (a % b != 0)
			throw new ResultadoInvalidoException();
		
		return a / b;
	}

}
