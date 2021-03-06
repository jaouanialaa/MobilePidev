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

public class Signaler {

    private Integer id;
   
    private String type;
 
    private String description;
   
    private Date date;
 
    private int idType;
  
    private int idUser;

    public Signaler() {
    }

    public Signaler(Integer id) {
        this.id = id;
    }

    public Signaler(Integer id, String type, String description, Date date, int idType, int idUser) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.date = date;
        this.idType = idType;
        this.idUser = idUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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
        if (!(object instanceof Signaler)) {
            return false;
        }
        Signaler other = (Signaler) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Signaler[ id=" + id + " ]";
    }
    
}
