package curso.testing.basico.service;

public class DivisorInvalidoException extends CalculadoraException {
	private static final long serialVersionUID = 7404091752504486958L;

	private int operador;
	
	public DivisorInvalidoException(int operador) {
		this.operador = operador;
	}

	public int getOperador() {
		return operador;
	}

	public void setOperador(int operador) {
		this.operador = operador;
	}
}
