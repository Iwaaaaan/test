public class Car {
    String marka;
    String model;
    int liczbaKol;

    public Car(String model, int liczbaKol) {
        this.model = model;
        this.liczbaKol = liczbaKol;
    }

    void wypiszNaEkran(){
        System.out.println(model + " liczba kół: " + liczbaKol);
    }
}