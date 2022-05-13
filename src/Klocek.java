public class Klocek
{
    String material;
    int waga;
    Klocek[] arrayObject;
    int idKlocka;
    public Klocek(String material, int waga, int idKlocka)
    {
        this.material = material;
        this.waga = waga;
        Klocek[] tabKlocekKonstruktor = new Klocek[10];
        System.out.println("Adres oryginalnej tablicy w konstruktorze Klocek!!!: " + tabKlocekKonstruktor);
        this.arrayObject = tabKlocekKonstruktor;
        this.idKlocka = idKlocka;
    }

    protected String klocekGetter()
    {
        return "Klocek jest zbudowany jest z " + this.material + " i waży " + this.waga;
    }
}
