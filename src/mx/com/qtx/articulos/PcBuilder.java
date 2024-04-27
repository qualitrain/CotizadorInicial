package mx.com.qtx.articulos;

import java.util.ArrayList;

public class PcBuilder {
	public static final int MIN_MONITORES = 1;
	public static final int MAX_MONITORES = 2;
	private ArrayList<DiscoDuro> discos;
	public static final int MIN_TARJETAS = 1;
	public static final int MAX_TARJETAS = 2;
	private ArrayList<TarjetaVideo> tarjetas;
	public static final int MIN_DISCOS = 1;
	public static final int MAX_DISCOS = 3;
	private ArrayList<Monitor> monitores;
	
	private String marcaPc;
	private String modeloPc;
	
	public PcBuilder() {
		super();
		this.discos = new ArrayList<>();
		this.tarjetas = new ArrayList<>();
		this.monitores = new ArrayList<>();
	}
	
	public PcBuilder agregarDisco(String marca, String modelo, double costo, 
			double precioBase, String almacenamiento) {
		if(this.discos.size() == PcBuilder.MAX_DISCOS) //
			return this;
		this.discos.add(new DiscoDuro(marca,modelo,costo,precioBase,almacenamiento));
		return this;
	}
	
	public PcBuilder agregarMonitor(String marca, String modelo, double costo, double precioBase) {
		if(this.monitores.size() == PcBuilder.MAX_MONITORES) //
			return this;
		this.monitores.add(new Monitor(marca,modelo,costo,precioBase));
		return this;
	}

	public PcBuilder agregarTarjetaVideo(String marca, String modelo, double costo, 
			double precioBase, String memoria) {
		if(this.tarjetas.size() == PcBuilder.MAX_TARJETAS) //
			return this;
		this.tarjetas.add(new TarjetaVideo(marca,modelo,costo,precioBase,memoria));
		return this;
	}
	
	public boolean pcEsValida() {
		if(this.marcaPc == null)
			return false;
		if(this.modeloPc == null)
			return false;
		if(this.discos.size() < PcBuilder.MIN_DISCOS)
			return false;
		if(this.monitores.size() < PcBuilder.MIN_MONITORES)
			return false;
		if(this.tarjetas.size() < PcBuilder.MIN_TARJETAS)
			return false;
		
		return true;
	}
	
	public PcBuilder definirMarcaYmodelo(String marca, String modelo) {
		this.marcaPc = marca;
		this.modeloPc = modelo;
		return this;
	}
	
	public Pc build() {
		Pc pc = new Pc(this.marcaPc, this.modeloPc, 0, 0);
		for(Dispositivo discoI : this.discos) {
			pc.agregarDispositivo(discoI);
		}
		for(Dispositivo monitorI : this.monitores) {
			pc.agregarDispositivo(monitorI);			
		}
		for(Dispositivo tarjetaI : this.tarjetas) {
			pc.agregarDispositivo(tarjetaI);			
		}
		if(this.pcEsValida())
			return pc;
		
		System.err.println("La Pc tiene errores de configuración");
		return null;
	}
	
}
