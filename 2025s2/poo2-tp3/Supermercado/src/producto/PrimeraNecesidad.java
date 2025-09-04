package producto;

public class PrimeraNecesidad extends Producto {
	private double descuento;
	
	
	public PrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}

	
	public double getPrecio() {
		return (this.getPrecio()*descuento) / 100;
		
		
	}
	
	
}
