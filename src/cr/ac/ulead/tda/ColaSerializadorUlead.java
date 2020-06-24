package cr.ac.ulead.tda;

import cr.ac.ulead.interfaces.SerializadorUlead;

public class ColaSerializadorUlead {
    SerializadorUlead[] serializadorUlead;
    private int tamanio = 0;
    private int head = -1;
    private int tail = -1;

    public ColaSerializadorUlead(int tamanio) {
        this.tamanio = tamanio;
        serializadorUlead = new SerializadorUlead[tamanio];
    }

    private boolean isFull() {
        if (head == 0 && tail == this.tamanio - 1) {
            return true;
        }
        if (head == tail + 1) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if (tail == -1)
            return true;
        else
            return false;
    }

    public void enQueue(SerializadorUlead newSerializadorUlead) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (head == -1)
                head = 0;
            tail = (tail + 1) % this.tamanio;
            serializadorUlead[tail] = newSerializadorUlead;
        }
    }

    public SerializadorUlead deQueue() throws Exception {
        SerializadorUlead serializableLeadRemoved;
        if (isEmpty()) {
            throw new Exception("La cola esta vacia");
        } else {
            serializableLeadRemoved = this.serializadorUlead[head];
            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head = (head + 1) % this.tamanio;
            }
            return serializableLeadRemoved;
        }
    }
}
