
public class Baleine {
    private String nom;
    private double taille;
    private double poids;
    private int nombre;

    public Baleine(String _nom, double _taille, double _poids, int _nombre) {
        this.nom = _nom;
        this.taille = _taille;
        this.poids = _poids;
        this.nombre = _nombre;
    }

    public Baleine() {
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTaille() {
        return this.taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return this.poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getNombre() {
        return this.nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Nom: " + nom + ", Taille: " + taille + " mètres, Poids: " + poids + " tonnes, Nombre: " + nombre;
    }


    // calcule du poids au metre
    public double calculateWeightPerMeter(){
        if (taille!= 0){
        return  poids/taille;
        }
        else{
            return 0;
        }
    }

  
     



}



