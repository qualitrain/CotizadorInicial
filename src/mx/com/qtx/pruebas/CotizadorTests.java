package mx.com.qtx.pruebas;

import mx.com.qtx.cotizador.Articulo;
import mx.com.qtx.cotizador.Cotizador;

public class CotizadorTests {

	public static void main(String[] args) {
		test_emisionCotizacion();

	}

	private static void test_emisionCotizacion() {
		Cotizador cotizador = new Cotizador();
		
		cotizador.agregarArticulo(Articulo.crearArticulo("TarjetaVideo","Nvdia", "Solaris", 800, 1600, "4Gb"), 7);
		cotizador.agregarArticulo(Articulo.crearArticulo("Monitor","HP","Goliat",1600,3000,null), 5);
		cotizador.agregarArticulo(Articulo.crearArticulo("Generico","Mouse Genius","X-25",120,250,null), 10);
		
		cotizador.emitirCotizacion();
	}

}
