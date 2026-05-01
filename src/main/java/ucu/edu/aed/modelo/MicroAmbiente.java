package ucu.edu.aed.modelo;

public class MicroAmbiente implements Comparable<MicroAmbiente> {
    public int temperatura;

    public MicroAmbiente(int temperatura){
        this.temperatura = temperatura;

    }

    public int getTemperatura(){
        return this.temperatura;
    }

    @Override
    public int compareTo(MicroAmbiente otroAmbiente) {
        return Integer.compare(this.getTemperatura(), otroAmbiente.getTemperatura());
    }

    public boolean esOptimo(){
        if (this.temperatura >= 15 && this.temperatura <= 25) {
            return true;
        }else{
            return false;
        }
    }

    public boolean esLetal(){
        if (this.temperatura <= 0 || this.temperatura > 45) {
            return true;
        }
        else{
            return false;
        }
    }

}
