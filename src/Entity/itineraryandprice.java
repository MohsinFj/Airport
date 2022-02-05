/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import MySql.Tools;
import java.sql.Time;
import javax.swing.JTable;

/**
 *
 * @author mohsi
 */
public class itineraryandprice implements  MainData {

    private int trip_Id;
    private String Departure_city;
    private String Arrival_city;
    private Time Take_of_Time;
    private Time Arrtival_Time;
    private double FC_ticket_price;
    private double EC_ticket_price;

    public int getTrip_Id() {
        return trip_Id;
    }

    public void setTrip_Id(int trip_Id) {
        this.trip_Id = trip_Id;
    }

    public String getDeparture_city() {
        return Departure_city;
    }

    public void setDeparture_city(String Departure_city) {
        this.Departure_city = Departure_city;
    }

    public String getArrival_city() {
        return Arrival_city;
    }

    public void setArrival_city(String Arrival_city) {
        this.Arrival_city = Arrival_city;
    }

    public Time getTake_of_Time() {
        return Take_of_Time;
    }

    public void setTake_of_Time(Time Take_of_Time) {
        this.Take_of_Time = Take_of_Time;
    }

    public Time getArrtival_Time() {
        return Arrtival_Time;
    }

    public void setArrtival_Time(Time Arrtival_Time) {
        this.Arrtival_Time = Arrtival_Time;
    }

    public double getFC_ticket_price() {
        return FC_ticket_price;
    }

    public void setFC_ticket_price(double FC_ticket_price) {
        this.FC_ticket_price = FC_ticket_price;
    }

    public double getEC_ticket_price() {
        return EC_ticket_price;
    }

    public void setEC_ticket_price(double EC_ticket_price) {
        this.EC_ticket_price = EC_ticket_price;
    }

    
    @Override
    public void add() {
        String add="INSERT INTO itineraryandprice(Trip_id,Departure_city,Arrival_city,Takeoff_time,Arrival_time,FC_ticket_price,EC_ticket_price) VALUES('"
                    +trip_Id+"','"+Departure_city+"','"+Arrival_city+"','"+Take_of_Time+"','"+Arrtival_Time+"','"+FC_ticket_price+"','"+EC_ticket_price+"')";
        
        boolean isAdded=MySql.go.runNonQuery(add);
        if(isAdded)
        {
            Tools.msgBox("Itinerary And Price is Added");
        }
    }

    @Override
    public void update() {
        String update="UPDATE itineraryandprice SET Departure_city='" + Departure_city + "', Arrival_city='" + Arrival_city + "', Takeoff_time='"+ Take_of_Time+"', Arrival_time='" +Arrtival_Time +"', FC_ticket_price='"+FC_ticket_price+"', EC_ticket_price='"+EC_ticket_price+"' WHERE Trip_id='" + trip_Id +"'";      
        boolean isUpdated=MySql.go.runNonQuery(update);
        if(isUpdated)
        {
            Tools.msgBox("Itinerary And Price is Updated");
        }
    }

    @Override
    public void delete() {
        String delet="delete from itineraryandprice where Trip_id='" + trip_Id + "'";
        boolean isDeleted=MySql.go.runNonQuery(delet);
        if(isDeleted)
        {
            Tools.msgBox("Itinerary And Price is Deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return MySql.go.autoNum("itineraryandprice", "Trip_id");
    }

    @Override
    public void getAllRows(JTable table) {
        MySql.go.fillToJTable("itineraryandprice", table);
    }

    @Override
    public void getOneRow(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValueByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
