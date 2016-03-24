package com.autentia.app.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SaludoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{mensaje}")
	private MensajeBean mensajeBean;

	private String nombre;

	public void setMensajeBean(MensajeBean mensajeBean) {
		this.mensajeBean = mensajeBean;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getdarBienvenida() {

		if ("".equals(nombre) || nombre == null) {
			return "";
		}

		else {
			return mensajeBean.getBienvenida() + " " + nombre;
		}
	}

}
