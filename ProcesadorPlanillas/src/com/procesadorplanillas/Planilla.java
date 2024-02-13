package com.procesadorplanillas;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.procesadorplanillas.proveedor.ProveedorMiembrosPlanilla;

public class Planilla {

	public Hashtable<Float, String> obtenerTotalPagoMensual(int periodo) {

		float totalMontoMensual = 0;
		List<Empleado> empleados = new ArrayList<Empleado>();
		boolean error = false;
		
		Hashtable<Float, String> respuesta = new Hashtable<Float,String>();

		ProveedorMiembrosPlanilla miembros_planilla = new ProveedorMiembrosPlanilla();
		empleados = miembros_planilla.obtenerEmpleados(periodo);

		for (int i = 0; i < empleados.size(); i++) {
			if(!validarRegistro(empleados.get(i))) {
				respuesta.clear();
				respuesta.put(0F, "Error");
				error = true;
				break;
			}
			totalMontoMensual = totalMontoMensual + empleados.get(i).getMontoMensual();
		}
		
		if(!error) {
			respuesta.put(totalMontoMensual, "OK");
		}

		return respuesta;

	}
	
	protected boolean validarRegistro(Empleado empleado) {
		
		if(empleado.getMontoMensual() < 0 || empleado.getId() == 0 || empleado.getNombre().equals("")) {
			return false;
		}
		return true;
	}

}
