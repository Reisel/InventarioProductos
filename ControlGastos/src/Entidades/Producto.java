package Entidades;

public class Producto {
	private int id;
	private String categoria;
	private String marca;
	private String descripcion;
	private String und;
	private double precio;
	private int codigo;
	private double cant;
	private double total;
	
//// Constructores///////
	public Producto() {
		
	}
	
////Getters y Setter///////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUnd() {
		return und;
	}
	public void setUnd(String und) {
		this.und = und;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getCant() {
		return cant;
	}

	public void setCant(double cant) {
		this.cant = cant;
	}

	public double getTotal() {
		total = cant * precio;
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	////String///////
	@Override
	public String toString() {
		return "Producto [id=" + id + ", categoria=" + categoria + ", marca=" + marca + ", descripcion=" + descripcion
				+ ", und=" + und + ", precio=" + precio + ", codigo=" + codigo + "]";
	}
	
	

}
