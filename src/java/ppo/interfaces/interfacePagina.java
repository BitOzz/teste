package ppo.interfaces;

import java.util.List;
import ppo.negocios.Pagina;
import ppo.negocios.Questao;

public interface interfacePagina {
    
    public void excluir(Pagina a);
    public void pesquisar(Pagina a);
    public void alterar(Pagina a);
    public List<Pagina> listar(); 
    
    public void addQuestao(Questao q);
    
}
