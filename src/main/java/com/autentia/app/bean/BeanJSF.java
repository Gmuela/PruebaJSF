package com.autentia.app.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BeanJSF implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;

	public String getNombre() {

		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getHolaNombre() {

		if ("".equals(nombre) || nombre == null) {

			return "";

		}

		else {

			return "Ajax dice: Hola " + nombre + " " + apellido;
		}
	}
}
