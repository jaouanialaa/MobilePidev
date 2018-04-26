/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Collection;
import java.util.Date;


/**
 *
 * @author User
 */

public class Article {


    private Integer id;

    private String titre;

    private String contenu;

    private Date date;

    private Date temps;

    private Collection<Categorie> categorieCollection;
    
    private Collection<ArticleRate> articleRateCollection;

    public Article() {
    }

    public Article(Integer id) {
        this.id = id;
    }

    public Article(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
        this.date = date;
        this.temps = temps;
    }


    
    
    
    public Article(Integer id, String titre, String contenu, Date date, Date temps) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.date = date;
        this.temps = temps;
    }

    public Article(Integer id, String titre, String contenu) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
    }

    

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTemps() {
        return temps;
    }

    public void setTemps(Date temps) {
        this.temps = temps;
    }

    public Collection<Categorie> getCategorieCollection() {
        return categorieCollection;
    }

    public void setCategorieCollection(Collection<Categorie> categorieCollection) {
        this.categorieCollection = categorieCollection;
    }

    public Collection<ArticleRate> getArticleRateCollection() {
        return articleRateCollection;
    }

    public void setArticleRateCollection(Collection<ArticleRate> articleRateCollection) {
        this.articleRateCollection = articleRateCollection;
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
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Article[ id=" + id + " ]";
    }
    
}
