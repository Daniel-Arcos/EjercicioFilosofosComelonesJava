public class Filosofo extends Thread {
    private int nombre;
    private Tenedor tenedorIzq;
    private Tenedor tenedorDer;

    public Filosofo(int nombre, Tenedor tenedorizq, Tenedor tenedorder) {
        this.nombre = nombre;
        this.tenedorDer = tenedorder;
        this.tenedorIzq = tenedorizq;
    }
    
    @Override
    public void run() {
        System.out.println("Filosofo " + nombre + " se prepara para comer...");
        while (true) {
            TomarTenedores();
            Comer();
            DesocuparTenedores();
            Pensar();
        }
    }

    public void Pensar() {
        System.out.println("Filosofo " + nombre + " esta pensando...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void TomarTenedores() {
        tenedorDer.TomarTenedor();
        System.out.println("Filosofo " + nombre + " tomo su tenedor derecho.");
        tenedorIzq.TomarTenedor();
        System.out.println("Filosofo " + nombre + " tomo su tenedor izquierdo.");
    }

    public void Comer() {
        System.out.println("Filososo " + nombre + " esta comiendo...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Filosofo " + nombre + " termino de comer");   
    }

    public void DesocuparTenedores() {
        tenedorIzq.DesocuparTenedor();
        tenedorDer.DesocuparTenedor();
    }
}