import java.math.BigDecimal;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
        //Chybějící uvozovky
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        //Chybějící uvozovky u Karla
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        // Buď uvozovky v definici hodnoty stringu, nebo z toho udělat číslo
    }

    public static void ukol4() {
        double cena = 10.0;
        // Desetiná čárka místo tečky
        System.out.println(cena);
    }

    public static void ukol5() {
        boolean purkka = false;

        if (purkka) {
            double cena = 0; // Nastavíme do proměnné hodnotu 0
            // Desetkrát přičteme hodnotu jedna desetina (0,1):
            for (int i = 0; i < 10; i++) {
                cena += 0.1;
                // operátor "+=" znamená: přičti ke stávající
                // hodnotě navíc 0.1

                System.out.println(Math.round(cena));
                // Má vypsat "1.0". Ale vypíše "0.9999" !!!
                // Bude to mít něco společného s tím jak je double uložený v bitech?
                // V tomhle případě se to dá buď na prasáka zaokrouhlit...
            }
        }else{
            // A nebo to řešit jiným datovým typem který tím netrpí...
            BigDecimal cena = BigDecimal.valueOf(0);
            for (int i = 0; i < 10; i++) {
                cena = cena.add(BigDecimal.valueOf(0.1));
            }
            System.out.println(cena);
        }
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        // Dá se BigDecimal definovat čistě hodnotou?
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        // Uvozovky netřeba při definici intu
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + ".");
        // "Sčítání" stringu místo oddělení čárkou
    }

    public static void ukol9() {
        // Není "static" - zjistit o čem to je...
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}