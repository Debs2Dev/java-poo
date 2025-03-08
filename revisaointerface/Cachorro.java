package revisaointerface;

public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "au-au!";
    }   
    @Override
    public String comer() {
        return "morango e banana com racao!";
    } 
    

}
