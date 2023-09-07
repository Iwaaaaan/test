public class alkoImprezaV2 {
    public static void main(String[] args) {
        String imiona2 = "Marta, Karolina, Izabela, Anna, Aneta, Marcin, Mariusz, Hubert, Mateusz, Łukasz, ";
        int wino = 0;
        int wodka = 0;
        int sumaMezczyzni = 0;
        int sumaKobiety = 0;
        //int podwojneAlko = 0;
       // int podwojneWino = 0;
        String[] sameImiona = imiona2.split(", ");
        for (int i = 0; i < sameImiona.length; i++) {
            System.out.println(i + "-" + sameImiona[i]);
            {
                if (sameImiona[i].startsWith("M") && !sameImiona[i].endsWith("a")) {
                    wodka += 60;
                }
                if (!sameImiona[i].startsWith("M") && !sameImiona[i].endsWith("a")) {
                    wodka += 30;
                }
                if (sameImiona[i].endsWith("a") && sameImiona[i].startsWith("M")) {
                    wino += 50;
                }
                if (sameImiona[i].endsWith("a") && !sameImiona[i].startsWith("M"))
                    wino += 25;
            }
            sumaKobiety = wino;
        }
        sumaMezczyzni = wodka;
        System.out.println("Pieniądze potrzebne dla mężczyzn na libacje alkoholową to " + sumaMezczyzni + "zł");
        System.out.println("Pieniądze potrzebne dla kobiet na degustację wina to " + sumaKobiety + "zł");
    }
}

