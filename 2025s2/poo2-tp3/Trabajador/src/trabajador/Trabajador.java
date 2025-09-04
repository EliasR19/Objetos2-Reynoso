package trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
		private List<Ingreso> ingresosAnueales;
		
		
	
	
		public Trabajador() {
			this.ingresosAnueales = new ArrayList<Ingreso>();
		}
		
		public void agregarIngreso(Ingreso i) {
			ingresosAnueales.add(i);
		}
		
		public double getTotalPercibido() {
			return ingresosAnueales.stream().mapToDouble(i -> i.getMontoPercibido()).sum();
			
		}
		
		public double getMontoImponible() {
			return ingresosAnueales.stream().mapToDouble(i -> i.montoImponible()).sum();
			
		}
		
		
		public double getImpuestoAPagar() {
			return (this.getMontoImponible()*2) /100;
			
		}
}
