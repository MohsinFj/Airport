/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySql;

import java.awt.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class go {
    
    //<editor-fold desc="المتغيرات">
    private static String url=null;
    private static String dbName = "airportdb";
    private static Connection con;
    
    public static boolean tip;   //علامة على ان الاسم غير مكرر في قاعدة البيانات
    
    //</editor-fold>
    
    //<editor-fold desc="دوال الاتصال بقاعدة البيانات">
    private static void setURL()
    {
        url="jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
    }
    
    private static void setConnection()
    {        
        try {
            setURL();
            con=DriverManager.getConnection(url, "root", "");
            
        } catch (SQLException ex) {
            Tools.msgBox(ex.getMessage());
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="cheackUsersAndPass دالةالتحقق من اسم المستخدم ورمز الدخول">
    public static boolean cheakUsersAndPass(String username,String password) 
    {   
        try 
        {   
            //اعداد الاتصال بقاعدة البيانات
            setConnection();
 
            //مقارنةاسم المستخدم والرمز مع بيانات القاعدة
            String cheak="SELECT * FROM users WHERE usre_name='"
                         + username + "' AND password='" + password + "'";
            
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(cheak);   
            
            //التحقق من جميع كلمات المرور في قاعدة البيانات
            if(rs.next())
            {
                con.close();
                return true;  
            }
            else
            {
                con.close();
            }
        } 
        catch (SQLException ex) 
        {            
            Tools.msgBox(ex.getMessage());
        }

        return false;
        
    }
    //</editor-fold>
    
    //<editor-fold desc="insertUserNameAndPassword دالةاضافة اسم المستخدم ورمز الدخول الى قاعدة البيانات">
    public static void insertUserAndPassword(String UserName, String Password,String Name)
    {
        //int n=0;
        try 
        {
            setConnection();
            Statement stm=con.createStatement();
            String insert;
           
            insert="INSERT INTO users(Name , user_name , password) VALUES ('" 
                    + Name + "','" + UserName + "','" + Password + "')";
            stm.executeUpdate(insert);
            con.close();
            tip=true;
        } 
        catch (Exception e) 
        {
            Tools.msgBox(e.getMessage());
            tip=false;
        }
    }
    
    //</editor-fold>
    
    //<editor-fold desc="info رسالة ترحيب بأسم المستخدم">
    public static String info(String Username)
    {
        try 
        {
            setConnection();
            String getName="SELECT * FROM users WHERE usre_name = ('" + Username + "')"; 
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(getName);
            
             
            while(rs.next())
            {
                String name=rs.getString("Name");
                //System.out.print("Name is " + name);
                con.close();
                return name; 
            }
            
        } 
        catch (SQLException e) 
        {
            Tools.msgBox(e.getMessage());
            
        }   
        
        return "";
    }
    //</editor-fold>
    
    //<editor-fold desc="getId جلب الآي دي بشكل مرتب">
    public static Table getId()
    {
        try 
        {
            setConnection();
            String sqlDelet ="select Id from Traveler_info";
            Statement stm=con.createStatement();
            
            ResultSet rs=stm.executeQuery(sqlDelet);
            ResultSetMetaData rsmd=rs.getMetaData();
            int r=rsmd.getColumnCount();
            Object id[]=new Object[r];
            Table table=new Table(r);
            int x=0;
            while(rs.next())
            {
                id[x]=rs.getString(x);
                x++;
            }
            
            table.addNewRow(id);
            
          return table;  
        } catch (SQLException e) {
            Tools.msgBox(e.getMessage());
            return new Table(0);
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="RunNunQuery هذه الدالة مسؤولة عن االتعديل والاضافة والحذف">
    public static boolean runNonQuery(String sqlStatement)
    {
        try 
        {
            setConnection();
            Statement stm =con.createStatement();
            stm.execute(sqlStatement);
            con.close();
            return true;
        } 
        catch (SQLException ex) 
        {
            Tools.msgBox(ex.getMessage());
            return false;
        }
        
    }
    //</editor-fold>
    
    //<editor-fold desc="AuotoNumber هذه الدالة تقوم بترقيم تلقائي للجدول ">
    public static String autoNum(String tableName,String culomnName)
    {
        try 
        {
            setConnection();
            Statement stm=con.createStatement();
            String strAuto="select max(" + culomnName + ") + 1 as 'AutoNumber' from " + tableName;
            stm.executeQuery(strAuto);
            String num="";
            while(stm.getResultSet().next())
            {
                num=stm.getResultSet().getString("AutoNumber");
            }
            con.close();
            if(num==null || "".equals(num))
            {
                return "1";
            }
            else
            {
                return num;
            }
        } 
        catch (Exception e) 
        {
            Tools.msgBox(e.getMessage());
            return "0";
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="">
    public static Table getTableData(String statement)
    {
        
        try 
        {
           setConnection();
           Statement stm=con.createStatement();
           ResultSet rs=stm.executeQuery(statement);
           ResultSetMetaData rsmd=rs.getMetaData();
           int c=rsmd.getColumnCount(); //عدد الاعمدة الموجودة في الاستعلام
           
           Table table=new Table(c);
           
           while(rs.next()) //هنا يتعامل مع الصفوف 
           {
               Object []Row=new Object[c];
               
               //هنا يتعامل مع الاعمدة
               for (int i = 0; i < c; i++) //تملئ الاعمدة وعندما تنتهي الفور ضيف الصف الى الجدول ويعود الى الوايل
               {             //يمثل رقم العمود
                   Row[i]=rs.getString(i+1); // الكود الذي يملئ الصف
               }
               table.addNewRow(Row);  //يضيف الصف الى الجدول
           }
           con.close();
           return table;
        } 
        catch (SQLException e) 
        {
            Tools.msgBox(e.getMessage());
            return new Table(0);
        }    
    }
    //</editor-fold>
    
    //<editor-fold desc="fillComboهذه الدالة تقوم بملئ الكومبوبوكس  ">
    public static void fillCombo(String tableName,String columnName,JComboBox combo)
    {
        try 
        {
            setConnection();
            Statement stm=con.createStatement();
            String stmSelect="SELECT " + columnName + " FROM " + tableName;
            ResultSet rs =stm.executeQuery(stmSelect);
            
            rs.last();//هنا وضعنا الموئشر على اخر صف لكي نعرف عدد الصفوف لان الموئشر في البداية يقف ما قبل البداية اي لا يجلب شي 
            int c=rs.getRow();//هنا يجلب عدد الصفوف
            rs.beforeFirst(); //هنا نعيد الموشر ال ما قبل البداية حتى تعمل الوايل بشكل صحيح
            
            String value[]=new String[c];
            int i=0;
            while(rs.next())
            {
                value[i]=rs.getString(1);
                i++;
            }
            
            con.close();
            
            combo.setModel(new DefaultComboBoxModel(value));//ملئ الكومبوبوك بالعناصر
        } 
        catch (SQLException e) 
        {
            Tools.msgBox(e.getMessage());
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="fillToTable هذه الدالة تقوم بملئ الجول بالمعلومات">
    public static void fillToJTable(String tableNameOrSelectStatement , JTable table)
    {
        try 
        {
            setConnection();
            Statement stm=con.createStatement();
            ResultSet rs;
            String strSelect;  //جملة التنفيذ هل هي اسم جدول ام جملة تنفيذ
            if("select ".equals(tableNameOrSelectStatement.substring(0,7).toLowerCase()))
            {
                strSelect=tableNameOrSelectStatement;
            }
            else
            {
                strSelect="select * From " + tableNameOrSelectStatement;
            }
            
            rs=stm.executeQuery(strSelect);
                                    
                                   //جلب هيكلية البيانات
            ResultSetMetaData rsmd=rs.getMetaData(); //حتى نتعامل مع عدد الاعمدة
            int c=rsmd.getColumnCount();  //جلب عدد الاعمدة 
            
            //نحتاج التعامل مع نموذج جدول
            DefaultTableModel model=(DefaultTableModel)table.getModel();  //حتى نضيف فيه عناصر الصف عند اكمال الفور
            
            //يشبه كلاس الجدول يعني اسمه دوت اضافة اسمه دوت حذف وهكذ
            Vector row=new Vector();    //نملئ الجدول به
            model.setRowCount(0);      //نقوم بتفريغ الجول اي لا يحتوي على اي صف
            
            while(rs.next())
            { 
                row=new Vector(c); //نعطيه عدد الاعمدة في كل دورة
                
                //ندور على كل عمود
                for(int i=1 ;i<=c ;i++)
                {
                    row.add(rs.getString(i));
                }
                model.addRow(row); //هنا قمنا باضافة الصف الى الجول المحدد
            }
            
            //اذا كان عدد الاعمدة من جملة الاستعلام لا تساوي عدد الاعمدة في الجدول نظهر له رسالة خطأ
            if(table.getColumnCount()!=c)
            {
                Tools.msgBox("JTable Culomn Count Not Equal Query Culomn Count !\nJTable CulomnCount = " +table.getColumnCount() + " \nQuery CulomnCount = " + c);
            }
            con.close();
        } 
        catch (SQLException e)
        {
            Tools.msgBox(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="هذه الدالة تجلب صورة من قاعدة البيانات حسب الاسم او الرقم">
    public static Image getSQLImage(String statement,JLabel lblImage)
    {
        Image img=null;
       try 
       {
             setConnection();
             Statement stm=con.createStatement();
             ResultSet rs=stm.executeQuery(statement);
             if(rs.next())
             {
                ImageIcon MyImage=new ImageIcon(rs.getBytes("Image"));
                img=MyImage.getImage();
                
                Image newImage=img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_AREA_AVERAGING);
                ImageIcon image=new ImageIcon(newImage);
                lblImage.setIcon(image);
                
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Image Not Found");
             }
      
            con.close();
             
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       //System.out.println(img);
       return img;
    }
    //</editor-fold>
}