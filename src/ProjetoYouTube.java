import pessoa.Gafanhoto;
import video.Video;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("A volta dos que nao foram");
        v[1] = new Video("Chora viola, uma historia de cordas");
        v[2] =  new Video("O cangaço como você nunca viu!");
        v[3] = new Video("Canetas: azuis, pretas e vermelhas...");
        v[4] =  new Video("Sai fora Garota, eu tenho dona!");

        Gafanhoto g[] = new Gafanhoto[7];
        g[0] =  new Gafanhoto("Max", 37, "M", "maxssilva");
        g[1] =  new Gafanhoto("Lauriane", 35, "F", "lsoares");
        g[2] =  new Gafanhoto("Valentina", 6, "F", "valsoares");
        g[3] =  new Gafanhoto("Aquiles", 2, "M", "leitaosilva");
        g[4] =  new Gafanhoto("Anabolinda", 8, "F", "bobola");
        g[5] =  new Gafanhoto("Anabela", 8, "F", "bebela");
        g[6] =  new Gafanhoto("Cacholina", 20, "F", "lulu");


        System.out.println(v[1].toString());
        System.out.println(g[2].toString());
    }
}
