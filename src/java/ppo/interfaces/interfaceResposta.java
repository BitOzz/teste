package ppo.interfaces;

import java.util.List;
import ppo.negocios.Resposta;

public interface interfaceResposta {
  
    public void criar(Resposta a);
    public void excluir(Resposta a);
    public void pesquisar(Resposta a);
    public void alterar(Resposta a);
    public List<Resposta> listar(); 
    
}
