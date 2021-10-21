package video;

import video.AcoesVideo;

public class Video implements AcoesVideo {
    private String Titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private Boolean reproduzindo;

    /*construtor*/
    public Video(String titulo) {
        Titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        /*calculando media de avaliacao por numero de visualizacoes*/
        nova = (this.avaliacao+avaliacao)/this.views;
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public Boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;

    }

    @Override
    public void pause() {
        this.reproduzindo=false;
    }

    @Override
    public void like() {
        setCurtidas(curtidas++);
    }

    @Override
    public String toString() {
        return "video.Video{" +
                "Titulo='" + Titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
