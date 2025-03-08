package revisaointerface;

public class Galo implements Animal{

    @Override
    public String emitirSom() {
        return "cococo!";
    }   
    @Override
    public String comer() {
        return "milho!";
    } 
    

}
