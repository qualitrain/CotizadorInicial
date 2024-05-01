package mx.com.qtx.cotizador;

import mx.com.qtx.articulos.Articulo;

public interface ICotizador {
	void agregarArticulo(Articulo artI, int cantidad);
	Cotizacion emitirCotizacion();
	
	void eliminarArticulo(Articulo artI);
	String getIdCotizador();
}
