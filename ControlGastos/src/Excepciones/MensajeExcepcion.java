package Excepciones;

public class MensajeExcepcion extends Exception {
	private String mensaje;
	
	public MensajeExcepcion(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		return mensaje;
	}
}
