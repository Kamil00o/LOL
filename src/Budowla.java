public class Budowla extends Klocek
{
    int liczbaKlockow;
    String budowlaksztalt;
    Budowla(String material, int waga, int liczbaKlockow, String budowlaKsztalt)
    {
        super(material, waga,0);
        this.liczbaKlockow = liczbaKlockow;
        this.budowlaksztalt = budowlaKsztalt;
    }

    @Override
    public String klocekGetter()
    {
        return "Budowla jest zbudowana z " + this.liczbaKlockow + " klocków, materiał budowli to "
                + this.material + " ma kształt "+ this.budowlaksztalt + " i waży " + this.waga;


    }
}
