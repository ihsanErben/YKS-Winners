
public class Sozel extends Ogrenci {

    public Sozel(String isim, int mat, int tr, int fen, int sos) {
        super(isim, mat, tr, fen, sos);
    }

    @Override
    public int hesapla() {
        return (getMat() * 5 + getFen() * 1 + getTr() * 5 + getSos() * 5);
    }

    @Override
    public void info() {
        super.info();
    }

}
