package BaseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import Entidades.*;
import Excepciones.*;

public class CompraAlimentoDAO {
	public static void inserta(compraAlimento compra) throws MensajeExcepcion, ComprasExcepcion, SQLException {
		Conexion con = new Conexion();
		try {
			  Iterator<Producto> bolsa = compra.iterator(); ////recorre la lista pro productos 
			  if (bolsa.hasNext()) {  // Verifica si hay por lo menos un producto en la bolsa
				  while (bolsa.hasNext()) {  // Se ejecuta si encuentra productos
					  Producto producto = new Producto();
					  producto = bolsa.next();
					  con.getConnection().setAutoCommit(false); // Garantizar Transaccion
					  String sql = "insert into compra_alimentos (Fecha, mes, codigo, lugar, categoria, marca, descripcion, und, Cant, Precio, Total)" + 
					  		"values (?,?,?,?,?,?,?,?,?,?,?);";
					  PreparedStatement st = null;
					  st = con.getConnection().prepareStatement(sql);
					  st.setString(1, compra.getFecha());
					  st.setString(2, compra.getRefFecha());
					  st.setInt(3, producto.getCodigo());
					  st.setString(4, compra.getLocal());
					  st.setString(5, producto.getCategoria());
					  st.setString(6, producto.getMarca());
					  st.setString(7, producto.getDescripcion());
					  st.setString(8, producto.getUnd());
					  st.setDouble(9, producto.getCant());
					  st.setDouble(10, producto.getPrecio());
					  st.setDouble(11, producto.getTotal());
					  st.execute();
					  con.getConnection().commit();// Realizar el envio de datos
				  	}
			  } else 
				  throw new MensajeExcepcion("La bolsa esta vacia");
		} catch (Exception e) {
			con.getConnection().rollback();  //En caso de fallo, restablecer la base de datos original
			   e.printStackTrace();
			throw new ComprasExcepcion();
		} finally {
			con.desconectar();
		}
	}
	
	
	
}
