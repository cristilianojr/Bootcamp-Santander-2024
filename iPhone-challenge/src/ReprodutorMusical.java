public class ReprodutorMusical {
    private String musica_atual;
    private Boolean esta_tocando;

    public void tocar() {
        this.esta_tocando = true;
    }

    public void pausar() {
        this.esta_tocando = false;
    }

    public void selecionarMusica(String musica) {
        this.musica_atual = musica;
        this.tocar();
    }


}
