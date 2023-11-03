
public class Sayisal extends Ogrenci {

    public Sayisal(String isim, int mat, int tr, int fen, int sos) {
        super(isim, mat, tr, fen, sos);
    }

    @Override
    public int hesapla() {
        return (getMat() * 5 + getFen() * 5 + getTr() * 5 + getSos() * 1);
    }

    @Override
    public void info() {
        super.info();
    }

}
