/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;



/**
 *
 * @author User
 */

public class Question {


    private Integer id;
    
    private String titre;
    
    private String contenu;
   
    private Date dateQ;
   
    private String img;
    
    private String categorie;
    private Integer iduser;

    public Question() {
    }

    public Question(Integer id) {
        this.id = id;
    }

    public Question(String titre, String contenu, Date dateQ, String img, String categorie) {
        this.titre = titre;
        this.contenu = contenu;
        this.dateQ = dateQ;
        this.img = img;
        this.categorie = categorie;
    }

    

    public Question(Integer id, String titre, String contenu, Date dateQ, String img, String categorie) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.dateQ = dateQ;
        this.img = img;
        this.categorie = categorie;
    }

    public Question(Integer id, String titre, String contenu, Date dateQ, String img, String categorie, Integer iduser) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.dateQ = dateQ;
        this.img = img;
        this.categorie = categorie;
        this.iduser = iduser;
    }
    

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    
    
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
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

    public Date getDateQ() {
        return dateQ;
    }

    public void setDateQ(Date dateQ) {
        this.dateQ = dateQ;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", titre=" + titre + ", contenu=" + contenu + ", dateQ=" + dateQ + ", img=" + img + ", categorie=" + categorie + ", iduser=" + iduser + '}';
    }


    
}
