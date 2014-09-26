package ppo.interfaces;

import java.util.List;
import ppo.negocios.Turma;

public interface interfaceTurma {
    
    public void criar(Turma a);
    public void excluir(Turma a);
    public void pesquisar(Turma a);
    public void alterar(Turma a);
    public List<Turma> listar(); 
    
}
