public class AlkoImprezaVMariusz {

    public static void main(String[] args) {
        String namesList = "Marta, Karolina, Izabela, Anna, Aneta, Marcin, Mariusz, Hubert, Mateusz, Łukasz, Wojtek, Alicja";
        String[] namesArray = namesList.split(", ");
        int wino = 0;
        int wodka = 0;
        int kompot = 0;

        for (String name : namesArray)
            if (!name.equals("Wojtek") && !name.equals("Alicja")) {
                if (!name.startsWith("M") && !name.endsWith("a")) wodka += 30;
                else if (name.startsWith("M") && !name.endsWith("a")) wodka += 60;
                else if (name.equals("Marta")) wodka += 60;
                else if (name.endsWith("a") && name.startsWith("M")) wino += 50;
                else if (name.endsWith("a") && !name.startsWith("M")) wino += 25;
            }   else kompot += 5;
        System.out.println("Pieniądze potrzebne dla mężczyzn na libacje alkoholową to " + wodka + "zł");
        System.out.println("Pieniądze potrzebne dla kobiet na degustację wina to " + wino + "zł");
        System.out.println("Na kompot potrzebujemy " + kompot + " zł");
    }
}