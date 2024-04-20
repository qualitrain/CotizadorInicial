package mx.com.qtx.cotizador;

public class Articulo {
	private String marca;
	private String modelo;
	private double costo;
	private double precioBase;
	
	public Articulo(String marca, String modelo, double costo, double precioBase) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Articulo [marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + ", precioBase=" + precioBase
				+ "]";
	}

	public double cotizar(int cantidad) {
		double importeCotizado = cantidad * this.precioBase;
		return importeCotizado;
	}
	
}
