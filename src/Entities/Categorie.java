/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


import java.util.Collection;

/**
 *
 * @author User
 */

public class Categorie {


   
    private Integer id;
 
    private String nom;
   
    private Integer parent;
    private Integer niveau;
   
    private Collection<Article> articleCollection;

    public Categorie() {
    }

    public Categorie(String nom, Integer parent) {
        this.nom = nom;
        this.parent = parent;
    }
    
    public Categorie(Integer id) {
        this.id = id;
    }

    public Categorie(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Categorie(String nom, Integer parent, Integer niveau) {
        this.nom = nom;
        this.parent = parent;
        this.niveau = niveau;
    }
    

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Collection<Article> getArticleCollection() {
        return articleCollection;
    }

    public void setArticleCollection(Collection<Article> articleCollection) {
        this.articleCollection = articleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", nom=" + nom + ", parent=" + parent + ", articleCollection=" + articleCollection + '}';
    }

    
    
}
