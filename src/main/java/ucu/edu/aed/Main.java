package ucu.edu.aed;

import ucu.edu.aed.modelo.EctoTermo;
import ucu.edu.aed.sistema.GestionAmbientes;

public class Main {
    public static void main(String[] args) {
        EctoTermo organismo = new EctoTermo(80, 100, 25);
        GestionAmbientes ambientes = new GestionAmbientes(organismo);

        ambientes.insertar(22);
        ambientes.insertar(-5);
        ambientes.insertar(18);
        ambientes.insertar(30);
        ambientes.insertar(45);
        ambientes.insertar(12);
        ambientes.insertar(20);

        System.out.println(ambientes.explorar());
    }
}
