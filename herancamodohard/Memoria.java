package herancamodohard;

public class Memoria extends Produto {
    public Memoria (String marca, String modelo, double capacidadeDeArmazenamento) {
        super(marca, modelo, capacidadeDeArmazenamento);
    }

    @Override
    public String toString() {
        return "Memoria []" + super.toStringTodos();
    }

    

}
