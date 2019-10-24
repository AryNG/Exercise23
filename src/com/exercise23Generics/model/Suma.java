package com.exercise23Generics.model;

public class Suma <T>{
	T Objeto;
	
	public Suma(T Objeto) {
		this.Objeto = Objeto;
	}
	public T getObj() {
		return this.Objeto;
	}
	public static <T extends Number,T2 extends Number> T SumaNumeros(T objeto1, T2 objeto2){
		Double resultado =0.0;
		resultado= objeto1.doubleValue() + objeto2.doubleValue();
		return (T)resultado;
	}
}
