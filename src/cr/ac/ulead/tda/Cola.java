package cr.ac.ulead.tda;

import cr.ac.ulead.models.Mascota;

public class Cola {
    Mascota[] mascotas;
    private int tamanio = 0;
    private int head = -1;
    private int tail = -1;

    public Cola(int tamanio){
        this.tamanio = tamanio;
        mascotas = new Mascota[tamanio];
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

    public void enQueue(Mascota newMascota) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (head == -1)
                head = 0;
            tail = (tail + 1) % this.tamanio;
            mascotas[tail] = newMascota;
        }
    }

    public Mascota deQueue() throws Exception {
        Mascota mascota;
        if (isEmpty()) {
            throw new Exception("La cola esta vacia");
        } else {
            mascota = mascotas[head];
            if (head == tail) {
                head = -1;
                tail = -1;
            }
            else {
                head = (head + 1) % this.tamanio;
            }
            return mascota;
        }
    }
}
