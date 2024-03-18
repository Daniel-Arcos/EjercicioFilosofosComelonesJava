public class Tenedor {
    
    private boolean ocupado;

    public Tenedor () {
        ocupado = false;
    }

    public synchronized void TomarTenedor() {
        while (ocupado) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        ocupado = true;
    }

    public synchronized void DesocuparTenedor() {
        ocupado = false;
        notifyAll();
    }

    public boolean EstadoOcupado() {
        return ocupado;
    }
}
