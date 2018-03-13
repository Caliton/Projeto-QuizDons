package com.example.caliton.quizdons;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caliton on 04/03/18.
 */

public class Questao {

    private String pergunta;
    private int classe;

    public Questao(String pergunta, int classe){
        this.pergunta = pergunta;
        this.classe = classe;
    }

    public String getPergunta(){ return this.pergunta; }
    public int getClasse() { return classe; }


}
