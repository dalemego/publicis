package com.procesadorplanillas.test;

import java.util.Hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.procesadorplanillas.Planilla;
import com.procesadorplanillas.proveedor.ProveedorMiembrosPlanilla;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PlanillaTest {

	@Test
	public void test1RegistroCorrecto() {
		
		Hashtable<Float, String> respuesta;
		
		Planilla planilla = new Planilla();
		respuesta = planilla.obtenerTotalPagoMensual(1);
		
		Assertions.assertEquals("OK", respuesta.entrySet().iterator().next().getValue());
	}
	
	@Test
	public void testIdCero() {
		
		ProveedorMiembrosPlanilla miembros_planilla = new ProveedorMiembrosPlanilla();
		miembros_planilla.agregarEmpleado(0, "Daniel", 120000F, true);
		
		Hashtable<Float, String> respuesta;
		
		Planilla planilla = new Planilla();
		respuesta = planilla.obtenerTotalPagoMensual(1);
		
		Assertions.assertEquals("Error", respuesta.entrySet().iterator().next().getValue());
	}
	
	@Test
	public void testNombreVacio() {
		
		ProveedorMiembrosPlanilla miembros_planilla = new ProveedorMiembrosPlanilla();
		miembros_planilla.agregarEmpleado(5, "", 120000F, true);
		
		Hashtable<Float, String> respuesta;
		
		Planilla planilla = new Planilla();
		respuesta = planilla.obtenerTotalPagoMensual(1);
		
		Assertions.assertEquals("Error", respuesta.entrySet().iterator().next().getValue());
	}
	
	@Test
	public void testMontoNegativo() {
		
		ProveedorMiembrosPlanilla miembros_planilla = new ProveedorMiembrosPlanilla();
		miembros_planilla.agregarEmpleado(6, "DanielM", -120000F, true);
		
		Hashtable<Float, String> respuesta;
		
		Planilla planilla = new Planilla();
		respuesta = planilla.obtenerTotalPagoMensual(1);
		
		Assertions.assertEquals("Error", respuesta.entrySet().iterator().next().getValue());
	}

}
