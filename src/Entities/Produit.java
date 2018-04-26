/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;



/**
 *
 * @author User
 */
public class Produit {
    
  private int id;
    private String nom;
    private double prix;
    private String description;
    private int nb_enstock;
    private String image_produit;
    private String type_produit;
  

    public Produit() {
    }

    public Produit(int id) {
        this.id = id;
    }

    public Produit(double prix) {
      
        this.prix = prix;
    }
    
    
    
    

    public Produit(String nom, double prix, String description, int nb_enstock, String image_produit, String type_produit) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nb_enstock = nb_enstock;
        this.image_produit = image_produit;
        this.type_produit = type_produit;
    }

    public Produit(int id ,String nom, double prix, String description, int nb_enstock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nb_enstock = nb_enstock;
        
    }

    public Produit(int id, String nom, double prix, String description, int nb_enstock, String image_produit, String type_produit) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nb_enstock = nb_enstock;
        this.image_produit = image_produit;
        this.type_produit = type_produit;
    }

    public Produit(String nom, int nb_enstock) {
        this.nom = nom;
        this.nb_enstock = nb_enstock;
    }

    public Produit(String type_produit) {
        this.type_produit = type_produit;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_enstock() {
        return nb_enstock;
    }

    public void setNb_enstock(int nb_enstock) {
        this.nb_enstock = nb_enstock;
    }

    public String getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }

    public String getType_produit() {
        return type_produit;
    }

    public void setType_produit(String type_produit) {
        this.type_produit = type_produit;
    }

 

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", prix=" + prix + ", description=" + description + ", nb_enstock=" + nb_enstock + ", image_produit=" + image_produit + ", type_produit=" + type_produit + '}';
    }
 
    
   
    
    
}
