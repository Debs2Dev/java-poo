package Dispositivo;

public class Memoria extends Produto {
    private double frequencia;
    private double capacidadeDeArmazenamento;

    
    public Memoria(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.frequencia = frequencia;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }
    public Memoria(String marca, String modelo, double frequencia, double frequencia2,
            double capacidadeDeArmazenamento) {
        super(marca, modelo, frequencia);
        frequencia = frequencia2;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }
    public double getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    public double getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }
    public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }
    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo
                + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }
    
    
    
    

}


