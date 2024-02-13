package com.procesadorplanillas;

import java.util.Hashtable;

public class ProcesadorPlanillas {
	
	public static void main (String[] args) {
		
		Planilla planilla = new Planilla();
		Hashtable<Float, String> respuesta;
		
		respuesta = planilla.obtenerTotalPagoMensual(1);
		
		float totalPagoMensual = respuesta.keySet().iterator().next();
		
		System.out.println("El pago mensual total es: $" + totalPagoMensual);
	}

}
