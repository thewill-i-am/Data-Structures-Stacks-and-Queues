package cr.ac.ulead.logica;
import cr.ac.ulead.models.Mascota;
import cr.ac.ulead.models.Persona;
import cr.ac.ulead.tda.Cola;
import cr.ac.ulead.tda.ColaSerializadorUlead;
import cr.ac.ulead.tda.Pila;
import cr.ac.ulead.ui.UIUtils;

public class Logic {
    public void execute(int logic) throws Exception {
        UIUtils ui = new UIUtils();
        switch (logic){
            case 1:
                Persona persona = new Persona();
                if (ui.eleccion("Digite 0 si quiere JSON o 1 si quiere XML")){
                    ui.print(ui.llenarPersona(persona).serializadorJSON());
                }else{
                    ui.print(ui.llenarPersona(persona).serializadorXML());
                }
                break;
            case 2:
                Mascota mascota = new Mascota();
                if (ui.eleccion("Digite 0 si quiere JSON o 1 si quiere XML")){
                    ui.print(ui.llenarMascota(mascota).serializadorJSON());
                }else{
                    ui.print(ui.llenarMascota(mascota).serializadorXML());
                }
                break;
            case 3:
                int tamanio = ui.darTamanioPila("Ingrese el tamanio de la pila");
                Pila pila = new Pila(tamanio);
                for (int i = 0; i < tamanio; i++) {
                    Persona personaPila = new Persona();
                    ui.print("\n Estas en el intento " + i + " te faltan " + (tamanio - i) + " \n");
                    boolean estaSacando = ui.eleccion("0 para sacar elemento, 1 para meter elemento");
                    if (!estaSacando){
                        pila.push(ui.llenarPersona(personaPila));
                    }else{
                        i--;
                        ui.print(pila.pop().serializadorJSON());
                    }
                }
                break;
            case 4:
                int tamanioCola = ui.darTamanioPila("Ingrese el tamanio de la cola");
                Cola cola = new Cola(tamanioCola);
                for (int i = 0; i < tamanioCola; i++) {
                    Mascota newMascotaCola = new Mascota();
                    ui.print("\n Estas en el intento " + i + " te faltan " + (tamanioCola - i) + " \n");
                    boolean estaSacando = ui.eleccion("0 para sacar elemento, 1 para meter elemento");
                    if (!estaSacando){
                        cola.enQueue(ui.llenarMascota(newMascotaCola));
                    }else{
                        i--;
                        ui.print(cola.deQueue().serializadorJSON());
                    }
                }
                break;
            case 5:
                Mascota newMascotaColaSerializador = new Mascota();
                Persona newPersonaColaSerializador = new Persona();
                int tamanioColaSerializador = ui.darTamanioPila
                        ("Ingrese el tamanio de la cola serializadorUlead");
                ColaSerializadorUlead colaSerializadorUlead = new ColaSerializadorUlead(tamanioColaSerializador);
                for (int i = 0; i < tamanioColaSerializador; i++) {
                    ui.print("\n Estas en el intento " + i + " te faltan " + (tamanioColaSerializador - i) + " \n");
                    boolean estaSacando = ui.eleccion("1 para sacar elemento, 0 para meter elemento");
                    if (estaSacando){
                        boolean isHuman = ui.eleccion("1 para elegir persona, 0 para elegir mascota");
                        if (!isHuman){
                            colaSerializadorUlead.enQueue(ui.llenarPersona(newPersonaColaSerializador));
                        }else{
                            colaSerializadorUlead.enQueue(ui.llenarMascota(newMascotaColaSerializador));
                        }
                    }else{
                        i--;
                        ui.print(colaSerializadorUlead.deQueue().serializadorJSON());
                    }
                }
            default:
                ui.print("meta un numero correcto");
                break;
        }
    }
}
