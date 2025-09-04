package trabajador;

public class IngresoPorHorasExtra extends Ingreso{
	private int cantHorasExtras;	
	
	public IngresoPorHorasExtra(String mesPercepcion, String concepto, double montoPercibido, int cantHorasExtras) {
		super(mesPercepcion, concepto, montoPercibido);
		this.cantHorasExtras=cantHorasExtras;
	}
	
	
	public double montoImponible() {
		return 0;
	}
}
