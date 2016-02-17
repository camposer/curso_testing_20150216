package curso.testing.basico.service;

public class SustraendoInvalidoException extends CalculadoraException {
	private static final long serialVersionUID = 8710171400621441045L;

	private int operador;
	
	public SustraendoInvalidoException(int operador) {
		this.operador = operador;
	}

	public int getOperador() {
		return operador;
	}

	public void setOperador(int operador) {
		this.operador = operador;
	}
}
