package Excepciones;

public class ComprasExcepcion extends Exception {
	private static String mensaje = "Ha ocurrido un problema, intente más tarde";
	
	@Override
	public String getMessage() {
		return mensaje;
	}
}
