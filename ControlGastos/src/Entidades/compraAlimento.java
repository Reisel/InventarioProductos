package Entidades;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.sql.*;
import javax.*;

import Entidades.*;
import Excepciones.*;

public class compraAlimento implements Iterable {
	private ArrayList<Producto> bolsa = new ArrayList<Producto>();
	private Local local = new Local();
	Date fecha = new Date();
	private String ano;
	private String mes;
	
	///Constructor////
	public compraAlimento() {
	}
	
	public void compraAlimento(Producto objeto) {
			bolsa.add(objeto);
	}
	
	public ArrayList compraAliemnto() {
		return bolsa;
}
	
	public String getRefFecha() {
		SimpleDateFormat mothFormat = new SimpleDateFormat("MMM");
	    mes = mothFormat.format(fecha);
	    
		SimpleDateFormat yearFormat = new SimpleDateFormat("yy");
	    ano = yearFormat.format(fecha);

		return mes + "-" + ano;
	}
			
	@Override
	public Iterator<Producto> iterator() {
		return bolsa.iterator();
	}
	
	
	///Getters y Setters////
	public String getLocal() {
		String nombre = local.getNombre();
		return nombre;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public String getFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
        String sqlfecha = formato.format(fecha);
        return sqlfecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	}
	
	///String////



