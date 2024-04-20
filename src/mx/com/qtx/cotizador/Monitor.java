package mx.com.qtx.cotizador;

public class Monitor extends Articulo{

	public Monitor(String marca, String modelo, double costo, double precioBase) {
		super(marca, modelo, costo, precioBase);
	}
	
	public double calcularPromocionDsctoXcantidad(int cantidad) {
		if(cantidad < 3)
			return cantidad * this.getPrecioBase();
		if(cantidad < 6)
			return cantidad * this.getPrecioBase() * 0.95;
		return cantidad * this.getPrecioBase() * 0.90;
	}

	@Override
	public double cotizar(int cantidad) {
		return this.calcularPromocionDsctoXcantidad(cantidad);
	}

}
