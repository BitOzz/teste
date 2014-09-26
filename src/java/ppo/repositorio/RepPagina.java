package ppo.repositiorio;

import java.util.List;
import ppo.negocios.Pagina;
import ppo.negocios.Questao;

public class RepPagina implements ppo.interfaces.interfacePagina{

    private Pagina p;
    
    public RepPagina() {
       p = new Pagina();
    }

    public void excluir(Pagina a) {
    
    }

    public void pesquisar(Pagina a) {
    
    }

    public void alterar(Pagina a) {
    
    }
    
    public void addQuestao(Questao q){
        p.addQuestao(q);
    }
    
    public Pagina getThis(){
        return p;
    }

    public List<Pagina> listar() {
        return null;
    }
    
}
