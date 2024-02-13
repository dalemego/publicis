package com.procesadorplanillas.proveedor;

import java.util.ArrayList;
import java.util.List;

import com.procesadorplanillas.Empleado;

public class ProveedorMiembrosPlanilla {
	
	//Clase solo de ejemplo para elaboracion de casos de prueba.
	//La clase se asume como una libreria que se importa desde ProcesadorPlanillas
	
	private static List<Empleado> empleados = new ArrayList<>();
	
	static {
		empleados.add(new Empleado(1,"Daniel", 200000F, true));
		empleados.add(new Empleado(2,"Alejandro", 150000F, true));
		empleados.add(new Empleado(3,"Juan", 80000F, true));		
	}
	
	public List<Empleado> obtenerEmpleados(int periodo) {
		
		//periodo corresponde al numero de mes, como no conocemos la implementacion
		//del servicio externo, simplemente retornamos la lista.
		
		return empleados;
	}
	
	//Metodo de prueba adicional para agregar elementos a la lista desde JUnit
	public void agregarEmpleado(int id, String nombre, float montoMensual, boolean activo) {
		empleados.add(new Empleado(id,nombre,montoMensual,activo));
	}

}
                                  