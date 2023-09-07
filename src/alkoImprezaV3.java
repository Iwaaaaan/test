public class alkoImprezaV3 {
    public static void main(String[] args) {
        String imiona2 = "Marta, Karolina, Izabela, Anna, Aneta, Marcin, Mariusz, Hubert, Mateusz, Łukasz, Wojtek, Alicja, ";
        int wino = 0;
        int wodka = 0;
        String[] sameImiona = imiona2.split(", ");
        for (int i = 0; i < sameImiona.length; i++) {
            if (!sameImiona[i].equals("Wojtek") && !sameImiona[i].equals("Alicja")) {
                if (!sameImiona[i].startsWith("M") && !sameImiona[i].endsWith("a")) {
                    wodka += 30;
                }
                if (sameImiona[i].startsWith("M") && !sameImiona[i].endsWith("a")) {
                    wodka += 60;
                }
                if (sameImiona[i].endsWith("a") && sameImiona[i].startsWith("M")) {
                    wino += 50;
                }
                if (sameImiona[i].endsWith("a") && !sameImiona[i].startsWith("M")) {
                    wino += 25;
                }
                System.out.println(i + "-" + sameImiona[i]);
            }
        }
        System.out.println("Pieniądze potrzebne dla mężczyzn na libacje alkoholową to " + wodka + "zł");
        System.out.println("Pieniądze potrzebne dla kobiet na degustację wina to " + wino + "zł");
    }
}
