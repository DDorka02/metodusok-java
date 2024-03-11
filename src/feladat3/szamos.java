package feladat3;


public class szamos {
    

    public static void main(String[] args) {
        nehanyszamgyoke();
        

    }

    private static void nehanyszamgyoke() {
        haromszamgyoke();
//        int [] szamok= (7,5,6,7,8};
//        osszeg= osszegzes(szamok);
//        gyok = gyokszam(osszeg);
//        kimenet="%d gyöke:.4f".formatted(osszeg,gyok);
//                konzolraIr(kimenet);
//}
}

    private static void haromszamgyoke() {
        int osszeg= osszegzes(2, osszegzes(3,4));
        double gyok = gyokszam(osszeg);
        String kimenet="%d gyöke:.4f".formatted(osszeg,gyok);
                konzolraIr(kimenet);
    }
    
    private static int osszegzes(int a, int b) {
        return a+b;
        
    }

    private static double gyokszam(int osszeg) {
        return Math.sqrt(osszeg);
 
    }
    
    static void konzolraIr(String kimenet) {
        System.out.println();
        
    }



}
            
