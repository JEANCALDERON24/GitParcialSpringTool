package api.cinestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Cine {
@Id 
private Integer id;

private String RazonSocial;

private Integer Salas;

private Integer idDistrito;

private String Direccion;

private String Telefonos;

private String Detalle;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getRazonSocial() {
	return RazonSocial;
}

public void setRazonSocial(String razonSocial) {
	RazonSocial = razonSocial;
}

public Integer getSalas() {
	return Salas;
}

public void setSalas(Integer salas) {
	Salas = salas;
}

public Integer getIdDistrito() {
	return idDistrito;
}

public void setIdDistrito(Integer idDistrito) {
	this.idDistrito = idDistrito;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public String getTelefonos() {
	return Telefonos;
}

public void setTelefonos(String telefonos) {
	Telefonos = telefonos;
}

public String getDetalle() {
	return Detalle;
}

public void setDetalle(String detalle) {
	Detalle = detalle;
}

}
