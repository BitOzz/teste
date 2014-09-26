package ppo.interfaces;

import java.util.List;
import ppo.negocios.Formulario;

public interface interfaceFormulario {
    
    public void excluir(int id);
    public Formulario pesquisar(int id);
    public void alterar(Formulario a);
    public List<Formulario> listar(); 
    
}
