package com.exercise23Generics.app;
import com.exercise23Generics.model.Multi;
import com.exercise23Generics.model.Resta;
import com.exercise23Generics.model.Suma;
public class GenericsApp {

	public static void main(String[] args) {
		Suma<Integer> Objeto = new Suma <Integer>(15);
		Suma<String> ObjetoString = new Suma<String>("Testo");
		Resta<Integer, Integer> ObjetoResta0 = new Resta<Integer, Integer>(23,32);
		Resta<Integer, Integer> ObjetoResta = new Resta<Integer, Integer>();
		
		
		
		System.out.println("Objeto de mi objeto: "+Objeto.getObj());
		System.out.println("Objeto de mi objeto String: "+ObjetoString.getObj());
		
		ObjetoResta.setKey(100);
		ObjetoResta.setValue(200);
		System.out.println("\nObjeto Resta1:"+ObjetoResta0.ToString());
		System.out.println("Objeto Resta2:"+ObjetoResta.ToString());
		
		System.out.println("\n"+Multi.MuestraTipoDato(10));
		System.out.println("\n"+Multi.MuestraTipoDato("Cyan"));
		System.out.println(Multi.MuestraTipoDato(10.0));
		
		System.out.printl("10.0 + 10.0: "+Suma.SumaNumeros(10, 10));

	}

}
