/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author jaoua
 */
public class Command {
     private int id;
    private int id_client;
    private String description;
    private Date date_command;
    private Double amount;

    public Command(int id, int id_client, String description, Date date_command, Double amount) {
        this.id = id;
        this.id_client = id_client;
        this.description = description;
        this.date_command = date_command;
        this.amount = amount;
    }

    public Command(int id_client, String description, Date date_command, Double amount) {
        this.id_client = id_client;
        this.description = description;
        this.date_command = date_command;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_command() {
        return date_command;
    }

    public void setDate_command(Date date_command) {
        this.date_command = date_command;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
