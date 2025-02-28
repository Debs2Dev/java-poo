package exemplointerface_1;

public class Galo implements Animal {

    @Override
    public String emitirSom() {
        return "Cococo!";
    }
    @Override
    public String comer() {
        return "Milho!";
    }

}