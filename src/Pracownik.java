import java.io.FileNotFoundException;

public class Pracownik {
    public static void main(String[] args) throws FileNotFoundException {
        DanePracownik first = new DanePracownik("Andrzej", "Dąbrowski", 2600, 'M', 2);
        first.wypiszNaEkran();
        Pracownik pracownik = new Pracownik();


    }
}