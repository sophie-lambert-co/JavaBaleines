import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Baleine Baleine2 = new Baleine();

       Baleine2.setTaille(40);
       Baleine2.setNom("Mabaleine");
       Baleine2.setNombre(120);
       Baleine2.setPoids(4);
       
        // Création d'un ArrayList pour stocker les informations sur différentes espèces
        // de baleines
        ArrayList<Baleine> baleines = new ArrayList<>();

        // Ajout des informations sur les baleines à l'ArrayList
        baleines.add(Baleine2);
        baleines.add(new Baleine("Baleine bleue", 30, 100, 15000)); // Les chiffres sont des estimations
        baleines.add(new Baleine("Rorqual commun", 20, 50, 100000)); // Les chiffres sont des estimations
        baleines.add(new Baleine("Cachalot", 18, 45, 550000)); // Les chiffres sont des estimations
        baleines.add(new Baleine("Baleine boréale", 18, 75, 10000)); // Les chiffres sont des estimations
        baleines.add(new Baleine("Baleine à bosse", 16, 40, 80000)); // Les chiffres sont des estimations

        // Ajout d'autres espèces de baleines à l'ArrayList
        baleines.add(new Baleine("Béluga", 5.5, 1.5, 150000)); // Les chiffres sont des estimations
        baleines.add(new Baleine("Baleine de Minke", 10, 10, 800000)); // Les chiffres sont des estimations
        baleines.add(new Baleine("Bérardie d'Arnoux", 12.5, 14, 50000)); // Les chiffres sont des estimations



        // Créez un comparateur personnalisé pour trier les baleines par poids total
        // estimé
        Comparator<Baleine> comparateurPoids = new Comparator<Baleine>() {
            @Override
            public int compare(Baleine baleine1, Baleine baleine2) {
                double poidsTotal1 = baleine1.getPoids() * baleine1.getNombre();
                double poidsTotal2 = baleine2.getPoids() * baleine2.getNombre();
                return Double.compare(poidsTotal1, poidsTotal2);
            }
        };

        // méthode qui affiche les cétacés par ordres du poids total estimé pour chaque
        // espèce sur Terre.
        // Tri du tableau d'ArrayList (liste) de baleines par ordre de poids
        Collections.sort(baleines, comparateurPoids);

        // Créez un comparateur personnalisé pour trier les baleines par poids total
        // estimé
        Comparator<Baleine> comparateurPoids2 = new Comparator<Baleine>() {
            @Override
            public int compare(Baleine baleine1, Baleine baleine2) {
                double poids1 = baleine1.getPoids();
                double poids2 = baleine2.getPoids();
                return Double.compare(poids1, poids2);
            }
        };

        // méthode qui affiche les cétacés par ordres du poids total estimé pour chaque
        // espèce sur Terre.
        // Tri du tableau d'ArrayList (liste) de baleines par ordre de poids
        Collections.sort(baleines, comparateurPoids2);

        // Affichage des informations sur les baleines
        for (Baleine baleine : baleines) {
            System.out.println(baleine);
            System.out.println();
            System.out.println("Poid au mètre moyen d'un individu de l'espèce :" + baleine.calculateWeightPerMeter());
            System.out.println();
            System.out.println("Poids total de tous les individus de l'espèce estimé : " + (baleine.getPoids() * baleine.getNombre()) + " tonnes");
            System.out.println();
            System.out.println("Poids moyen d'un individu : " +baleine.getPoids()+ " tonnes");
            System.out.println();
        }
        System.out.println();
        System.out.println("Poids au mètre du Cachalot :" + baleines.get(2).calculateWeightPerMeter());

          // Appel de la méthode pour trier les cétacés par nombre
        afficherCetacesParNombre(baleines);
    }


        public static void afficherCetacesParNombre(ArrayList<Baleine> baleines2) {
            Collections.sort(baleines2, (baleine1, baleine2) -> baleine2.getNombre() - baleine1.getNombre());
        
            System.out.println("Cétacés par ordre du nombre d'individus total estimé:");
            for (Baleine baleine : baleines2) {
                System.out.println(baleine.getNom() + " - Nombre d'individus estimé: " + baleine.getNombre());
            }
        }
    }

    

// //Exercice 1
// Ajouter à la classe baleine.java tous les getters et tous les setters pour
// l'ensemble des attributs

// Exercice 2
// Ajouter un constructeur sans paramètre Baleine ()
// Et dans Main.java
// Instancier le constructeur Baleine() dans un objet baleine2
// ajouter le nom , la taille , le poids , le nombre avec les setters.
// metter les information que vous voulez.
// Ajouter au Arraylist arrayListBaleines la nouvelle Baleine

// Exercice 3

// Sur le même modèle que ce cette méthode

// public static void afficherCetacesParPoidsTotal(ArrayList<Baleine> baleines)
// {
// Collections.sort(baleines,
// Comparator.comparingDouble(Baleine::poidsTotalEstime).reversed());

// System.out.println("Cétacés par ordre du poids total estimé:");
// for (Baleine baleine : baleines) {
// System.out.println(baleine.getNom() + " - Poids total estimé: " +
// baleine.poidsTotalEstime() + " tonnes");
// }
// }

// Créer une nouvelle méthode afficherCetacesParNombre()
