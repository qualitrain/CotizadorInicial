package mx.com.qtx.articulos;

public class DiscoDuro extends Dispositivo {
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
	@Override
	public String getTipo() {
		return "Disco duro";
	}

}
