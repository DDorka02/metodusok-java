
package feladat3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class tablazat {

    private static Object uzenet;

    public static void main(String[] args) {
        tombMegjelenites();
    }

    private static void tombMegjelenites() {
        char [] betuk = {'a','b','c','d'};
        String kimenet=egysorbe(betuk);
        
        konzolKiir(kimenet);
        
        betuk = new char[7];
        for (int i = 0; i < betuk.length; i++) {  
            betuk[i]= (char) (i+97);
            }
        konzolKiir("több soros");
        fajlbaTablazatba();

        
        
    }

    private static String egysorbe(char [] tomb) {
        String kimenet="";
        for (int i = 0; i < tomb.length; i++) {  
            kimenet=+tomb[i]+"";
            }
        return kimenet;        
    }

    private static void tablazatba(char [] tomb) {
       String kimenet ="";
       for (int i = 0; i < tomb.length; i++) {  
           if (i != 0 && i % 3 ==0){
               kimenet += "\n";
           }
            kimenet=+tomb[i]+"";
            }
        
    }

    private static void konzolKiir(String kimenet) {
        
    }

    private static void fajlbaTablazatba() {
        char [] betuk = {'a','b','c','d'};
        fajlbaIras(tablazatba("\n"+betuk));
    }

    private static void fajlbaIras() {
        Path hov=Paths.get("falj.txt");
        Files.write(hov, uzenet.getBytes());
    }

    }
    

