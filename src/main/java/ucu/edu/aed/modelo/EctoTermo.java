package ucu.edu.aed.modelo;

public class EctoTermo {
    public String estado = null;
    public int energiaActual;
    public int energiaMaxima;
    public int consumo;

    public EctoTermo(int energiaActual, int energiaMaxima, int consumo){
        
        this.energiaMaxima = energiaMaxima;
        if (energiaActual > energiaMaxima) {
            this.energiaActual = energiaMaxima;
        }else{
            this.energiaActual = energiaActual;
        }
        this.consumo = consumo;

    }
    
    public int getEnergiaActual(){
        return this.energiaActual;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void consumirEnergia(){
        this.energiaActual -= consumo;
    }
    
    public void recargarEnergia(){
        this.energiaActual = this.energiaMaxima;
    }

    public void procesarEnergia(){
        if (this.energiaActual <= 0) {
            this.setEstado("Agotamiento");
        }
    }
    
}
