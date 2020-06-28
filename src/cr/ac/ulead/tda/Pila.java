package cr.ac.ulead.tda;

import cr.ac.ulead.models.Persona;

import java.util.PriorityQueue;

public class Pila {
    Persona[] persona;
    PriorityQueue<Float> alturas = new PriorityQueue<>();
    int top = 0;

    public Pila(int tamanio) {
        persona = new Persona[tamanio];
    }

    private boolean estaVacia(){
        return top == 0;
    }

    public void push(Persona newPersona){
        persona[top] = newPersona;
        alturas.add(persona[top].getEstatura());
        top++;
    }

    public Persona pop () throws Exception {
        if (!estaVacia()) {
            top = top -1;
            alturas.remove(persona[top].getEstatura());
            return persona[top];
        } else {
            throw new Exception("Cola vacia");
        }
    }

    public float menorEstatura () throws Exception {
        try{
            return alturas.peek();
        }catch (Exception e){
            throw new Exception ("No hay datos en la pila ");
        }

    }
}
