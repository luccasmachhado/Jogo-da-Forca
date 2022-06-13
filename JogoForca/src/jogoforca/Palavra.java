package jogoforca;
public class Palavra {

    private String palavra;
    private String categoria;

    public Palavra(String palavra, String categoria) {
        this.palavra = palavra.toUpperCase();
        this.categoria = categoria.toUpperCase();
    }

    public String criptografar() {
        return palavra.replaceAll("[aA-zZ]", "-");
    }

    public String getPalavra() {
        return palavra;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Palavra{" + "palavra=" + palavra + ", categoria=" + categoria + '}';
    }

    
}
