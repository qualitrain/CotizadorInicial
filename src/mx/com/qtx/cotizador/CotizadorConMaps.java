package mx.com.qtx.cotizador;

import java.time.LocalDate;
import java.util.HashMap;

import mx.com.qtx.articulos.Articulo;

public class CotizadorConMaps implements ICotizador{
	private HashMap<Articulo,Integer> mapaArticulosCotizados;

	public CotizadorConMaps() {
		super();
		this.mapaArticulosCotizados = new HashMap<>();
	}

	@Override
	public void agregarArticulo(Articulo artI, int cantidad) {
//		System.out.println("agregarArticulo(" + artI + ", " + cantidad);
//		System.out.println("artI =" + artI);
		
		int cantAnt = this.mapaArticulosCotizados.getOrDefault(artI,0);
		cantidad += cantAnt;
		this.mapaArticulosCotizados.put(artI, cantidad);
	}
	
	public void agregarArticulo(Articulo artI) {
		this.agregarArticulo(artI, 1);
	}

	@Override
	public Cotizacion emitirCotizacion() {
//		System.out.println("emitirCotizacion()");
		double total = 0;
		Cotizacion cotizacion = new Cotizacion();
		cotizacion.setFecha(LocalDate.now());
		for(Articulo artI:this.mapaArticulosCotizados.keySet()) {
//			System.out.println("artI¨=" + artI);
			int cantI = this.mapaArticulosCotizados.get(artI);
			double totArtCotizado = artI.cotizar(cantI);
			total += totArtCotizado;
			
			cotizacion.agregarDetalle(artI, cantI, totArtCotizado);
		}
		cotizacion.setTotal(total);
		return cotizacion;
	}

	@Override
	public void eliminarArticulo(Articulo artI) {
		this.mapaArticulosCotizados.remove(artI);
	}
	
	@Override
	public String getIdCotizador() {
		return this.getClass().getName();
	}

}
