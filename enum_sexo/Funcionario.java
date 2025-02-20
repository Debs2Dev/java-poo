public class Funcionario {
    private String nome;
    private String id;
    private double salario;
    private String setor;
    private String sexo;
    private String idade;
    private Estado uf;
    }

 public Funcionario(){
 }

 
public Funcionario(String nome, String id, double salario, String setor, String sexo, String idade, Estado uf) {
    this.nome = nome;
    this.id = id;
    this.salario = salario;
    this.setor = setor;
    this.sexo = sexo;
    this.idade = idade;
    this.uf = uf;
}




public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}

public String getSetor() {
    return setor;
}

public void setSetor(String setor) {
    this.setor = setor;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public String getIdade() {
    return idade;
}

public void setIdade(String idade) {
    this.idade = idade;
}

public Estado getUf() {
    return uf;
}

public void setUf(Estado uf) {
    this.uf = uf;
}

@Override
public String toString() {
    return "Funcionario [nome=" + nome + ", id=" + id + ", salario=" + salario + ", setor=" + setor + ", sexo=" + sexo
            + ", idade=" + idade + ", uf=" + uf + "]";
}

   
    

