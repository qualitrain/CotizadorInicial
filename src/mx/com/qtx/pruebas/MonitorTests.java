package mx.com.qtx.pruebas;

import mx.com.qtx.articulos.Articulo;
import mx.com.qtx.articulos.Monitor;

public class MonitorTests {

	public static void main(String[] args) {
		test_calcularPromocionDsctoXcantidad();
	}

	private static void test_calcularPromocionDsctoXcantidad() {
		Monitor monitor = new Monitor("DELL","Corsair",1300,2000);
		for(int i=1; i<=7; i++) {
			double importePromocion = monitor.calcularPromocionDsctoXcantidad(i);
			System.out.println("con " + i + " unidades, el total es " + importePromocion);
		}
		
	}

}
