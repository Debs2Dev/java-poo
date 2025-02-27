package herancamodohard;

public class Processador extends Produto {
    
    public Processador(String marca, String modelo, double frequencia) {
        super(marca, modelo, frequencia);
    }


    @Override
    public String toString() {
        return "Processador: " + super.toStringMarcaModeloFrequencia(); // usando a herança da classe Produto

    }
    


}
