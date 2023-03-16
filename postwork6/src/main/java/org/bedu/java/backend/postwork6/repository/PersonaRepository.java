package org.bedu.java.backend.postwork6.repository;
/*
Almacene la información en memoria usando un Set de Java que ordene las entradas de forma
 alfabética por el nombre de la  persona. Para lograr esto Persona deberá implementar la
 interface java.lang.Comparable

 Metodos:
 addPersona to DB(lista_PhoneBook)
    add(new Persona persona to lista_persona)
 readPersonas from DB(lista_PhoneBook)
    -read/list/Personas  lista_PhoneBook
    -return lista Personas

 Opcional: read one Persona, para future GET by Id
 */


import java.util.Set;
import java.util.TreeSet;
@Repository
public class PhoneBook{
    //private static Set<Persona> phoneBook new Set<>();

    /*
    https://stackoverflow.com/questions/12314710/how-do-i-keep-a-hashset-alphabetically-ordered
    Note: duplicate objects are not allowed in TreeSet but allowed in TreeMap.


I would use a TreeSet which is a SortedSet. You need to define your custom class as Comparable based on the name and your collection will always be sorted.
     */
    private static Set<Persona> phoneBook = new TreeSet<Persona>();

    /**
     * Metodo que agrega persona al PhoneBook
     * @param persona EL objeto Persona que vamos a agregar al directorio
     * @return 1era Fase: Exito si lo metio / 2nda Fase: el Card de la persona recien ingresado
     */
    public Persona addPersona(Persona persona){
        phoneBook.add(persona);
        return "Persona Added Succesfully" //Probar pimero que lo meta
        //return persona;         //Si lo metio, regresa ya el Card de Persona
    }

    /**
     * Metodo que lee el contenido del PhoneBook
     * @return
     */
    public Set<Persona> readListaPhoneBook(){
        return phoneBook;
    }
}