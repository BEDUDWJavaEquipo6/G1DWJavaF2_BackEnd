package org.bedu.java.backend.postworkfinal.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import java.util.Objects;
@Entity
@Table(name = "persona")
public class Persona implements Comparable<Persona> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre es obligatorio")
    @Column(nullable = false, length = 100)
    private String nombre;

    @NotEmpty(message = "El apellido es obligatorio")
    @Column(nullable = false, length = 100)
    private String apellido;

    @NotEmpty(message = "campo obligatorio")
    //@Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    @Pattern(regexp = "^(\\(\\d{2}\\)[- .]?\\d{4}[- .]?\\d{4})|(\\d{3})[-.s](\\d{3})[-.s](\\d{4})|(\\d{2})[-.s](\\d{4})[-.s](\\d{4})$", message = "El teléfono debe tener un formato de ##-####-####")
    @Column(nullable = false, length = 15) //unique = true)
    private String telefono;
    @Positive(message = "valores mayor a 0")
    private int edad;

    public Persona() {
    }

    public Persona(Long id,String nombre, String apellido,  String telefono,int edad) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Persona [Id: " + id + ", nombre: " + nombre + ", apellido: " + apellido
                +  ", telefono: " + telefono  + ", edad: " + edad  + "]";
        /*
                + ", email: " + email + ", telefono: " + telefono + ", direccio: " + direccion
                + ", id: " + id + "]";
         */
    }

   /* @Override
    public int Persona compareTo(Persona p){
        //Comparar dos obj Persona por campops nombre y apellido o será objeto completo..perguntar equipo y Expert
            if(this.apellido==p.apellido)
                return 0;
            else if(this.apellido>p.apellido)
                return 1;
            else
                return -1;
        this.persona
    }
    @Override
    public String (){
        //Comparar dos obj Persona
    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}
