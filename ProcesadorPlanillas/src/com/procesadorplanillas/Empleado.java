package com.procesadorplanillas;

public class Empleado {
	
	private int Id;
	private String nombre;
	private float montoMensual;
	private boolean activo;
	
	public Empleado(int id, String nombre, float montoMensual, boolean activo) {
		super();
		Id = id;
		this.nombre = nombre;
		this.montoMensual = montoMensual;
		this.activo = activo;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getMontoMensual() {
		return montoMensual;
	}
	public void setMontoMensual(float montoMensual) {
		this.montoMensual = montoMensual;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	@Override
	public String toString() {
		return "Empleado [Id=" + Id + ", nombre=" + nombre + ", montoMensual=" + montoMensual + ", activo=" + activo
				+ "]";
	}
	
}
