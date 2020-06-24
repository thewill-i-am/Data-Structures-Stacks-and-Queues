package cr.ac.ulead.ui;

import cr.ac.ulead.models.Mascota;
import cr.ac.ulead.models.Persona;

import java.io.PrintStream;
import java.util.Scanner;

public class UIUtils {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMenu() {
        output.println("Este es el menu");
        output.println("Serializar a Json o XML Persona");
        output.println("Serializar a Json o XML Mascota");
        output.println("Pila Persona");
        output.println("Cola circular Mascota");
        output.println("Cola circular Serializador Ulead");
    }

    public int darOpcion() {
        return input.nextInt();
    }

    public Persona llenarPersona(Persona persona) {
        output.println("Por favor digite el nombre de la persona");
        persona.setNombre(input.next());
        output.println("Por favor digite el apellido de la persona");
        persona.setApellido(input.next());
        output.println("Por favor digite la fecha de nacimiento de la persona");
        persona.setFechaNacimiento(input.next());
        output.println("Por favor digite la estatura de la persona");
        persona.setEstatura(input.nextFloat());
        output.println("Por favor digite los kilos de la persona");
        persona.setKilos(input.nextInt());
        return persona;
    }

    public Mascota llenarMascota(Mascota mascota) {
        output.println("Por favor digite el nombre de la mascota");
        mascota.setNombre(input.next());
        output.println("Por favor digite el tipo de animal que es la mascota");
        mascota.setTipoAnimal(input.next());
        output.println("Por favor digite la edad de la mascota");
        mascota.setEdad(input.nextInt());
        return mascota;
    }

    public void print(String serializado){
        output.print(serializado);
    }

    public boolean eleccion(String condicionante){
        System.out.println(condicionante);
        int numero = input.nextInt();
        if (numero == 0){
            return true;
        }else{
            return false;
        }
    }

    public int darTamanioPila(String condicionante){
        System.out.println(condicionante);
        int numero = input.nextInt();
        return numero;
    }

}
