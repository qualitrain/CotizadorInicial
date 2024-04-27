package mx.com.qtx.articulos;

import java.util.ArrayList;

public class Pc extends Articulo {
	private ArrayList<Dispositivo> componentes;

	public Pc(String marca, String modelo, double costo, double precioBase) {
		super(marca, modelo, costo, precioBase);
		this.componentes = new ArrayList<>();
	}

	public ArrayList<Dispositivo> getComponentes() {
		return componentes;
	}

	public void agregarDispositivo(Dispositivo dispositivo) {
		this.componentes.add(dispositivo);
	}
	
	@Override
	public double getPrecioBase() {
		double precioPc = 0;
		for(Dispositivo dispoI : this.componentes) {
			precioPc += dispoI.getPrecioBase();
		}
		precioPc = precioPc * 0.8;
		return precioPc;
	}
	
	@Override
	public double cotizar(int cantidad) {
		return super.cotizar(cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + " " + "Pc [componentes=" + componentes + "]";
	}

	@Override
	public String getTipo() {
		return "PC";
	}

}
