package mx.com.qtx.cotizador;

public class Articulo {
	protected String marca;
	protected String modelo;
	protected double costo;
	protected double precioBase;
	
	public Articulo(String marca, String modelo, double costo, double precioBase) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
		this.precioBase = precioBase;
	}
	
	public static Articulo crearArticulo(String tipo, String marca, String modelo, 
			                             double costo, double precioBase, String memoria) {
		switch(tipo) {
		case "TarjetaVideo":
			return new TarjetaVideo(marca,modelo,costo,precioBase,memoria);
		case "Monitor":
			return new Monitor(marca,modelo,costo,precioBase);
		case "Generico":
			return new Articulo(marca,modelo,costo,precioBase);
		}
		return null;
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
