package org.bedu.java.backend.postwork6.model;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido;
    private String telefono;
    private int id;

    public Persona(String nombre, String apellido, String telefono, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.id = id;
    }

    // getters y setters

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellido, persona.apellido) &&
                Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono, id);
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", id=" + id + "]";
    }

}
