package ppo.interfaces;

import java.util.List;
import ppo.negocios.Funcionario;

public interface interfaceFuncionario {
    public void cadastrar(Funcionario a);
    public void excluir(Funcionario a);
    public void pesquisar(Funcionario a);
    public void alterar(Funcionario a);
    public List<Funcionario> listar(); 
}
