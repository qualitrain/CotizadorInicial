package mx.com.qtx.experimentos;

public class Perro {
	private String nombre;
	private String raza;
	private float peso;
	
	private static int nPerros = 0;
	
	public Perro(String nombre, String raza, float peso) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		
		Perro.nPerros++;
	}
	
	
	public Perro() {
		super();
		this.nombre = "Solovino";
		this.raza = "Criollo";
		this.peso = 10;
		
		Perro.nPerros++;		
	}

	public static int contarPerros() {
		return Perro.nPerros;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + "]";
	}
	
	
}
