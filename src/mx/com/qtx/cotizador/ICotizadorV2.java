package mx.com.qtx.cotizador;

import mx.com.qtx.articulos.Articulo;

public interface ICotizadorV2 extends ICotizador {
	void eliminarArticulo(Articulo artI, String permisos);
}
