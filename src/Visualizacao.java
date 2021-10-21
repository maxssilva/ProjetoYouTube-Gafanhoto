import pessoa.Gafanhoto;
import video.Video;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

/*construtor*/
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        /*adicionando unidade ao total assistido do espectador*/
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        /*adiciona uma view ao video*/
        this.filme.setViews(this.filme.getViews()+1);
    }


    /*metodo avaliacao video*/
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot;
        if(porc <=20){
            tot = 3;
        }
        else if (porc <=50){
            tot=5;
        }
        else if (porc <=90){
            tot=8;
        }
        else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }

/*metodos acessores/modificadores*/
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
