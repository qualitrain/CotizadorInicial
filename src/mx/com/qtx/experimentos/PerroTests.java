package mx.com.qtx.experimentos;

import java.util.ArrayList;

public class PerroTests {

	public static void main(String[] args) {
		
		System.out.println("Hay " + Perro.contarPerros() + " perros");
		
		ArrayList<Perro> listaPerros = new ArrayList<>();
		
		listaPerros.add(new Perro("Fido","Boxer",20));
		listaPerros.add(new Perro("Snoopy","Beagle",10));
		
		System.out.println("Hay " + Perro.contarPerros() + " perros");
		System.out.println(listaPerros);
		
//		test_constructorPorDefecto();
	}

	private static void test_constructorPorDefecto() {
		Perro firulais = new Perro();
		System.out.println("firulais:" + firulais);
	}

}
