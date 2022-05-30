package objetos;

public class Boneco {

    private String nome;
    private boolean tronco;
    private boolean bracoEsq;
    private boolean bracoDir;
    private boolean pernaEsq;
    private boolean pernaDir;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTronco() {
        return tronco;
    }

    public void setTronco(boolean tronco) {
        this.tronco = tronco;
    }

    public boolean isBracoEsq() {
        return bracoEsq;
    }

    public void setBracoEsq(boolean bracoEsq) {
        this.bracoEsq = bracoEsq;
    }

    public boolean isBracoDir() {
        return bracoDir;
    }

    public void setBracoDir(boolean bracoDir) {
        this.bracoDir = bracoDir;
    }

    public boolean isPernaEsq() {
        return pernaEsq;
    }

    public void setPernaEsq(boolean pernaEsq) {
        this.pernaEsq = pernaEsq;
    }

    public boolean isPernaDir() {
        return pernaDir;
    }

    public void setPernaDir(boolean pernaDir) {
        this.pernaDir = pernaDir;
    }

    public void showBoneco() {
        System.out.println("( )");

        if (bracoEsq == true && bracoDir == false && tronco == true) {
            System.out.println("/|");
        } 
        if (bracoEsq == false && bracoDir == true && tronco == true) {
            System.out.println("|\\");
        } 
        if (bracoEsq == false && bracoDir == false && tronco == true) {
            System.out.println("|");
        }
        if (bracoEsq == true && bracoDir == false && tronco == false) {
            System.out.println("/");
        }
        if (!bracoEsq && bracoDir && !tronco) {
            System.out.println("\\");
        } 
        if (!bracoEsq && !bracoDir && !tronco) {
            System.out.println("");
        } 
        if (pernaEsq && !pernaDir) {
            System.out.println("/");
        } 
        if (!pernaEsq && pernaDir) {
            System.out.println("\\");
        } 
        if (pernaEsq && pernaDir) {
            System.out.println("/\\");
        }
    }
}
