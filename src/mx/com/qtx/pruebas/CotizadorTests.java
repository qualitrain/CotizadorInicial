package mx.com.qtx.pruebas;

import mx.com.qtx.articulos.Articulo;
import mx.com.qtx.cotizador.Cotizacion;
import mx.com.qtx.cotizador.Cotizador;

public class CotizadorTests {

	public static void main(String[] args) {
		test_emisionCotizacion();

	}

	private static void test_emisionCotizacion() {
		Cotizador cotizador = new Cotizador();
		
		cotizador.agregarArticulo(Articulo.crearArticulo("TarjetaVideo","Nvdia", "Solaris", 800, 1600, "4Gb",null), 7);
		cotizador.agregarArticulo(Articulo.crearArticulo("Monitor","HP","Goliat",1600,3000, null, null), 5);
		cotizador.agregarArticulo(Articulo.crearArticulo("Generico","Mouse Genius","X-25",120,250,null,null), 10);
		cotizador.agregarArticulo(Articulo.crearArticulo("DiscoDuro", "SeaGate", "Saturn", 1100, 2000, null, "1Tb"), 5);
		
		Cotizacion cotizacion = cotizador.emitirCotizacion();
		cotizacion.mostrar();
	}

}
