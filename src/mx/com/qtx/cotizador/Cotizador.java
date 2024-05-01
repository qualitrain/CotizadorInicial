package mx.com.qtx.cotizador;

import java.time.LocalDate;
import java.util.ArrayList;

import mx.com.qtx.articulos.Articulo;

public class Cotizador implements ICotizador {
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
	
	public void desplegarCotizacion() {
		double total = 0;
		System.out.printf(" Cant. %15s %20s %10s\n", "Articulo", "Precio", "Total");
		for(int i=0; i<this.lstArticulos.size(); i++) {
			Articulo artI = this.lstArticulos.get(i);
			int cantI = this.lstCantidades.get(i);
			double totArtCotizado = artI.cotizar(cantI);
			total += totArtCotizado;
			
			System.out.println(String.format("%5d ",cantI)
					         + String.format("%-30s",artI.getTipo() + " " + artI.getMarca() + " " +artI.getModelo())
					         + String.format(" %8.2f", artI.getPrecioBase())
					         + String.format(" %10.2f", totArtCotizado)
					         );
		}
		String cadTotal = String.format("%12.2f",total);
		System.out.println(String.format("%56s", cadTotal));
	}
	
	public Cotizacion emitirCotizacion() {
		double total = 0;
		Cotizacion cotizacion = new Cotizacion();
		cotizacion.setFecha(LocalDate.now());
//		System.out.printf(" Cant. %15s %20s %10s\n", "Articulo", "Precio", "Total");
		for(int i=0; i<this.lstArticulos.size(); i++) {
			Articulo artI = this.lstArticulos.get(i);
			int cantI = this.lstCantidades.get(i);
			double totArtCotizado = artI.cotizar(cantI);
			total += totArtCotizado;
			
			cotizacion.agregarDetalle(artI, cantI, totArtCotizado);
		}
		cotizacion.setTotal(total);
		return cotizacion;
	}

	@Override
	public void eliminarArticulo(Articulo artI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdCotizador() {
		return this.getClass().getName();
	}
}
