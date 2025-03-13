package revisaointerfaceherancadois;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, double cpf, String dataNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    public double obterSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nPlaca da Moto: " + placaDaMoto;
    }

}