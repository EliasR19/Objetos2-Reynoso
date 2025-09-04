package trabajador;

import java.time.LocalDate;

public class Ingreso {
	private String mesPercepcion;
	private String concepto;
	private double montoPercibido;
	
	
	public String getMesPercepcion() {
		return mesPercepcion;
	}


	public String getConcepto() {
		return concepto;
	}


	public double getMontoPercibido() {
		return montoPercibido;
	}


	public Ingreso(String mesPercepcion, String concepto, double montoPercibido) {
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public double montoImponible() {
		return this.getMontoPercibido();
	}




}
