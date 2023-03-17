package org.bedu.java.backend.postwork6.model;
public class Persona implements Comparable<Persona> {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // getters y setters

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

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Persona)) return false;
        Persona p = (Persona) obj;
        return Objects.equals(id, p.id) &&
                Objects.equals(nombre, p.nombre) &&
                Objects.equals(apellido, p.apellido) &&
                Objects.equals(telefono, p.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, telefono);
    }
}
