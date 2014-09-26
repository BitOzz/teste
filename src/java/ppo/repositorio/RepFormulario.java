package ppo.repositiorio;

import java.util.ArrayList;
import ppo.negocios.Formulario;
import ppo.negocios.Pagina;

public class RepFormulario implements ppo.interfaces.interfaceFormulario {
    
    private static RepFormulario mySelf;
    private ArrayList<Formulario> f = new ArrayList();
    
    public RepFormulario(){}
    
    public static RepFormulario getInstance(){
        if(mySelf == null)
            mySelf = new RepFormulario();
        
        return mySelf;
    }
    
    public void criarFormulario(String nome, String categoria, Pagina pagina) {
        int id = getLastID();
        System.out.println(id);
        f.add(new Formulario(id, nome, categoria, pagina));
    }

    public void excluir(int id) {
      for (int i = 0;f != null && i < f.size(); i++){
           if(f.get(i).getID() == id)
              f.remove(i); 
       }  
    }

    public Formulario pesquisar(int id) {
       Formulario ret = null;
       for (int i = 0;f != null && i < f.size(); i++){
           if(f.get(i).getID() == id)
              ret = f.get(i); 
       }
       return ret;    
    }

    public void alterar(Formulario a) {
       for(Formulario forms : f){
           if(forms.getID() == a.getID()){
               forms.setNome(a.getNome());
               forms.setCategoria(a.getCategoria());
               forms.setPaginas(a.getPaginas());
           }
       }
    }
    
    public ArrayList<Formulario> listar() {
      return f;
    }
    
    protected int getLastID(){
         int i = 1; 
         for (;f != null && i < f.size(); i++);
            
         return i;
    }
    
    // Outros métodos 
    public void addPagina(int id, Pagina p){
        pesquisar(id).addPagina(p);
    }
    
}
