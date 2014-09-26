package ppo.interfaces;

import java.util.List;
import ppo.negocios.Questao;

public interface interfaceQuestao {
   
    public void criar(String a);
    public void excluir(Questao a);
    public void pesquisar(Questao a);
    public void alterar(Questao a);
    public List<Questao> listar(); 
    
    public void addResposta(String a);
    
}
