package ppo.repositiorio;

import java.util.List;
import ppo.negocios.Questao;
import ppo.negocios.Resposta;

public class RepQuestao implements ppo.interfaces.interfaceQuestao {
    
    private Questao q;
    
    public void criar(String a) {
       q = new Questao(a);
    }

    public void excluir(Questao a) {
    
    }

    public void pesquisar(Questao a) {
   
    }

    public void alterar(Questao a) {
    
    }
    
    public void addResposta(String r){
        q.addResposta(r);
    }

    public List<Questao> listar() {
        return null;
    }
    
    public Questao getThis(){
        return q;
    }
    
}
