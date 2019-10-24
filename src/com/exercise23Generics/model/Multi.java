package com.exercise23Generics.model;

public class Multi {
	public static <T> String MuestraTipoDato(T objeto) {
		return " Tipo de dato es: "+objeto.getClass()+"\nNombre del parámetro: "+objeto.getClass().getClass()+"\nValor del elemento: "+objeto;
	}

}
