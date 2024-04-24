package mx.com.qtx.pruebas;

import mx.com.qtx.cotizador.Articulo;
import mx.com.qtx.cotizador.Monitor;
import mx.com.qtx.cotizador.TarjetaVideo;

public class TarjetaVideoTests {

	public static void main(String[] args) {
		test_crearTarjetaVideo();
		test_cotizarTarjeta();
		test_calcularPromocion3X2();
		test_cotizarArticulos();
	}

	private static void test_calcularPromocion3X2() {
		TarjetaVideo tarjeta = new TarjetaVideo("Nvidia","Geforce",900,2000,"4Gb");
		for(int i=1; i<=7; i++) {
			double importePromocion3x2 = tarjeta.calcularPromocion3X2(i);
			System.out.println("con " + i + " unidades, el total es " + importePromocion3x2);
		}
		
	}

	private static void test_crearTarjetaVideo() {
		TarjetaVideo tarjeta = new TarjetaVideo("Nvidia","Geforce",900,1800,"4Gb");
		System.out.println(tarjeta);
	}

	private static void test_cotizarTarjeta() {
		TarjetaVideo tarjeta = new TarjetaVideo("Nvidia","Geforce",900,1800,"4Gb");
		System.out.println("Cotizando 5 tarjetas...");
		double totalCotizado = tarjeta.cotizar(5);
		System.out.println("Total cotizado = " + totalCotizado);
	}

	private static void test_cotizarArticulos() {
		Articulo[] arrArticulos = new Articulo[5];
		arrArticulos[0] = new Articulo("SONY","W-56",1000,2000);
		arrArticulos[1] = new TarjetaVideo("Nvidia","Geforce",900,1800,"4Gb");
		arrArticulos[2] = new TarjetaVideo("Nvidia","Geforce II",1000,2000,"6Gb");
		arrArticulos[3] = new Monitor("Dell","Corsair",1500,3000);
		arrArticulos[4] = new Monitor("HP","LookPrime",1600,3200);
		
		int[] arrCantAcotizar = {3,5,10,5,10};
		
		double totalCotizado = cotizar(arrArticulos, arrCantAcotizar);
		System.out.println("Total cotizado = " + totalCotizado);
	}

	private static double cotizar(Articulo[] arrArticulos, int[] arrCantAcotizar) {
		double totalCotizacion = 0;
		for(int i=0; i<arrArticulos.length; i++) {
			totalCotizacion += arrArticulos[i].cotizar(arrCantAcotizar[i]);
		}
		return totalCotizacion;
	}
}
