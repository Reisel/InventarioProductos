package Entidades;

public class Local {
	private String nombre;
	private String direccion;
	
	
	////Constructor////
	public Local() {
	}
	
	///Getters y Setters/////
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	///String///
	@Override
	public String toString() {
		return "Local [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	

}
