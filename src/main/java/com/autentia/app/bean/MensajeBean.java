package com.autentia.app.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mensaje")
@SessionScoped
public class MensajeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String bienvenida = "Bienvenid@ a JSF 2.0";

	public String getBienvenida() {
		return bienvenida;
	}

	public void setBienvenida(String bienvenida) {
		this.bienvenida = bienvenida;
	}

}
