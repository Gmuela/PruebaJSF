package com.autentia.app.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class HolaMundo {

	// propiedad
	 private String mensaje;

	 // constructor vacio
	 public HolaMundo() {
	 
	 }

	 // m�todo GET para acceder
	 public String getMensaje() {
	  return mensaje;
	 }

	 // m�todo SET para escribir
	 public void setMensaje(String mensaje) {
	  this.mensaje = mensaje;
	 }

	 // m�todo a ser ejecutado en Fase 5
	 public String accion() {
	  mensaje = "Hola Mundo!";
	  return null;
	 }
	
}
