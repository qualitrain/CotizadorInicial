package mx.com.qtx.pruebas;

import mx.com.qtx.cotizador.Articulo;

public class ArticuloTests {

	public static void main(String[] args) {
		test_crearArticulo();
		test_cotizarArticulo();
	}

	private static void test_cotizarArticulo() {
		Articulo artNvo = new Articulo("SONY","W-56",1000,2000);
		System.out.println("Cotizando 5 artículos...");
		double totalCotizado = artNvo.cotizar(5);
		System.out.println("Total cotizado = " + totalCotizado);
	}

	private static void test_crearArticulo() {
		Articulo artNvo = new Articulo("SONY","W-56",1000,2000);
		System.out.println(artNvo.toString());
	}
	

}
