package jogoforca;

import objetos.Boneco;

public class Forca {

    public static void main(String[] args) {
        Boneco hermeson = new Boneco();
        hermeson.setBracoEsq(true);
        hermeson.setBracoDir(false);
        hermeson.setTronco(true);
        hermeson.setPernaEsq(true);
        hermeson.setPernaDir(true);
        hermeson.setNome("Hermeson");
        hermeson.showBoneco();
    }
}
