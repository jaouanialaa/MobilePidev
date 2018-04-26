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

public class Commentaire {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
   
    private String contenu;
  
    private Date date;
  
    private int idUser;
    
    private int idQuestion;

    public Commentaire() {
    }

    public Commentaire(String contenu, Date date, int idQuestion) {
        this.contenu = contenu;
        this.date = date;
        this.idQuestion = idQuestion;
    }
    

    public Commentaire(Integer id) {
        this.id = id;
    }

    public Commentaire(Integer id, String contenu, Date date, int idUser, int idQuestion) {
        this.id = id;
        this.contenu = contenu;
        this.date = date;
        this.idUser = idUser;
        this.idQuestion = idQuestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
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
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Commentaire[ id=" + id + " ]";
    }
    
}
