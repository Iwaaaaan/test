import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DanePracownik {
    String imie;
    String nazwisko;
    int placa;
    char plec;
    int dzial;

    public DanePracownik(String imie, String nazwisko, int placa, char plec, int dzial){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }
    void wypiszNaEkran() {
        System.out.println("Pracownik nr 1 ma na imię: " + imie + " nazwisko: " + nazwisko + ". Zarabia kupę kasy, dokłądnie : " + placa);
    }
    void wczytajZPliku()throws FileNotFoundException {
        Scanner wczytajZPliku = new Scanner(new File("C:\\Users\\Asus\\Desktop\\listaPracowników.txt"));



    }
}

