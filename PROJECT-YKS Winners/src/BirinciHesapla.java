
public class BirinciHesapla {
    
    public static <E extends Ogrenci> E birinci_ogrenci(E x, E y){
        if(x.hesapla() > y.hesapla()){
            return x;
        }else{
            return y;
        }
        
    }
}
