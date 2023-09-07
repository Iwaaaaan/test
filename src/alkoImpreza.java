public class alkoImpreza {
    public static void main(String[] args) {
        String[] imiona = new String[10];
        String imprezowicze = "Marcin, Mariusz, Marta, Karolina, Izabela, Hubert, Anna, Mateusz, Łukasz, Aneta";
        String[] sameImiona = imprezowicze.split(", ");
        int wino = 25;
        int wodka = 30;
        int[] kasa = new int[10];
        for (int i = 0; i < sameImiona.length; i++) {
        if (sameImiona[i].startsWith("M") && !sameImiona[i].endsWith("a")) {
            kasa[i] = 2 * wodka;
        } else{
            if (sameImiona[i].endsWith("a")) {
                kasa[i] = wino;
            }else {
                kasa[i] = wodka;
            }
        }
        System.out.println(sameImiona[i] + " " + kasa[i]);

        }
    }

}