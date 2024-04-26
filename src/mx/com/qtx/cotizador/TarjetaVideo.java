package mx.com.qtx.cotizador;

public class TarjetaVideo extends Articulo {
	private String memoria;

	public TarjetaVideo(String marca, String modelo, double costo, double precioBase, String memoria) {
		super(marca, modelo, costo, precioBase);
		this.memoria = memoria;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return super.toString() + " TarjetaVideo [memoria=" + memoria + "]";
	}
	
	public double calcularPromocion3X2(int cantidad) {
		int cantidadReal = (cantidad / 3) * 2 + cantidad % 3;
		return this.getPrecioBase() * cantidadReal;
	}
	
	@Override
	public double cotizar(int cantidad) {
		return this.calcularPromocion3X2(cantidad);
	}
	
	@Override
	public String getTipo() {
		return "Tarjeta de Video";
	}

}
