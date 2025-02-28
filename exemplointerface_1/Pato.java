package exemplointerface_1;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Cococo!";
    }

    @Override
    public String comer() {
        return "pão!";
    }


}