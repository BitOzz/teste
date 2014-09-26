package ppo.fachada;

import java.util.List;
import ppo.negocios.Formulario;
import ppo.negocios.Pagina;
import ppo.repositiorio.RepFormulario;

public class FachadaPrincipal {
    
    private static FachadaPrincipal f;
    private RepFormulario form;
    
    public FachadaPrincipal(){};
    
    public static FachadaPrincipal getInstance(){
        if(f == null)
            f  = new FachadaPrincipal();
        
        return f;
    }
    
    //gerenciador de Formulário
    
    public void criarFormulario(String nome, String tipo, Pagina paginaInicial){
        form.getInstance().criarFormulario(nome, tipo, paginaInicial);
    }
    
    public Formulario retornarFormularioPorID(int id){
       return form.getInstance().pesquisar(id);
    }
    
    public void excluirFormularioPorID(int id){
        form.getInstance().excluir(id);
    }
    
    public void alterarFormulario(Formulario f){ // é obrigatório o novo formulário ter o mesmo ID do antigo
        form.alterar(f);
    }
    
    public List<Formulario> pesquisarTodosFormularios(){
        return form.getInstance().listar();
    }
    
    //gerenciar de Formulário
    
}
