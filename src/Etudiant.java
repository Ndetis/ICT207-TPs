import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Etudiant {
    private String matricule;
    private String nom;
    private char genre;
    private Date dateNaissance;
    private double moyenne;


    public Etudiant(String matricule, String nom, char genre, Date dateNaissance, double moyenne) {
        this.matricule = matricule;
        this.nom = nom;
        this.genre = genre;
        this.dateNaissance = dateNaissance;
        this.moyenne = moyenne;
    }

    void afficher(){
        System.out.println("Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", genre=" + genre +
                ", dateNaissance=" + dateNaissance +
                ", moyenne=" + moyenne +
                '}');
    }

    public int calculerAge(){
        return new Date().getYear() - dateNaissance.getYear();
    }

    public double bonifier(double bonus){
        moyenne += bonus;
        return moyenne;
    }

    public double getMoyenne() {
        return moyenne;
    }

}
