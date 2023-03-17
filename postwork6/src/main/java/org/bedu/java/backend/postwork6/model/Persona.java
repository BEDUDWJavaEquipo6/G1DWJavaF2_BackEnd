package org.bedu.java.backend.postwork6.model;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = limpiarTelefono(telefono);
    }

    private String limpiarTelefono(String telefono) {
        return "(" + telefono.substring(0, 2) + ")-" + telefono.substring(2, 6) + "-" + telefono.substring(6, 10);
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
