package com.example.caliton.quizdons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    //-----------Introdução-------------//
    // a, b, c, d ------> alternativas (não, pouco, quase, exato).
    //
    // m = Profecia
    // n = Servir
    // o = Ensinar
    // p = Exortar
    // u = Contribuir
    // r = Governar
    // s = Misericórdia

    private TextView viewPerguntas;
    private Button btnNao, btnPouco, btnQuase, btnExato;
    int a = 0, b = 0, c = 0, d = 0;
    int m = 0, n = 0, o = 0, p = 0, u = 0, r = 0, s = 0, x = 0, result = -1;
    final int[] passa = {0};


    List<Questao> questoes = new ArrayList<Questao>(){
        {

            add(new Questao("1. Fala a verdade abertamente, pois seu intuito é levar o\n" +
                    "pecador ao arrependimento e adorar a Deus.", 1));

            add(new Questao("2. Busca o interesse dos outros e não o seu; sacrificando\n" +
                    "muitas vezes a si mesmo.", 2));

            add(new Questao("3. Procura usar a palavra de Deus de forma clara e\n" +
                    "convincente, crê que a palavra de Deus sempre cumpre o\n" +
                    "seu propósito.", 3));

            add(new Questao("4. Seu objetivo é atingir o coração do pecador e do\n" +
                    "irmão com quem trabalha para encorajá-lo, incentivá-lo e\n" +
                    "aconselhá-lo, para que aquele com quem trabalha vem a\n" +
                    "obedecer a Deus.", 4));

            add(new Questao("5. É sensível às necessidades dos outros e da Igreja; está\n" +
                    "sempre pronto para contribuir mesmo diante de sua pobreza.", 5));

            add(new Questao("6. É capaz de distribuir tarefas de modo que a obra seja\n" +
                    "feita com eficiência e haja resultados palpáveis.", 6));

            add(new Questao("7. Consegue ser sensível às necessidades dos outros, e\n" +
                    "sempre está disposto a ajudar pessoalmente a cada um.", 7));

            add(new Questao("8. Está sempre pronto a denunciar o pecado, para que o\n" +
                    "pecador chegue ao pleno arrependimento, assim como fez\n" +
                    "Jesus e João Batista.", 1));

            add(new Questao("9. Procura o bem coletivo, de modo que todo o seu\n" +
                    "trabalho seja para a glória de Deus", 1));

            add(new Questao("10. É estudioso das Escrituras, pois quer ser estar apto\n" +
                    "para manejá-la bem.", 1));

            add(new Questao("11. Está sempre disposto a dar uma segunda chance\n" +
                    "àqueles que porventura venham a falhar; e procura ajudá-los\n" +
                    "para restaurá-los.", 1));

            add(new Questao("12. Está pronto para ajudar nas necessidades da Igreja e\n" +
                    "sempre se mostra voluntário seja em campanhas, sociais,\n" +
                    "missões ou alguma necessidade específica da Igreja.", 1));

            add(new Questao("13. Em todos os lugares em que é colocado tende a\n" +
                    "assumir a liderança e a exerce sem constrangimento, mas de\n" +
                    "boa vontade.", 1));

            add(new Questao("14. Quando vê alguém com alguma necessidade\n" +
                    "material e capaz de sacrificar-se para ajudá-lo em sua\n" +
                    "pobreza.", 1));

            add(new Questao("15. Expõe a palavra de Deus de forma clara brilhante,\n" +
                    "fascinante e irresistível.", 1));

            add(new Questao("16. Procura fazer as coisas, não para ser visto pelos\n" +
                    "homens, mas pelo prazer de estar sendo útil a obra de Deus.", 1));

            add(new Questao("17. É confiante no poder do Espírito Santo para operar\n" +
                    "através da sua palavra, e procura expô-la o mais claro\n" +
                    "possível.", 1));

            add(new Questao("18. Está pronto para encorajar e confirmar àqueles que\n" +
                    "estão passando por alguma tribulação", 1));

            add(new Questao("19. Não fica só no querer ajudar; sempre faz algo que\n" +
                    "contribui para suprir as necessidades de outros.", 1));

            add(new Questao("20. Se estiver no meio de pessoas com opiniões\n" +
                    "diferentes, mas sabe que sua idéia é melhor, tende a\n" +
                    "convencer os outros, e se não consegue, é humilde para se\n" +
                    "submeter e servir.", 1));

            add(new Questao("21. Gosta de incentivar as pessoas enfermas e encorajá-\n" +
                    "las, tem prazer em visitá-las seja em casa ou hospital.", 1));

            add(new Questao("22. Usa a palavra de Deus com intuito que todos sejam\n" +
                    "por ela julgados e convencidos do pecado.", 1));

            add(new Questao("23. Fica feliz quando solicitado a colaborar com a obra,\n" +
                    "mesmo sem estar na liderança.", 1));

            add(new Questao("24. É apegado à palavra fiel, é apegado à doutrina e não\n" +
                    "tem problemas de passar horas estudando e meditando na\n" +
                    "mesma.", 1));

            add(new Questao("25. Mesmo que usa pregação visa sempre, atingir a\n" +
                    "alma e o espírito, para que haja reação positiva e todos\n" +
                    "sejam firmes.", 1));

            add(new Questao("26. Administra seu dinheiro, mesmo quando pouco, de\n" +
                    "modo que sempre separa uma parte para a obra de Deus.", 1));

            add(new Questao("27. Sabe que muitas vezes as pessoas o seguem, por isso\n" +
                    "procura viver de modo irrepreensível, pois não quer ser\n" +
                    "pedra de tropeço a obra de Deus e sim benção.", 1));

            add(new Questao("28. É uma pessoa de oração; e nunca se esquece dos\n" +
                    "fracos espiritualmente, dos doentes, e daqueles que sofrem.", 1));

            add(new Questao("29. Expõem a palavra de Deus abertamente para que\n" +
                    "sejam manifestos os segredos do coração", 1));

            add(new Questao("30. Gosta de aliviar a carga das pessoas que ocupam\n" +
                    "posição chave para que possam ocupar mais em sua tarefa\n" +
                    "principal.", 1));

            add(new Questao("31. Envolve-se também no Evangelismo, mas sempre é\n" +
                    "minucioso e preciso na exposição do Evangelho e nunca\n" +
                    "fica satisfeito só com a decisão do pecador, depois disso\n" +
                    "gosta de trabalhar como discipulador.", 1));

            add(new Questao("32. Confia na ação do Espírito Santo, mesmo quando\n" +
                    "ele mesmo passa por alguma tribulação; pois sabe que\n" +
                    "poderá usar aquela experiência para ajudar outros e\n" +
                    "incentivá-los a serem perseverantes; sabe que o Espírito\n" +
                    "Santo é chamado de Consolador.", 1));

            add(new Questao("33. É cuidadoso quando a questão é dinheiro, ora\n" +
                    "continuamente para a sua distribuição adequada na obra do\n" +
                    "Senhor.", 1));

            add(new Questao("34. Se não encontra pessoas qualificadas para fazer a\n" +
                    "obra, mesmo assim não desanima; mas procura equipar\n" +
                    "outros para que façam a obra.", 1));

            add(new Questao("35. Gosta de visitar órfãos de viúvas e de alguma forma\n" +
                    "ajudá-los nestes momentos difíceis.", 1));

            add(new Questao(" ", 1));


        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        viewPerguntas = (TextView) findViewById(R.id.txtPerguntas);

        x = questoes.size();

        btnNao = (Button) findViewById(R.id.btnNao);
        btnPouco = (Button) findViewById(R.id.btnPouco);
        btnQuase = (Button) findViewById(R.id.btnQuase);
        btnExato = (Button) findViewById(R.id.btnExato);

        Questao q = questoes.get(0);
        viewPerguntas.setText(q.getPergunta());



        // Botao NÃO
        btnNao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 1;
                avaliaPerguntas();
                concluiResultado();
            }
        });

        // Botao POUCO
        btnPouco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = 1;
                avaliaPerguntas();
                concluiResultado();
            }
        });

        // Botao QUASE
        btnQuase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = 1;
                avaliaPerguntas();
                concluiResultado();
            }
        });

        // Botao EXATO
        btnExato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d = 1;
                avaliaPerguntas();
                concluiResultado();

            }
        });


    }

    @Override
    protected void onRestart(){
        super.onRestart();
        a = 0;
        b = 0;
        c = 0;
        d = 0;

        m = 0;
        n = 0;
        o = 0;
        p = 0;
        u = 0;
        r = 0;
        s = 0;
        x = 0;
        passa[0] = 0;

        Questao q = questoes.get(0);
        viewPerguntas.setText(q.getPergunta());
    }

    public void carregaPergunta(){
        passa[0]++;
        Questao q = questoes.get(passa[0]);
        viewPerguntas.setText(q.getPergunta());


    }

    public void avaliaPerguntas(){


        if(passa[0] == 0 || passa[0] == 7 || passa[0] == 14 || passa[0] == 21 || passa[0] == 28){
            if (a == 1){
                m = m + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                m= m + 1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                m= m + 2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                m= m + 3;
                d = 0;
                carregaPergunta();
            }

        }

        else if(passa[0] == 1 || passa[0] == 8 || passa[0] == 15 || passa[0] == 22 || passa[0] == 29){
            if (a == 1){
                n = n + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                n= n + 1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                n= n + 2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                n= n + 3;
                d = 0;
                carregaPergunta();
            }

        }

        else if(passa[0] == 2 || passa[0] == 9 || passa[0] == 16 || passa[0] == 23 || passa[0] == 30){
            if (a == 1){
                o = o + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                o= o +1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                o= o +2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                o= o +3;
                d = 0;
                carregaPergunta();
            }

        }

        else if(passa[0] == 3 || passa[0] == 10 || passa[0] == 17 || passa[0] == 24 || passa[0] == 31){
            if (a == 1){
                p = p + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                p= p +1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                p= p +2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                p= p +3;
                d = 0;
                carregaPergunta();
            }

        }

        else if(passa[0] == 4 || passa[0] == 11 || passa[0] == 18 || passa[0] == 25 || passa[0] == 32){
            if (a == 1){
                u = u + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                u= u + 1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                u= u + 2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                u= u + 3;
                d = 0;
                carregaPergunta();
            }

        }

        else if(passa[0] == 5 || passa[0] == 12 || passa[0] == 19 || passa[0] == 26 || passa[0] == 33){
            if (a == 1){
                r = r + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                r= r + 1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                r= r + 2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                r= r + 3;
                d = 0;
                carregaPergunta();
            }

        }

        else if(passa[0] == 6 || passa[0] == 13 || passa[0] == 20 || passa[0] == 27 || passa[0] == 34){
            if (a == 1){
                s = s + 0;
                a = 0;
                carregaPergunta();
            } else if (b == 1){
                s= s + 1;
                b = 0;
                carregaPergunta();
            } else if(c == 1){
                s= s + 2;
                c = 0;
                carregaPergunta();
            } else if(d == 1){
                s= s + 3;
                d = 0;
                carregaPergunta();
            }
        }

    }

    public void concluiResultado() {
        if (passa[0] == 35){
            if(m > n && m > o && m > p && m > u && m > r && m > s)
                result = 0;
            else if (n > o && n > p && n > u && n > r && n > s)
                result = 1;
            else if(o > p && o > u && o > r && o > s)
                result = 2;
            else if(p > u && p > r && p > s)
                result = 3;
            else if(u > r && u > s)
                result = 4;
            else if(r > s)
                result = 5;
            else
                result = 6;


            Intent intent = new Intent(this, TelaResultado.class);
            intent.putExtra("resultado", result);
            intent.putExtra("profecia", m);
            intent.putExtra("servir", n);
            intent.putExtra("ensinar", o);
            intent.putExtra("exortar", p);
            intent.putExtra("contribuir", u);
            intent.putExtra("governar", r);
            intent.putExtra("misericordia", s);
            startActivity(intent);
            passa[0] = 0;
        }
    }


}


