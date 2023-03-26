package org.bedu.java.backend.postworkfinal.model;

public class PersonaProbar extends Persona{
    private String nombre;
    private String telefono;

    public PersonaProbar(String nombre, String telefono) {
        super();
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
