package producto;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;	

	public Supermercado(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public int getCantidadDeProductos(){
		return productos.size();
	}


	public double getPrecioTotal(){
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();	
	}

}