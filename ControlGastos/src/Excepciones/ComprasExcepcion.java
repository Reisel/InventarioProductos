package Excepciones;

public class ComprasExcepcion extends Exception {
	private static String mensaje = "Ha ocurrido un problema, intente m�s tarde";
	
	@Override
	public String getMessage() {
		return mensaje;
	}
}
