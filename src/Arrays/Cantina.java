package Arrays;

public class Cantina {
    String nome;
    Salgado [] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        for(Salgado salgadinho : salgados){
            if (salgadinho != null){
                System.out.println(salgadinho.nomes);
            }
        }
    }
}
