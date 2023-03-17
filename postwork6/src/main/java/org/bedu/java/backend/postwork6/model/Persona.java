package org.bedu.java.backend.postwork6.model;
public class Persona {
    private String name;
    private String telefono;

    public Persona(String name, String telefono) {
        this.name = name;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
