package mx.com.qtx.cotizador;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cotizacion {

	private static int nCotizacion = 0;
	
	private ArrayList<DetalleCotizacion> detalles;
	private LocalDate fecha;
	private int numCotizacion;
	private double total;
	
	public Cotizacion() {
		Cotizacion.nCotizacion++;
		this.numCotizacion = Cotizacion.nCotizacion;
		this.detalles = new ArrayList<>();
	}

	public Cotizacion(LocalDate fecha, double total) {
		super();
		Cotizacion.nCotizacion++;
		this.numCotizacion = Cotizacion.nCotizacion;
		this.fecha = fecha;
		this.total = total;
		
		this.detalles = new ArrayList<>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNumCotizacion() {
		return numCotizacion;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Cotizacion [detalles=" + detalles + ", fecha=" + fecha + ", numCotizacion=" + numCotizacion + ", total="
				+ total + "]";
	}
	
	public void agregarDetalle(Articulo artI, int cantI, double importeI) {
		int nDetalle = this.detalles.size() + 1;
		DetalleCotizacion detI = new DetalleCotizacion(nDetalle, cantI, artI, importeI);
		this.detalles.add(detI);
	}
	
	public void mostrar() {
		System.out.printf(" Cant. %15s %20s %10s\n", "Articulo", "Precio", "Total");
		for(DetalleCotizacion detI : this.detalles) {
			Articulo artI = detI.getArticulo();
			System.out.println(String.format("%5d ", detI.getCantidad())
			         + String.format("%-30s", artI.getTipo() + " " + artI.getMarca() + " " +artI.getModelo())
			         + String.format(" %8.2f", artI.getPrecioBase())
			         + String.format(" %10.2f", detI.getImporteCotizado())
			         );
		}
		String cadTotal = String.format("%12.2f",this.total);
		System.out.println(String.format("%56s", cadTotal));
	}

	
}
