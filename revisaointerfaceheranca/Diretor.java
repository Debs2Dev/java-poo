public class Diretor extends Funcionario implements Contratacao{

    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double resultado = 0;
        resultado = super.salarioBase;
        resultado += super.salarioBase * this.PREMIO;
        return resultado;

        //outra forma:
        //@Override
        //public double getSalarioFinal() {
        //    return super.salarioBase() + (super.getSalarioBase() * PREMIO);
        // }
        //se  private final double PREMIO = 1.2;
        // o (linha 23) seria return super.salarioBase() * PREMIO);
    }

    @Override
    public void contratar(Funcionario funcionario) {
        System.out.println("Contratando " + funcionario.getNome());  // ou funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo " + funcionario.toString());
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}







