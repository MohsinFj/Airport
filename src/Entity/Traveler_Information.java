/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import MySql.Tools;
import java.awt.Image;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.*;

/**
 *
 * @author mohsi
 */
public class Traveler_Information implements MainData{
    
    private int Id;
    private String Name;
    private String degree_of_travel;
    private String Category_name;
    private double Price;
    private String path;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDegree_of_travel() {
        return degree_of_travel;
    }

    public void setDegree_of_travel(String degree_of_travel) {
        this.degree_of_travel = degree_of_travel;
    }

    public String getCategory_name() {
        return Category_name;
    }

    public void setCategory_name(String Category_name) {
        this.Category_name = Category_name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    @Override
    public void add() {
        InputStream is=null;
        try 
        {
             is=new FileInputStream(path);
        } 
        catch (FileNotFoundException ex) 
        {
            Tools.msgBox(ex.getMessage());
        }
        //System.out.println("Is =" +is);
        String add="Insert into Traveler_information values ('" + Id + "','" +Name + "','" + degree_of_travel + "','" +Category_name + "','" + Price + "','" + is + "')";
        boolean isAdded=MySql.go.runNonQuery(add);
        if(isAdded)
        {
            Tools.msgBox("Traveler_information is Added");
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        String delet="delete from Traveler_information where Id='" + Id + "'";
        boolean isDeleted=MySql.go.runNonQuery(delet);
        if(isDeleted)
        {
            Tools.msgBox("Traveler_information is Deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return MySql.go.autoNum("Traveler_information", "Id");
    }

    @Override
    public void getAllRows(JTable table) {
        MySql.go.fillToJTable("Traveler_information", table);
    }

    @Override
    public void getOneRow(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        MySql.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Image getImage(JLabel label,int id)
    {
        String search="SELECT * FROM Traveler_information WHERE Id='"+id+"'";
        //System.out.println(img);
        return MySql.go.getSQLImage(search,label);
        
    }
}
