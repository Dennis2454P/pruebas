package com.app.gbs.modelo;

import jakarta.persistence.*;


/*tabla de usuarios a registrar */
@Entity
@Table(name = "users")
public class Usuarios {
	/*llave primaria autoicremntal*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NombreCompleto;
    
    /*
    private int NumeroDNI;
 /*   private String email;
    private int telefono;
    private String contraseña;*/
    
    /**/
    
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
	public String getNombreCompleto() {
		return NombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

}

