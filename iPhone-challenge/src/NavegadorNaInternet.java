import java.util.ArrayList;


public class NavegadorNaInternet {
    private ArrayList<String> historico;
    private String url_mostrada;


    public void exibirPagina(String url) {
        this.url_mostrada = url;
        this.historico.add(url);

    }
}
