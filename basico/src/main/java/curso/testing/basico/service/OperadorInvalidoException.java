package curso.testing.basico.service;

public class OperadorInvalidoException extends CalculadoraException {
	private static final long serialVersionUID = -5812211585338637073L;

	private int operador;
	
	public OperadorInvalidoException(int operador) {
		this.operador = operador;
	}

	public int getOperador() {
		return operador;
	}

	public void setOperador(int operador) {
		this.operador = operador;
	}
}
