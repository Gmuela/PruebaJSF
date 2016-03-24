package com.autentia.app.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BeanForm4 implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	private String password;
	private String comentario;
	private String[] idiomas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public String getMostrarDatos() {

		if ("".equals(nombre) || nombre == null) {

			return "";

		}

		else {

			return "Estos son tus datos: <p>Nombre: " + nombre + "</p><p>Apellido: " + apellido + "</p><p>Contraseña: " + password + "</p><p>Comentario: " + comentario+ "</p>";
		}

	}
}