package mx.com.qtx.cotizador;

import java.util.ArrayList;

public class Cotizador {
	private ArrayList<Articulo> lstArticulos;
	private ArrayList<Integer> lstCantidades;

	public Cotizador() {
		super();
		this.lstArticulos = new ArrayList<>();
		this.lstCantidades = new ArrayList<>();
	}
	
	public void agregarArticulo(Articulo artI, int cantidad) {
		this.lstArticulos.add(artI);
		this.lstCantidades.add(cantidad);
	}
	
	public void emitirCotizacion() {
		double total = 0;
		System.out.printf(" Cant. %15s %10s %10s\n", "Articulo", "Precio", "Total");
		for(int i=0; i<this.lstArticulos.size(); i++) {
			Articulo artI = this.lstArticulos.get(i);
			int cantI = this.lstCantidades.get(i);
			double totArtCotizado = artI.cotizar(cantI);
			total += totArtCotizado;
			
			System.out.println(String.format("%5d ",cantI)
					         + String.format("%-20s", artI.getMarca() + " " +artI.getModelo())
					         + String.format(" %8.2f", artI.getPrecioBase())
					         + String.format(" %10.2f", totArtCotizado)
					         );
		}
		String cadTotal = String.format("%12.2f",total);
		System.out.println(String.format("%46s", cadTotal));
	}
	
}
