package Dispositivo;

public class DispositivoDeArmazenamento extends Produto {
    private double capacidadeDeArmazenamento;
    private String tipoDeConexao;


    public DispositivoDeArmazenamento(String marca, String modelo, double capacidadeDeArmazenamento,
            String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }
    public DispositivoDeArmazenamento(String marca, String modelo, double frequencia, double capacidadeDeArmazenamento,
            String tipoDeConexao) {
        super(marca, modelo, frequencia);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    
    public double getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }
    public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }
    public String getTipoDeConexao() {
        return tipoDeConexao;
    }
    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    
    @Override
    public String toString() {
        return "DispositivoDeArmazenamento [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento
                + ", modelo=" + modelo + ", tipoDeConexao=" + tipoDeConexao + "]";
    }

    

    
    

    
        


}
