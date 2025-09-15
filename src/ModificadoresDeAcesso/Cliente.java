package ModificadoresDeAcesso;

public class Cliente {
    private String nome;
    private long CPF;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCPF(){
        return this.CPF;
    }

    public void setCPF(long CPF){
        this.CPF = CPF;
    }
}
