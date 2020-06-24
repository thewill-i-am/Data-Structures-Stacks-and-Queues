package cr.ac.ulead.tda;

import cr.ac.ulead.models.Persona;

public class Pila {
    Persona[] persona;
    int top = 0;

    public Pila(int tamanio) {
        persona = new Persona[tamanio];
    }

    private boolean estaVacia(){
        return top == 0;
    }

    public void push(Persona newPersona){
        persona[top] = newPersona;
        top++;
    }

    public Persona pop () throws Exception {
        if (!estaVacia()) {
            top = top -1;
            return persona[top];
        } else {
            throw new Exception("Cola vacia");
        }
    }
}
