/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import MySql.Tools;
import javax.swing.JTable;


public class Traveler_info implements MainData{
    
    private int Id;
    private String Name;
    private String degree_of_travel;
    private String Category_name;
    private double Price;

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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getDegree_of_travel() {
        return degree_of_travel;
    }

    public void setDegree_of_travel(String degree_of_travel) {
        this.degree_of_travel = degree_of_travel;
    }

    public String getCategory_num() {
        return Category_name;
    }

    public void setCategory_num(String Category_name) {
        this.Category_name = Category_name;
    }
    
    @Override
    public void add() {
        String add="Insert into Traveler_info values ('" + Id + "','" +Name + "','" + degree_of_travel + "','" +Category_name + "','" + Price +"')";
        boolean isAdded=MySql.go.runNonQuery(add);
        if(isAdded)
        {
            Tools.msgBox("Traveler_info is Added");
        }
    }

    @Override
    public void update() {
        String update="update Traveler_info set Name='" + Name + "', Degree_of_travel='" + degree_of_travel + "', Category_num='"+ Category_name+"', Price='" +Price +"' where Id='" + Id +"'";      
        boolean isUpdated=MySql.go.runNonQuery(update);
        if(isUpdated)
        {
            Tools.msgBox("Traveler_info is Updated");
        }
    }

    @Override
    public void delete() {
        String delet="delete from traveler_info where Id='" + Id + "'";
        boolean isDeleted=MySql.go.runNonQuery(delet);
        if(isDeleted)
        {
            Tools.msgBox("Traveler_info is Deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return MySql.go.autoNum("Traveler_info", "Id");
    }

    @Override
    public void getAllRows(JTable table) {
        MySql.go.fillToJTable("Traveler_info", table);
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
    
    public void getImage()
    {
        //String Image="SELECT "
    }
}
