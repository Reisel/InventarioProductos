package Main;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import BaseDeDatos.CompraAlimentoDAO;
import Entidades.*;
import Excepciones.ComprasExcepcion;
import Excepciones.MensajeExcepcion;

public class Main {

	public static void main(String[] args) throws MensajeExcepcion, ComprasExcepcion, SQLException, ParseException {
		Local local = new Local();
		Producto producto = new Producto();
		Producto producto2 = new Producto();
		compraAlimento compra = new compraAlimento();
		
		local.setDireccion("Rivadavia");
		local.setNombre("COTO");
		
		producto.setCodigo(454545);
		producto.setCategoria("Jabon");
		producto.setMarca("Lallave");
		producto.setDescripcion("Jabon azul para la ropa");
		producto.setUnd("UND (100 Gr)");
		producto.setCant(3);
		producto.setPrecio(20);
		
		producto2.setCodigo(303030);
		producto2.setCategoria("Verduras");
		producto2.setMarca("N/A");
		producto2.setDescripcion("Papas");
		producto2.setUnd("Kg");
		producto2.setCant(2);
		producto2.setPrecio(10);
				
	    SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date fecha = simpleFormat.parse("12/09/2016");

	    compra.setFecha(fecha);
		compra.setLocal(local);
		compra.compraAlimento(producto);
		compra.compraAlimento(producto2);
		
		CompraAlimentoDAO.inserta(compra);
		
		
	}

}
