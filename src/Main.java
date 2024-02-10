package apprenant;

import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant {
    private String nom;
    private String prenom;
    private int date_de_naissance;
    private String adresse;
    private int numero_telephone;
    private int numero_classe;
    //public Apprenant(){
                /*this.nom = nom;
                this.prenom = prenom;
                this.date_de_nessance = date_de_nessance;
                this.adresse = adresse;
                this.numero_telephone = numero_telephone;
                this.numero_classe = numero_classe;*/
    //}

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDate_de_naissance() {
        return date_de_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumero_telephone() {
        return numero_telephone;
    }

    public int getNumero_classe() {
        return numero_classe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_de_naissance(int date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumero_telephone(int numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public void setNumero_classe(int numero_classe) {
        this.numero_classe = numero_classe;
    }

    public void Ajouter(ArrayList<Apprenant> apprenants){
        Apprenant A = new Apprenant(); //Creation d'un Objet A
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nom du apprenant :");
        A.nom = scanner.nextLine();
        System.out.println("Entrer le prenom du apprenant :");
        A.prenom = scanner.nextLine();
        System.out.println("Entrer la date de naissance :");
        A.date_de_naissance = scanner.nextInt();
        System.out.println("Entrer l'adresse :");
        A.adresse = scanner.nextLine();
        System.out.println("Entrer le numero de telephone du apprenant :");
        A.numero_telephone= scanner.nextInt();
        System.out.println("Entrer le numero de la classe du apprenant :");
        A.numero_classe= scanner.nextInt();

        apprenants.add(A);
    }
    public void Consulter(ArrayList<Apprenant> apprenants){
        System.out.println("le nom du apprenant :" +nom);
        System.out.println("le prenom du apprenant :" +prenom);
        System.out.println("la date de naissance :" + date_de_naissance);
        System.out.println("l'adresse :" +adresse);
        System.out.println("le numero de telephone du apprenant :"+ numero_telephone);
        System.out.println("le numero de la classe du apprenant :" + numero_classe);
    }
}
