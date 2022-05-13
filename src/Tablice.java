public class Tablice
{
    public static void main(String[] args)
    {
        //public Klocek magazyn;
        Tablice obiekt1 = new Tablice("TabA");
        //obiekt1.tabmet();
        System.out.println(obiekt1);

        Tablice[] tabObiketow = new Tablice[5];


        for(int i = 0; i < tabObiketow.length; i++)
        {
            tabObiketow[i] = new Tablice("Tablica" + i);
            System.out.println(tabObiketow[i]);
        }

        char proba;
        String lol1 = "tekst";
        String lol2 = lol1.substring(0, 5);
        proba = lol1.charAt(2);
        System.out.println(proba);
        Tablice rev = new Tablice("Sprawdzian");
        rev.reverseText("RUSKIE TO PEDALY ICH JEBAC TRZEBA I TO BARDZO MOCNO!!!!");
        System.out.println(lol2);
        rev.adresytablice();
        System.out.println(rev);

        /////////////////////////////////////////////////////////////////////
        //                  testowanie klas i obiektow                     //
        /////////////////////////////////////////////////////////////////////
        System.out.println("----------------------------------OOP------------------------------------\n\n\n\n");
        Klocek zamek = new Budowla("Beton", 300, 3000000, "Prostokątny");
        System.out.println(zamek.klocekGetter());

        //Tablica obiektów subclassy w tablicy:
        Klocek zamek1 = new Budowla("Beton1", 3001, 3000001, "Prostokątny1");
        Klocek zamek2 = new Budowla("Beton2", 3002, 3000002, "Prostokątny2");

        Klocek[] tablicaObiektow = new Klocek[10];
        Klocek magazyn;

        if(1 > 0)
        {
            magazyn = new Klocek("drewno", 200, 1);
        }

        magazyn.arrayObject[0] = zamek1;
        System.out.println(magazyn.arrayObject[0].material);
        System.out.println(magazyn.idKlocka);

    }
    public Tablice(String nazwa)
    {
        nazwaTablicy = nazwa;
    }
////////////////////////////metody
    public void tabmet()
    {
        String tekst = "zmienna";
        int[] tab = new int[100];
        System.out.println(tekst.length()  + " " + tab.length);

        //Sposoby deklaracji tablicy:
        int[] tablica1 = new int[100];
        int[] tablica2 = {12, 2, 3, 4, 5, 1};
        int[] kopiatablica2 = tablica2; // kopiatablica2 wskazuje na adres tablicy2 - jest tą samą tablicą jesli zmienimy jej jakis element to w tej 2 tez sie zmieni

        //poprawny sposob skopiowania zawartosci jednej tablicy do drugiej:
        System.arraycopy(tablica2, 0, tablica1, 49, 6);
        for(int i = 0; i < 6; i++)
        {
            System.out.println((i+49) + " element tablicy1: " + tablica1[(49+i)]);
        }
    }
    public void reverseText(String text)
    {
        nazwaTablicy = text;
        char[] tabReverseText = new char[nazwaTablicy.length()];
        for(int i = 0; i < nazwaTablicy.length(); i++)
        {
            tabReverseText[i] = nazwaTablicy.charAt(nazwaTablicy.length()- (i + 1));
        }
        for(int i = 0; i < nazwaTablicy.length(); i++) System.out.print(tabReverseText[i]);
        System.out.println("");
    }
    public void adresytablice()
    {
        int[] tablica1a = new int[10];
        int[] tablica1b = new int[10];
        tablica1a[0] = 0;
        tablica1b[0] = 1;
        System.out.println("Przed zmiana adresu: " + tablica1a[0] + "\n" + tablica1b[0]);
        //tutaj jest przypisany adres tablicy1a do tablicy 1b:
        tablica1b = tablica1a;
        tablica1a[0] = 3;
        System.out.println("Po zmianie adresu: " + tablica1a[0] + "\n" + tablica1b[0]);
        System.out.println(tablica1a + "\n" + tablica1b);

    }

    public String toString()
    {
        return "Nazwa tablicy: " + nazwaTablicy;
    }
    String nazwaTablicy;
}
