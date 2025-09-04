package producto;

public class Producto {
	protected String nombre;
	protected double precio;
	protected boolean precioCuidado;

	public Producto(String nombre, double precio){
		this.nombre= nombre;
		this.precio=precio;
		precioCuidado=false;
	}

	public Producto(String nombre, double precio, boolean precioCuidado){
		this.nombre= nombre;
		this.precio=precio;
		this.precioCuidado=precioCuidado;
	}
	
	
	
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio(){
		return this.precio;
	}

	public void aumentarPrecio(double aumento) {
		precio = precio * aumento;
	}

}
