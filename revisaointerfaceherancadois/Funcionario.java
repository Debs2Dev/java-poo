package revisaointerfaceherancadois;

public class Funcionario {
    public abstract class Funcionario {
    protected String nome;
    protected double cpf;
    protected String dataNascimento;
    protected double salarioBase;

    public Funcionario(String nome, double cpf, String dataNascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salarioBase = salarioBase;
        }

        public String getNome() {
        return nome;
        }

        public void setNome(String nome) {
        this.nome = nome;
        }

        public double getCpf() {
        return cpf;
        }

        public void setCpf(double cpf) {
        this.cpf = cpf;
        }

        public String getDataNascimento() {
        return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        }

        public double getSalarioBase() {
        return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        }

        @Override
        public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", salarioBase="
            + salarioBase + "]";
        }

        //public abstract double getSalarioFinal(); VERIFCAR O PEDIDO FINAL
    }
