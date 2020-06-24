package cr.ac.ulead.models;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class Persona implements SerializadorUlead {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int kilos;
    private float estatura;

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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String serializadorXML() {
        return "<Persona> \n" +
                " <Nombre>" + getNombre() + "</Nombre> \n" +
                " <Apellido>" + getApellido() + "</Apellido> \n"
                + " <FechaNacimiento> " +
                getFechaNacimiento() + "</FechaNacimiento> \n"
                + " <Estatura>" + getEstatura() + "</Estatura> \n" +
                " <Kilos>" + getKilos() + "</Kilos> \n"
                + "</Persona> " ;
    }

    @Override
    public String serializadorJSON() {
        return "{ nombre: " + getNombre() + ", apellido: " +
                getApellido() + ", fechaNacimiento: " + getFechaNacimiento()
                + ", estatura :" + getEstatura() + ", kilos :" + getKilos() +  " }";
    }
}
