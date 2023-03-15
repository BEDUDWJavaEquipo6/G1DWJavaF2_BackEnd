package org.bedu.java.backend.postwork6.model;

public class Persona {
    private String nombre;
    private String apellido;

    private int edad;
    /*
    private String email;

    private String direccion;
    */
    private String id;
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
}


