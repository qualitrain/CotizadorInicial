package mx.com.qtx.cotizador;

public class DiscoDuro extends Articulo {
	private String almacenamiento;

	public DiscoDuro(String marca, String modelo, double costo, double precioBase, String almacenamiento) {
		super(marca, modelo, costo, precioBase);
		this.almacenamiento = almacenamiento;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return super.toString() + " " +
				"DiscoDuro [almacenamiento=" + almacenamiento + "]";
	}
	

}
