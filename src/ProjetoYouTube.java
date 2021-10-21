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
        g[0] =  new Gafanhoto("Max ", 37, "M", "maxssilva");
        g[1] =  new Gafanhoto("Lauriane ", 35, "F", "lsoares");
        g[2] =  new Gafanhoto("Valentina ", 6, "F", "valsoares");
        g[3] =  new Gafanhoto("Aquiles ", 2, "M", "leitaosilva");
        g[4] =  new Gafanhoto("Anabolinda ", 8, "F", "bobola");
        g[5] =  new Gafanhoto("Anabela ", 8, "F", "bebela");
        g[6] =  new Gafanhoto("Cacholina ", 20, "F", "lulu");

        Visualizacao vis[]= new Visualizacao[5];
        vis[0]= new Visualizacao(g[0],v[2] );/*max x v2*/
       vis[0].avaliar();/*avaliando como 5*/
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0],v[3]);
        vis[1].avaliar(8);
        System.out.println(vis[1].toString());

        vis[2] = new Visualizacao(g[1],v[3]);
        vis[2].avaliar(75.0f);
        System.out.println(vis[2].toString());

        vis[3] = new Visualizacao(g[2],v[3]);
        vis[3].avaliar(12f);

        System.out.println(vis[3].toString());

        vis[4] = new Visualizacao(g[0],v[4]);
        System.out.println(vis[4].toString());
        vis[4].avaliar(1);


        System.out.println("O gafanhoto "+g[0].getNome()+"assistiu a "+g[0].getTotalAssistido()+" videos");

    }
}
