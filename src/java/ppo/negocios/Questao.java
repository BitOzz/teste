package ppo.negocios;

import java.util.ArrayList;

public class Questao {
   
    private String questão;
    private ArrayList<Resposta> respostas =  new ArrayList();

    public Questao(String questão) {
        this.questão = questão;
    }
    
    public String getQuestao() {
        return questão;
    }

    public void setQuestao(String questão) {
        this.questão = questão;
    }
    
    public void addResposta(String resposta){
        respostas.add(new Resposta(resposta));
    }
    
    public int getTodasRespostas(){
        return respostas.size();
    }
    
    public Resposta getResposta(int i){
        return respostas.get(i);
    }
    
    
}
