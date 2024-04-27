package mx.com.qtx.pruebas;

import mx.com.qtx.articulos.Pc;
import mx.com.qtx.articulos.PcBuilder;

public class PcTests {

	public static void main(String[] args) {
//		test_crearPc();
		test_crearPc_Erronea();

	}

	private static void test_crearPc_Erronea() {
		PcBuilder builder = new PcBuilder();
		
		Pc nvaPc = builder.definirMarcaYmodelo("Clown", "Fiesta")
					       .agregarDisco("Seagate", "Naval", 1000, 2000, "1Tb")
					       .build();
		
		System.out.println(nvaPc);
	}

	private static void test_crearPc() {
		PcBuilder builder = new PcBuilder();
		
		Pc nvaPc = builder.definirMarcaYmodelo("Clown", "Fiesta")
					       .agregarDisco("Seagate", "Naval", 1000, 2000, "1Tb")
					       .agregarMonitor("Sony", "M-54", 1700, 2500)
					       .agregarMonitor("Dell", "Solar", 1200, 2000)
					       .agregarTarjetaVideo("Nvidia", "Geforce", 1500, 3000, "8Gb")
					       .build();
		
		System.out.println(nvaPc);
		System.out.println("precio = " + nvaPc.getPrecioBase());
		
	}

}
