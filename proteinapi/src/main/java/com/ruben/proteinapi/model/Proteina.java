package com.ruben.proteinapi.model;


import javax.persistence.*;

@Entity
@Table(name= "proteina")
public class Proteina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column private String nombre;
    @Column private double peso;
    @Column private double precio;

    public Proteina() {}

    public Proteina(Integer id, String nombre, double peso, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*
    @Override
    public String toString() {
        return "Proteina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
    */
}

