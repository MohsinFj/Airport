/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import MySql.Tools;
import java.sql.Date;
import javax.swing.JTable;


public class Planes implements MainData{
    
    private int Plan_id;
    private int FC_seats_num;
    private int EC_seats_num;

    public int getPlan_id() {
        return Plan_id;
    }

    public void setPlan_id(int Plan_id) {
        this.Plan_id = Plan_id;
    }

    public int getFC_seats_num() {
        return FC_seats_num;
    }

    public void setFC_seats_num(int FC_seats_num) {
        this.FC_seats_num = FC_seats_num;
    }

    public int getEC_seats_num() {
        return EC_seats_num;
    }

    public void setEC_seats_num(int EC_seats_num) {
        this.EC_seats_num = EC_seats_num;
    }

    @Override
    public void add() {
        String insert="insert into Planes values ('" + Plan_id + "','" + FC_seats_num + "','" + EC_seats_num + "')";
        
        boolean isAdd=MySql.go.runNonQuery(insert);
        if(isAdd)
        {
            Tools.msgBox("Planes is Added");
        }
    }

    @Override
    public void update() {
        
        String update="update Planes set FC_seats_num='" + FC_seats_num + "',EC_seats_num='" + EC_seats_num + "' where Plan_id='" + Plan_id +"'";
        
        boolean isUpdeted=MySql.go.runNonQuery(update);
        if(isUpdeted)
        {
            Tools.msgBox("Planes is iUpdeted");
        }
    }

    @Override
    public void delete() {
        
        String delete="Delete form Planes where Plane_id=" + Plan_id;
        boolean isdeleted=MySql.go.runNonQuery(delete);
        if(isdeleted)
        {
            Tools.msgBox("Planes is Delete");
        }
    }

    @Override
    public String getAutoNumber() {
        return MySql.go.autoNum("Planes", "Plane_id");
    }

    @Override
    public void getAllRows(JTable table) {
        MySql.go.fillToJTable("Planes", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String select="select * from Planes where Plan_id='" + Plan_id + "'";
        MySql.go.fillToJTable(select, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        MySql.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        //getTableData
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        //getTableData
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
