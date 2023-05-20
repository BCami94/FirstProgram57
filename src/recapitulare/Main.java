package recapitulare;

public class Main {
    public static void main(String[] args) {

        //8 pagini, 3 carti, 2 autori
        Pagina pagina1 = new Pagina("Acesta este textul de pe pagina", false);
        Pagina pagina2 = new Pagina("Un alt text de pe pagina", false);
        Pagina pagina3 = new Pagina("Ana are mere", false);
        Pagina pagina4 = new Pagina("Ana nu mai are mere", true);
        Pagina pagina5 = new Pagina("Inca un text", true);
        Pagina pagina6 = new Pagina("Vine pauza", false);
        Pagina pagina7 = new Pagina("Nu mai avem idei", false);
        Pagina pagina8 = new Pagina("Final", false);

        //pt a crea o carte -> avem nevoie de un array de pagini -> pe care il definim mmai jos
        Pagina[] paginiCarte1 = new Pagina[]{pagina1, pagina2, pagina3};

        // prima carte contine paginile 1,2,3
        Carte carte1 = new Carte("Titlu1", "proza", new String[]{"romana", "engleza"},
                new String[]{"un singur capitol"}, 2003, paginiCarte1);

        // cartea 2
        Carte carte2 = new Carte("Titlu2", "poezie", new String[]{"romana"},
                new String[]{"capitol1", "capitol2"}, 2007, new Pagina[]{pagina4, pagina5});

        //carte 3
        Carte carte3 = new Carte("titlu3", "proza", new String[]{"capitol1", "capitol3"});
        carte3.setLimbi(new String[]{"engleza", "franceza"});
        carte3.setAnPublicatie(1997);
        carte3.setPagini(new Pagina[]{pagina8});

        //creare autori -> 1 autor: va scri cartile 1 si 2
        Autor autor1 = new Autor("Nume1", 40, 'M', new Carte[]{carte1, carte2});
        Autor autor2 = new Autor("Nume2");
        autor2.setVarsta(50);
        autor2.setGen('F');
        autor2.setCarti(new Carte[]{carte3});

        // array de autori
        Autor[] autori = new Autor[]{autor1, autor2};

        Autor gasit = Autor.findAutor("nume1", autori);

        Carte[] cartiGasite = autor1.findCarti();

       // String[] cuvinte = carte2.imparte(2);

        Carte[] cartiGasiteNrPagini = autor1.findCartiByNrPagini(3);

        Pagina[] paginiScrisebyAutor = autor1.findPaginiByAutor();
        for(Pagina p : paginiScrisebyAutor ){
            System.out.println(p.getText());
        }

        boolean[] decide = carte1.decide("pagina");
        for (int i = 0; i< decide.length; i++){
            System.out.println(decide[i]);
        }

    }

}
