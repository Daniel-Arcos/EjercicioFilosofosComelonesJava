public class ProgramaPrincipal {
    
    public static void main(String[] args) {

        Tenedor tenedorUno = new Tenedor();
        Tenedor tenedorDos = new Tenedor();
        Tenedor tenedorTres = new Tenedor();
        Tenedor tenedorCuatro = new Tenedor();
        Tenedor tenedorCinco = new Tenedor();

        Filosofo filosofoUno = new Filosofo(1, tenedorCinco, tenedorUno);
        Filosofo filosofoDos = new Filosofo(2, tenedorUno, tenedorDos);
        Filosofo filosofoTres = new Filosofo(3, tenedorDos, tenedorTres);
        Filosofo filosofoCuatro = new Filosofo(4, tenedorTres, tenedorCuatro);
        Filosofo filosofoCinco = new Filosofo(5, tenedorCinco, tenedorCuatro);

        filosofoUno.start();
        filosofoDos.start();
        filosofoTres.start();
        filosofoCuatro.start();
        filosofoCinco.start();
    }

    
}
