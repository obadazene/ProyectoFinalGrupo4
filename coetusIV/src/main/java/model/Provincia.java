package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROVINCIA")
public class Provincia {
private int id;
private String nombreProvincia;
@Id
@GeneratedValue
@Column(name = "PROVINCIA_ID")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombreProvincia() {
	return nombreProvincia;
}
public void setNombreProvincia(String nombreProvincia) {
	this.nombreProvincia = nombreProvincia;
}

}
