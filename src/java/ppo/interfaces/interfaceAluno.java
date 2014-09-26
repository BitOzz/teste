package ppo.interfaces;

import java.util.List;
import ppo.negocios.Aluno;

public interface interfaceAluno {
    
    public void cadastrar(Aluno a);
    public void excluir(Aluno a);
    public void pesquisar(Aluno a);
    public void alterar(Aluno a);
    public List<Aluno> listar(); 
    
}
