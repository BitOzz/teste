package ppo.negocios;

import java.util.ArrayList;

public class Pagina {
    
    private ArrayList<Questao> questions = new ArrayList();

    
    public ArrayList<Questao> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Questao> questions) {
        this.questions = questions;
    }
    
    public void addQuestao(Questao question){
        questions.add(question);
    }
    
    
}
