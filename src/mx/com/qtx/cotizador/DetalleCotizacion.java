package mx.com.qtx.cotizador;

public class DetalleCotizacion {
	private int numDetalle;
	private int cantidad;
	private Articulo articulo;
	private double importeCotizado;

	public DetalleCotizacion() {
	}

	public DetalleCotizacion(int numDetalle, int cantidad, Articulo articulo, double importeCotizado) {
		super();
		this.numDetalle = numDetalle;
		this.cantidad = cantidad;
		this.articulo = articulo;
		this.importeCotizado = importeCotizado;
	}

	public int getNumDetalle() {
		return numDetalle;
	}

	public void setNumDetalle(int numDetalle) {
		this.numDetalle = numDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public double getImporteCotizado() {
		return importeCotizado;
	}

	public void setImporteCotizado(double importeCotizado) {
		this.importeCotizado = importeCotizado;
	}

	@Override
	public String toString() {
		return "DetalleCotizacion [numDetalle=" + numDetalle + ", cantidad=" + cantidad + ", articulo=" + articulo
				+ ", importeCotizado=" + importeCotizado + "]";
	}

}
