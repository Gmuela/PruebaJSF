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

	 // método GET para acceder
	 public String getMensaje() {
	  return mensaje;
	 }

	 // método SET para escribir
	 public void setMensaje(String mensaje) {
	  this.mensaje = mensaje;
	 }

	 // método a ser ejecutado en Fase 5
	 public String accion() {
	  mensaje = "Hola Mundo!";
	  return null;
	 }
	
}
