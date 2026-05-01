package ucu.edu.aed.sistema;

import ucu.edu.aed.modelo.EctoTermo;
import ucu.edu.aed.modelo.MicroAmbiente;
import ucu.edu.aed.tda.implementaciones.AVLArbol;

public class GestionAmbientes {
    AVLArbol<MicroAmbiente> microAmbientes = new AVLArbol<MicroAmbiente>();
    EctoTermo organismo;

    public GestionAmbientes(EctoTermo microOrganismo){
        this.organismo = microOrganismo;
    }

    public boolean insertar(int temperatura){
        MicroAmbiente nuevo = new MicroAmbiente(temperatura);
        return microAmbientes.insertar(nuevo);
    }

    public String explorar(){
        microAmbientes.preOrder(microAmbiente -> {
            organismo.procesarEnergia();
            if (microAmbiente.esOptimo() && organismo.getEstado() == null) {
                organismo.recargarEnergia();
            }else if (microAmbiente.esLetal() && organismo.getEstado() == null) {
                organismo.setEstado("ChoqueTermico");
            }else{
                organismo.consumirEnergia();
            }
        });
        if (organismo.getEstado() == null) {
            organismo.setEstado("Sobrevive");
        }
        return organismo.getEstado();
    }

}
