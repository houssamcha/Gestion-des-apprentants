package apprenant;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Apprenant {
        private String nom;
        private String prenom;
        private int date_de_nessance;
        private String adresse;
        private int numero_telephone;
        private int numero_classe;
        public Apprenant(String nom,String prenom, int date_de_nessance, String adresse,int numero_telephone,int numero_classe){
                this.nom = nom;
                this.prenom = prenom;
                this.date_de_nessance = date_de_nessance;
                this.adresse = adresse;
                this.numero_telephone = numero_telephone;
                this.numero_classe = numero_classe;
        }
        public void Ajouter(){
                System.out.printf("Entrer le nom ici :");
                Scanner scan = new Scanner(System.in);
        }
}
