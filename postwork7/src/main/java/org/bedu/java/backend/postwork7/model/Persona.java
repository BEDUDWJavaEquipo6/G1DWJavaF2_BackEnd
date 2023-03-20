package org.bedu.java.backend.postwork7.model;

//Librerias para postwork7 Validation Thymeleaf
//import jakarta.validation.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Persona  implements Comparable<Persona> {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @NotBlank(message = "La edad es obligatoria")
    private int edad;
    /*
    //@Email(regexp =".+@.+\\..+",message = "El correo electrónico tiene un formato incorrecto.")
    private String email;

    private String direccion;
    */
    //@NotBlank
    @NotBlank(message = "Campo obligatorio")
    private String id;
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    private String telefono;



    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
/*
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
*/
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(){

    }


    public Persona(String id,String nombre, String apellido, int edad, String telefono) {
        super();
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Persona [Id: " + id + ", nombre: " + nombre + ", apellido: " + apellido
                + ", edad: " + edad  + ", telefono: " + telefono  +  "]";

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
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}


