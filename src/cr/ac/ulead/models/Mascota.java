package cr.ac.ulead.models;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class Mascota implements SerializadorUlead {
    private String nombre;
    private String tipoAnimal;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String serializadorXML() {
        return "<Mascota> \n" +
                "<Nombre>" + getNombre() + "</Nombre> \n" +
                "<tipoAnimal>" + getTipoAnimal() +
                "</tipoAnimal> \n"
                + "<Edad>" +  getEdad() +
                "</Edad> \n" + "</Mascota>";
    }

    @Override
    public String serializadorJSON() {
        return "{ nombre: " + getNombre() + ", tipoAnimal: " +
                getTipoAnimal() + ", edad: " + getEdad()  + " }";
    }
}
