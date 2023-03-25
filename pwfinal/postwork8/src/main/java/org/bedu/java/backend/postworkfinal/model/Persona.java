package org.bedu.java.backend.postworkfinal.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Objects;
@Entity
@Table(name = "persona")
public class Persona implements Comparable<Persona> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    @NotBlank(message = "Campo obligatorio")
    private String nombre;
    @Column(nullable = false, length = 100)
    private String apellido;
    @Column(nullable = false, length = 15, unique = true)
    @NotBlank(message = "campo obligatorio")
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    private String telefono;

    private int edad;

    public Persona() {
    }

    public Persona(Long id,String nombre, String apellido, int edad, String telefono) {
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
