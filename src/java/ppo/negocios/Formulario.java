package ppo.negocios;

import java.util.ArrayList;


public class Formulario {
    
    private String nome, categoria;
    private int ID;
    private ArrayList<Pagina> paginas = new ArrayList(); // rever isso

    public Formulario(int ID, String nome, String categoria, Pagina pagina) {
        this.ID = ID;
        this.nome = nome;
        this.categoria = categoria;
        paginas.add(pagina);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void addPagina(Pagina p){
        paginas.add(p);
    }
    
    public Pagina getPagina(int i){
        return paginas.get(i);
    }
    
    public int getTodasPaginas(){
        return paginas.size();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(ArrayList<Pagina> paginas) {
        this.paginas = paginas;
    }
    
    
    
}
