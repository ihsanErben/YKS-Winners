
public abstract class Ogrenci {

    private String isim;
    private int mat;
    private int tr;
    private int fen;
    private int sos;

    public Ogrenci(String isim, int mat, int tr, int fen, int sos) {
        this.isim = isim;
        this.mat = mat;
        this.tr = tr;
        this.fen = fen;
        this.sos = sos;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }

    public int getSos() {
        return sos;
    }

    public void setSos(int sos) {
        this.sos = sos;
    }

    public void info() {
        System.out.println("isim: " + getIsim());
        System.out.println("mat: " + getMat());
        System.out.println("tr: " + getTr());
        System.out.println("fen: " + getFen());
        System.out.println("sos: " + getSos());
    }

    public abstract int hesapla();
}
