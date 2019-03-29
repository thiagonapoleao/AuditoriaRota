/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal;


import com.bean.Picklist;
import com.bean.Roteiros;
import com.dao.LoginJpaDAO;
import com.dao.PicklistJpaDAO;
import com.dao.RoteirosJpaDAO;
import com.utils.DataHora;
import com.utils.Tabela;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author thiago.napoleao
 */
public class Blitz extends javax.swing.JPanel {

   
    DataHora dataHora;
    

    /**
     * Creates new form GraficoUpm
     */
    public Blitz() throws ParseException {
        initComponents();
        MaskFormatter maskData = new MaskFormatter("##/##/####");  
        maskData.install(dataTxt); 
        DataHora dataHora = new DataHora();
        hora();
        defaults();
        dataTxt.requestFocus(true);
            
      
    }

   
        
   public void defaults()  {
        
       
    dataTxt.requestFocus(true);
    
      
    }
    
     public void hora(){
         
         
        new Thread() {
            @Override
            public void run() {
                while (true){
             DataHora hora = new DataHora();
                    horaTxt.setText(hora.Hora());
                   
                  
             }
            }
        }.start(); 
        
     }
              
     
     
     public void dados() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
     DataHora hora = new DataHora();    
     Picklist pick = new Picklist();
     pick.setRotaauditada(rotaAuditadaTxt.getText());
     pick.setPicklislido(leituraTxt.getText());
     pick.setPicklist(picklistTxt.getText());
     pick.setVolume(volumeTxt.getText());
     pick.setRota(rotaTxt.getText());
     pick.setRoteiro(roteiroTxt.getText());
     pick.setData(hora.Data());
     pick.setHora(hora.Hora());
     pick.setAuditor(auditorTxt.getText());
     pick.setDataauditada(dataTxt.getText());
     
     PicklistJpaDAO.getInstance().persist(pick);
     
      leituraTxt.setText("");
      leituraTxt.requestFocus(true);
      preencherTabela();
      contT();
      
     }
     
     public void roteiro() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
     zerar();
     List<Roteiros> rot = RoteirosJpaDAO.getInstance().findByCodigo(rotaAuditadaTxt.getText());
     
     String rot1 = "";
     String rot2 = "";
     String rot3 = "";
     String rot4 = "";
     String rot5 = "";
     String rot6 = "";
     String rot7 = "";
     String rot8 = "";
     String rot9 = "";
     String rot10 = "";
     String rot11 = "";
     String rot12 = "";
     String rot13 = "";
     String rot14 = "";
     String rot15 = "";
     String rot16 = "";
     String rot17 = "";
     String rot18 = "";
     String rot19 = "";
     String rot20 = "";
     String rot21 = "";
     String rot22 = "";
     String rot23 = "";
     String rot24 = "";
     String rot25 = "";
     String rot26 = "";
     String rot27 = "";
     String rot28 = "";
     String seq = "";
    
      
     try{
     for (int b = 0; b < rot.size(); b++) {
       String seqTemp = "0";
       seqTemp = rot.get(b).getSequencia().replace(" ", "");
       seq = seqTemp;
             
       if(seq.equals("1")){                             
       String tempRot1 = "0";
       tempRot1 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot1 = tempRot1.replace(".", "");
       rot1 = tempRot1;
       System.out.println("rot1 " + rot1);    
       roteiro1.setText(rot1);
      }
       
       if(seq.equals("2")){                             
       String tempRot2 = "0";
       tempRot2 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot2 = tempRot2.replace(".", "");
       rot2 = tempRot2;
       System.out.println("rot2 " + rot2);   
        roteiro2.setText(rot2);
      }
       
       if(seq.equals("3")){                             
       String tempRot3 = "0";
       tempRot3 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot3 = tempRot3.replace(".", "");
       rot3 = tempRot3;
       System.out.println("rot3 " + rot3);  
        roteiro3.setText(rot3);
      }
       
       if(seq.equals("4")){                             
       String tempRot4 = "0";
       tempRot4 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot4 = tempRot4.replace(".", "");
       rot4 = tempRot4;
       System.out.println("rot4 " + rot4);  
        roteiro4.setText(rot4);
      }
       
       if(seq.equals("5")){                             
       String tempRot5 = "0";
       tempRot5 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot5 = tempRot5.replace(".", "");
       rot5 = tempRot5;
       System.out.println("rot5 " + rot5);  
        roteiro5.setText(rot5);
      }
       
       if(seq.equals("6")){                             
       String tempRot6 = "0";
       tempRot6 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot6 = tempRot6.replace(".", "");
       rot6 = tempRot6;
       System.out.println("rot6 " + rot6); 
        roteiro6.setText(rot6);
      }
       
       
       if(seq.equals("7")){                             
       String tempRot7 = "0";
       tempRot7 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot7 = tempRot7.replace(".", "");
       rot7 = tempRot7;
       System.out.println("rot7 " + rot7);  
        roteiro7.setText(rot7);
      } 
       
       
       if(seq.equals("8")){                             
       String tempRot8 = "0";
       tempRot8 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot8 = tempRot8.replace(".", "");
       rot8 = tempRot8;
       System.out.println("rot8 " + rot8); 
        roteiro8.setText(rot8);
      } 
     
       
       if(seq.equals("9")){                             
       String tempRot9 = "0";
       tempRot9 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot9= tempRot9.replace(".", "");
       rot9 = tempRot9;
       System.out.println("rot9 " + rot9);    
        roteiro9.setText(rot9);
      }
       
       if(seq.equals("10")){                             
       String tempRot10 = "0";
       tempRot10 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot10 = tempRot10.replace(".", "");
       rot10 = tempRot10;
       System.out.println("rot10" + rot10); 
        roteiro10.setText(rot10);
      }
      
       
       if(seq.equals("11")){                             
       String tempRot11 = "0";
       tempRot11 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot11 = tempRot11.replace(".", "");
       rot11 = tempRot11;
       System.out.println("rot11 " + rot11);   
        roteiro11.setText(rot11);
      }
       
       if(seq.equals("12")){                             
       String tempRot12 = "0";
       tempRot12 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot12 = tempRot12.replace(".", "");
       rot12 = tempRot12;
       System.out.println("rot12 " + rot12);  
        roteiro12.setText(rot12);
      } 
       
       
       if(seq.equals("13")){                             
       String tempRot13 = "0";
       tempRot13 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot13 = tempRot13.replace(".", "");
       rot13 = tempRot13;
       System.out.println("rot13 " + rot13);  
        roteiro13.setText(rot13);
      } 
       
       
       if(seq.equals("14")){                             
       String tempRot14 = "0";
       tempRot14 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot14 = tempRot14.replace(".", "");
       rot14 = tempRot14;
       System.out.println("rot14 " + rot14);   
        roteiro14.setText(rot14);
      }
       
       if(seq.equals("15")){                             
       String tempRot15 = "0";
       tempRot15 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot15 = tempRot15.replace(".", "");
       rot15 = tempRot15;
       System.out.println("rot15 " + rot15);
        roteiro15.setText(rot15);
      }
       
       if(seq.equals("16")){                             
       String tempRot16 = "0";
       tempRot16 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot16 = tempRot16.replace(".", "");
       rot16 = tempRot16;
       System.out.println("rot16 " + rot16);   
        roteiro16.setText(rot16);
      } 
       
       if(seq.equals("17")){                             
       String tempRot17 = "0";
       tempRot17 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot17 = tempRot17.replace(".", "");
       rot17 = tempRot17;
       System.out.println("rot17 " + rot17); 
        roteiro17.setText(rot17);
      }  
       
       if(seq.equals("18")){                             
       String tempRot18 = "0";
       tempRot18 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot18 = tempRot18.replace(".", "");
       rot18 = tempRot18;
       System.out.println("rot18 " + rot18);    
        roteiro18.setText(rot18);
      } 
     
       
       if(seq.equals("19")){                             
       String tempRot19 = "0";
       tempRot19 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot19 = tempRot19.replace(".", "");
       rot19 = tempRot19;
       System.out.println("rot19 " + rot19);    
        roteiro19.setText(rot19);
      }
       
       if(seq.equals("20")){                             
       String tempRot20 = "0";
       tempRot20 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot20 = tempRot20.replace(".", "");
       rot20 = tempRot20;
       System.out.println("rot20 " + rot20);   
        roteiro20.setText(rot20);
      } 
       
       if(seq.equals("21")){                             
       String tempRot21 = "0";
       tempRot21 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot21 = tempRot21.replace(".", "");
       rot21 = tempRot21;
       System.out.println("rot21 " + rot21);    
        roteiro21.setText(rot21);
      } 
       
       
       if(seq.equals("22")){                             
       String tempRot22 = "0";
       tempRot22 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot22 = tempRot22.replace(".", "");
       rot22 = tempRot22;
       System.out.println("rot22 " + rot22);    
        roteiro22.setText(rot22);
      } 
       
       if(seq.equals("23")){                             
       String tempRot23 = "0";
       tempRot23 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot23 = tempRot23.replace(".", "");
       rot23 = tempRot23;
       System.out.println("rot23 " + rot23);   
        roteiro23.setText(rot23);
      }
       
       if(seq.equals("24")){                             
       String tempRot24 = "0";
       tempRot24 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot24 = tempRot24.replace(".", "");
       rot24 = tempRot24;
       System.out.println("rot24 " + rot24);   
        roteiro24.setText(rot24);
      }
       
       
       if(seq.equals("25")){                             
       String tempRot25 = "0";
       tempRot25 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot25 = tempRot25.replace(".", "");
       rot25 = tempRot25;
       System.out.println("rot25 " + rot25);   
        roteiro25.setText(rot25);
      }
       
       if(seq.equals("26")){                             
       String tempRot26 = "0";
       tempRot26 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot26 = tempRot26.replace(".", "");
       rot26 = tempRot26;
       System.out.println("rot26 " + rot26);   
        roteiro26.setText(rot26);
      }
       
       if(seq.equals("27")){                             
       String tempRot27 = "0";
       tempRot27 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot27 = tempRot27.replace(".", "");
       rot27 = tempRot27;
       System.out.println("rot27 " + rot27);   
        roteiro27.setText(rot27);
      }
       
       if(seq.equals("28")){                             
       String tempRot28 = "0";
       tempRot28 = rot.get(b).getRoteiro().replace(" ", "");
       tempRot28 = tempRot28.replace(".", "");
       rot28 = tempRot28;
       System.out.println("rot28" + rot28);   
        roteiro28.setText(rot28);
      } 
      }
     }catch(Exception e){
         e.printStackTrace();
      }
       cont1();
     }
     
     
     
     public void cont1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro1.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(Rota) AS Rota FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
           while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro1.setText("");
            break;
            }
            contRoteiro1.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont2();
            
      }
     
       public void cont2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro2.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro2.setText("");
            break;
            }
            contRoteiro2.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont3();
        }
     
      public void cont3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro3.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro3.setText("");
            break;
            }
            contRoteiro3.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont4();
        }
     
         
         
      public void cont4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro4.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro4.setText("");
            break;
            }
            contRoteiro4.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont5();
        }
           
           
           
      public void cont5() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro5.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro5.setText("");
            break;
            }
            contRoteiro5.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
           cont6();
        }
            
      public void cont6() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro6.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro6.setText("");
            break;
            }
            contRoteiro6.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont7();
        }
             
             
             
                 
      public void cont7() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro7.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
             while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro7.setText("");
            break;
            }
            contRoteiro7.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont8();
        }
     
             
                 
      public void cont8() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro8.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
             while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro8.setText("");
            break;
            }
            contRoteiro8.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont9();
        }
     
                 
      public void cont9() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro9.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro9.setText("");
             break;
            }
            contRoteiro9.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont10();
        }
     
             
                 
      public void cont10() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro10.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro10.setText("");
            break;
            }
            contRoteiro10.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont11();
        }
     
             
            
      public void cont11() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro11.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro11.setText("");
            break;
            }
            contRoteiro11.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont12();
        }
             
             
                 
      public void cont12() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro12.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro12.setText("");
            break;
            }
            contRoteiro12.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont13();
        }
     
             
     public void cont13() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro13.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro13.setText("");
            break;
            }
            contRoteiro13.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont14();
            
     }
          
              
      public void cont14() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro14.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro14.setText("");
            break;
            }
            contRoteiro14.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
           cont15();
            
     }
             
      public void cont15() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro15.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro15.setText("");
            break;
            }
            contRoteiro15.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
           cont16();
            
     }
             
             
     public void cont16() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro16.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro16.setText("");
            break;
            }
            contRoteiro16.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont17();
            
     }
       
     
     public void cont17() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro17.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro17.setText("");
            break;
            }
            contRoteiro17.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont18();
            
     } 
     
     
      public void cont18() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro18.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro18.setText("");
            break;
            }
            contRoteiro18.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont19();
            
     }
      
      
     public void cont19() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro19.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro19.setText("");
            break;
            }
            contRoteiro19.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont20();
            
     }
      
      
      public void cont20() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro20.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro20.setText("");
            break;
            }
            contRoteiro20.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont21();
            
     }
      
      public void cont21() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro21.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro21.setText("");
            break;
            }
            contRoteiro21.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont22();
            
     }
     
      
      public void cont22() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro22.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro22.setText("");
            break;
            }
            contRoteiro22.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont23();
            
     }
      
      
      public void cont23() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro23.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro23.setText("");
            break;
            }
            contRoteiro23.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont24();
            
     }
      
      
      public void cont24() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro24.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro24.setText("");
            break;
            }
            contRoteiro24.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont25();
            
     }
      
      
      
      public void cont25() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro25.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro25.setText("");
            break;
            }
            contRoteiro25.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont26();
            
     }
      
      
      public void cont26() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro26.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro26.setText("");
            break;
            }
            contRoteiro26.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont27();
            
     }
      
      
      public void cont27() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro27.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro27.setText("");
            break;
            }
            contRoteiro27.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            cont28();
            
     }
      
      
      public void cont28() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            String cont = roteiro28.getText();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada='"+data+"' and Rota='"+cont1+"' and Roteiro='"+cont+"'");
            //ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Rota='"+cont1+"' and Roteiro='"+cont+"'");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            if(name.equals("0")){
            contRoteiro28.setText("");
            break;
            }
            contRoteiro28.setText(rs.getString(1));
           
            }
            rs.close();
            st.close();
            conn.close();
            contT();
            
     }
      
      
       public void contT() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
         
      Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.16.0.79/prevencao","default","123456");
            Statement st = conn.createStatement();
            st = conn.createStatement();
            String cont1 = rotaAuditadaTxt.getText();
            String data = dataTxt.getText();
            ResultSet rs = st.executeQuery("SELECT COUNT(DISTINCT Picklislido) FROM Picklist WHERE Dataauditada= '"+data+"' and Rota='"+cont1+"';");
            while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
            lblTotal.setText(rs.getString(1));
            }
            rs.close();
            st.close();
            conn.close();
           preencherTabela();
            
     }
      
      
      
     public void zerar(){
         
      roteiro1.setText("");
      roteiro2.setText("");
      roteiro3.setText("");
      roteiro4.setText("");
      roteiro5.setText("");
      roteiro6.setText("");
      roteiro7.setText("");
      roteiro8.setText("");
      roteiro9.setText("");
      roteiro10.setText("");
      roteiro11.setText("");
      roteiro12.setText("");
      roteiro13.setText("");
      roteiro14.setText("");
      roteiro15.setText("");
      roteiro16.setText("");
      roteiro17.setText("");
      roteiro18.setText("");
      roteiro19.setText("");
      roteiro20.setText("");
      roteiro21.setText("");
      roteiro22.setText("");
      roteiro23.setText("");
      roteiro24.setText("");
      roteiro25.setText("");
      roteiro26.setText("");
      roteiro27.setText("");
      roteiro28.setText("");
               
     }
  
     
     
     public void preencherTabela() {
       
         
         try {
            ArrayList dados = new ArrayList();

            String[] Colunas = new String[]{"Cod", "Picklist", "Volume", "Rota", "Roteiro", "Hora"};
            
            /////////////////////////////////////
            
            List<Picklist> prt = PicklistJpaDAO.getInstance().findByDataRota(dataTxt.getText(), rotaAuditadaTxt.getText());

            for(int i = 0; i < prt.size(); i++) {

            dados.add(new Object[]{prt.get(i).getId(), prt.get(i).getPicklist(), prt.get(i).getVolume(), prt.get(i).getRota(), prt.get(i).getRoteiro(), prt.get(i).getHora()});
            
            }

            Tabela tabela = new Tabela(dados, Colunas);
            tblConferencia.setModel(tabela);
            tblConferencia.setRowSorter(new TableRowSorter(tabela));
            
            tblConferencia.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblConferencia.getColumnModel().getColumn(0).setResizable(false);
            
            tblConferencia.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblConferencia.getColumnModel().getColumn(1).setResizable(false);
            
            tblConferencia.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblConferencia.getColumnModel().getColumn(2).setResizable(false);
            
            tblConferencia.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblConferencia.getColumnModel().getColumn(3).setResizable(false);
            
            tblConferencia.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblConferencia.getColumnModel().getColumn(4).setResizable(false);
            
            tblConferencia.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblConferencia.getColumnModel().getColumn(5).setResizable(false);
            
      
        
            tblConferencia.getTableHeader().setReorderingAllowed(false);
            tblConferencia.setAutoResizeMode(tblConferencia.AUTO_RESIZE_OFF);
            tblConferencia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
            
        }catch(Exception ex) {
            ex.printStackTrace();
        } 
       
    }
     
      public void excluirDados() {
        /**
         * getValueAt devolve o valor de uma linha/coluna no principio de por exemplo : linha 1 coluna 1
         * getSelectedRow() devolve um valor int com numero indice da linha selecionada
         * getSelectedColumn() devolve um valor int com numero indice da coluna selecionada
         */
         int id = (int) tblConferencia.getValueAt(tblConferencia.getSelectedRow(), tblConferencia.getSelectedColumn());
        
        PicklistJpaDAO.getInstance().removeById(id);
        System.out.println("Linha removida...");
        
        preencherTabela();
        System.out.println("Tabela atualizada...");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        leituraTxt = new javax.swing.JTextField();
        horaTxt = new javax.swing.JLabel();
        lblH1 = new javax.swing.JLabel();
        rotaTxt = new javax.swing.JTextField();
        lblH2 = new javax.swing.JLabel();
        roteiroTxt = new javax.swing.JTextField();
        lblH3 = new javax.swing.JLabel();
        lblH4 = new javax.swing.JLabel();
        picklistTxt = new javax.swing.JTextField();
        volumeTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConferencia = new javax.swing.JTable();
        lblH7 = new javax.swing.JLabel();
        auditorTxt = new javax.swing.JTextField();
        rotaAuditadaTxt = new javax.swing.JTextField();
        lblH8 = new javax.swing.JLabel();
        lblH5 = new javax.swing.JLabel();
        roteiro1 = new javax.swing.JLabel();
        roteiro2 = new javax.swing.JLabel();
        roteiro3 = new javax.swing.JLabel();
        roteiro4 = new javax.swing.JLabel();
        roteiro5 = new javax.swing.JLabel();
        roteiro6 = new javax.swing.JLabel();
        roteiro7 = new javax.swing.JLabel();
        contRoteiro1 = new javax.swing.JLabel();
        contRoteiro2 = new javax.swing.JLabel();
        contRoteiro3 = new javax.swing.JLabel();
        contRoteiro4 = new javax.swing.JLabel();
        contRoteiro5 = new javax.swing.JLabel();
        contRoteiro6 = new javax.swing.JLabel();
        contRoteiro7 = new javax.swing.JLabel();
        roteiro8 = new javax.swing.JLabel();
        roteiro9 = new javax.swing.JLabel();
        roteiro10 = new javax.swing.JLabel();
        roteiro11 = new javax.swing.JLabel();
        roteiro12 = new javax.swing.JLabel();
        roteiro13 = new javax.swing.JLabel();
        roteiro14 = new javax.swing.JLabel();
        contRoteiro8 = new javax.swing.JLabel();
        contRoteiro9 = new javax.swing.JLabel();
        contRoteiro10 = new javax.swing.JLabel();
        contRoteiro11 = new javax.swing.JLabel();
        contRoteiro12 = new javax.swing.JLabel();
        contRoteiro14 = new javax.swing.JLabel();
        contRoteiro15 = new javax.swing.JLabel();
        contRoteiro16 = new javax.swing.JLabel();
        contRoteiro17 = new javax.swing.JLabel();
        contRoteiro18 = new javax.swing.JLabel();
        contRoteiro19 = new javax.swing.JLabel();
        contRoteiro20 = new javax.swing.JLabel();
        contRoteiro21 = new javax.swing.JLabel();
        roteiro15 = new javax.swing.JLabel();
        roteiro16 = new javax.swing.JLabel();
        roteiro17 = new javax.swing.JLabel();
        roteiro18 = new javax.swing.JLabel();
        roteiro19 = new javax.swing.JLabel();
        roteiro20 = new javax.swing.JLabel();
        roteiro21 = new javax.swing.JLabel();
        contRoteiro22 = new javax.swing.JLabel();
        contRoteiro23 = new javax.swing.JLabel();
        contRoteiro24 = new javax.swing.JLabel();
        contRoteiro25 = new javax.swing.JLabel();
        contRoteiro26 = new javax.swing.JLabel();
        contRoteiro27 = new javax.swing.JLabel();
        contRoteiro28 = new javax.swing.JLabel();
        roteiro22 = new javax.swing.JLabel();
        roteiro23 = new javax.swing.JLabel();
        roteiro24 = new javax.swing.JLabel();
        roteiro25 = new javax.swing.JLabel();
        roteiro26 = new javax.swing.JLabel();
        roteiro27 = new javax.swing.JLabel();
        roteiro28 = new javax.swing.JLabel();
        contRoteiro13 = new javax.swing.JLabel();
        lblH9 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblH10 = new javax.swing.JLabel();
        dataTxt = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(18, 33, 71));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Lucida Fax", 1, 55)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 51));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/logo13.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Leitura do Picklist");

        leituraTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        leituraTxt.setForeground(new java.awt.Color(0, 51, 102));
        leituraTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leituraTxtKeyReleased(evt);
            }
        });

        horaTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        horaTxt.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(leituraTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(horaTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(leituraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(horaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(horaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leituraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblH1.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH1.setForeground(new java.awt.Color(255, 255, 255));
        lblH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH1.setText("Picklist");
        lblH1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        rotaTxt.setEditable(false);
        rotaTxt.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        rotaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rotaTxt.setFocusable(false);
        rotaTxt.setRequestFocusEnabled(false);

        lblH2.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH2.setForeground(new java.awt.Color(255, 255, 255));
        lblH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH2.setText("Volume");
        lblH2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiroTxt.setEditable(false);
        roteiroTxt.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        roteiroTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roteiroTxt.setFocusable(false);
        roteiroTxt.setRequestFocusEnabled(false);

        lblH3.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH3.setForeground(new java.awt.Color(255, 255, 255));
        lblH3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH3.setText("Rota");
        lblH3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblH4.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH4.setForeground(new java.awt.Color(255, 255, 255));
        lblH4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH4.setText("Roteiro");
        lblH4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        picklistTxt.setEditable(false);
        picklistTxt.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        picklistTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        picklistTxt.setFocusable(false);
        picklistTxt.setRequestFocusEnabled(false);
        picklistTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picklistTxtActionPerformed(evt);
            }
        });

        volumeTxt.setEditable(false);
        volumeTxt.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        volumeTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        volumeTxt.setFocusable(false);
        volumeTxt.setRequestFocusEnabled(false);

        tblConferencia.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tblConferencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblConferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblConferencia.setGridColor(new java.awt.Color(255, 255, 255));
        tblConferencia.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblConferencia);

        lblH7.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH7.setForeground(new java.awt.Color(255, 255, 255));
        lblH7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH7.setText("Nome do Auditor");
        lblH7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        auditorTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        auditorTxt.setForeground(new java.awt.Color(0, 51, 102));
        auditorTxt.setNextFocusableComponent(leituraTxt);
        auditorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auditorTxtKeyReleased(evt);
            }
        });

        rotaAuditadaTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        rotaAuditadaTxt.setForeground(new java.awt.Color(0, 51, 102));
        rotaAuditadaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rotaAuditadaTxt.setNextFocusableComponent(auditorTxt);
        rotaAuditadaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rotaAuditadaTxtKeyReleased(evt);
            }
        });

        lblH8.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH8.setForeground(new java.awt.Color(255, 255, 255));
        lblH8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH8.setText("Rota Auditada");
        lblH8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblH5.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH5.setForeground(new java.awt.Color(255, 255, 255));
        lblH5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH5.setText("Volumes por Roteiros");
        lblH5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro1.setForeground(new java.awt.Color(255, 255, 255));
        roteiro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro2.setForeground(new java.awt.Color(255, 255, 255));
        roteiro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro3.setForeground(new java.awt.Color(255, 255, 255));
        roteiro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro4.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro4.setForeground(new java.awt.Color(255, 255, 255));
        roteiro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro5.setForeground(new java.awt.Color(255, 255, 255));
        roteiro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro6.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro6.setForeground(new java.awt.Color(255, 255, 255));
        roteiro6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro7.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro7.setForeground(new java.awt.Color(255, 255, 255));
        roteiro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro1.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro2.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro3.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro4.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro4.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro5.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro6.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro6.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro7.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro7.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro8.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro8.setForeground(new java.awt.Color(255, 255, 255));
        roteiro8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro9.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro9.setForeground(new java.awt.Color(255, 255, 255));
        roteiro9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro10.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro10.setForeground(new java.awt.Color(255, 255, 255));
        roteiro10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro11.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro11.setForeground(new java.awt.Color(255, 255, 255));
        roteiro11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro12.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro12.setForeground(new java.awt.Color(255, 255, 255));
        roteiro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro13.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro13.setForeground(new java.awt.Color(255, 255, 255));
        roteiro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro14.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro14.setForeground(new java.awt.Color(255, 255, 255));
        roteiro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro8.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro8.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro9.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro9.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro10.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro10.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro11.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro11.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro12.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro12.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro14.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro14.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro15.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro15.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro16.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro16.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro17.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro17.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro18.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro18.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro19.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro19.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro20.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro20.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro21.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro21.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro15.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro15.setForeground(new java.awt.Color(255, 255, 255));
        roteiro15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro16.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro16.setForeground(new java.awt.Color(255, 255, 255));
        roteiro16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro17.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro17.setForeground(new java.awt.Color(255, 255, 255));
        roteiro17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro18.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro18.setForeground(new java.awt.Color(255, 255, 255));
        roteiro18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro19.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro19.setForeground(new java.awt.Color(255, 255, 255));
        roteiro19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro20.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro20.setForeground(new java.awt.Color(255, 255, 255));
        roteiro20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro21.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro21.setForeground(new java.awt.Color(255, 255, 255));
        roteiro21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro22.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro22.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro23.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro23.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro24.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro24.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro25.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro25.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro26.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro26.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro27.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro27.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro28.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro28.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro22.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro22.setForeground(new java.awt.Color(255, 255, 255));
        roteiro22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro23.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro23.setForeground(new java.awt.Color(255, 255, 255));
        roteiro23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro24.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro24.setForeground(new java.awt.Color(255, 255, 255));
        roteiro24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro25.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro25.setForeground(new java.awt.Color(255, 255, 255));
        roteiro25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro26.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro26.setForeground(new java.awt.Color(255, 255, 255));
        roteiro26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro27.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro27.setForeground(new java.awt.Color(255, 255, 255));
        roteiro27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roteiro28.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiro28.setForeground(new java.awt.Color(255, 255, 255));
        roteiro28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roteiro28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contRoteiro13.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        contRoteiro13.setForeground(new java.awt.Color(255, 51, 0));
        contRoteiro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contRoteiro13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblH9.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH9.setForeground(new java.awt.Color(255, 255, 255));
        lblH9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH9.setText("Total de Volumes");
        lblH9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTotal.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 51, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblH10.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH10.setForeground(new java.awt.Color(255, 255, 255));
        lblH10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH10.setText("Data da Auditoria");
        lblH10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dataTxt.setForeground(new java.awt.Color(0, 51, 102));
        dataTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        dataTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataTxtKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Atualizar Roteiros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Excluir Leitura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblH10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblH7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblH8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotaAuditadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(auditorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblH9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataTxt)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roteiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contRoteiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roteiro8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contRoteiro8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contRoteiro9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contRoteiro10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contRoteiro11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contRoteiro12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contRoteiro14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(contRoteiro13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roteiro15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contRoteiro15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roteiro22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contRoteiro22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contRoteiro28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(picklistTxt)
                                    .addComponent(lblH1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(volumeTxt)
                                    .addComponent(lblH2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblH5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rotaTxt)
                                    .addComponent(lblH3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roteiroTxt)
                                    .addComponent(lblH4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblH10)
                                    .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblH8)
                                    .addComponent(rotaAuditadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblH9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblH7)
                                        .addComponent(auditorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblH1)
                                    .addComponent(lblH2)
                                    .addComponent(lblH3)
                                    .addComponent(lblH4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(picklistTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volumeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roteiroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblH5)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(roteiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contRoteiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(contRoteiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(roteiro8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(roteiro14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(contRoteiro8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contRoteiro12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(contRoteiro14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(roteiro22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(roteiro23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(roteiro24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(roteiro25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(roteiro26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(roteiro27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(roteiro28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(contRoteiro22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(contRoteiro23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(contRoteiro24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(contRoteiro25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(contRoteiro26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(contRoteiro27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(contRoteiro28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(roteiro15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(roteiro16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(roteiro17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(roteiro18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(roteiro19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(roteiro20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(contRoteiro13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(roteiro21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(contRoteiro15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contRoteiro16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contRoteiro17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contRoteiro18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contRoteiro19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contRoteiro20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(contRoteiro21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void leituraTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leituraTxtKeyReleased
        // TODO add your handling code here:
          if(evt.getKeyCode() == 10){
               try {
                 String valor = leituraTxt.getText();     
                 valor.charAt(0);
              
                if(valor.charAt(0) > 0){
                 picklistTxt.setText(leituraTxt.getText().substring(0,7));
                 volumeTxt.setText(leituraTxt.getText().substring(7,10));
                 rotaTxt.setText(leituraTxt.getText().substring(10,13));
                 roteiroTxt.setText(leituraTxt.getText().substring(13,16));     
              
                 if(rotaTxt.getText().equals(rotaAuditadaTxt.getText())){
                 dados();     
                 } else{
                 // JOptionPane.showMessageDialog(null, "Rota não Pertence a Blitz!");
                 Toolkit.getDefaultToolkit().beep();
                 TelaSenha tela = new TelaSenha(); 
                 tela.setVisible(true);
                  leituraTxt.setText("");
                 }  
                 } else{
                 // JOptionPane.showMessageDialog(null, "Picklist não Existe!"); 
                 Toolkit.getDefaultToolkit().beep();
                 TelaSenha tela = new TelaSenha(); 
                 tela.setVisible(true);
                  leituraTxt.setText("");
                }   
               
            }catch(Exception e) {
             e.printStackTrace();
            
            }
          }
    }//GEN-LAST:event_leituraTxtKeyReleased

    private void picklistTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picklistTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_picklistTxtActionPerformed

    private void auditorTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auditorTxtKeyReleased
        // TODO add your handling code here:
         if(evt.getKeyCode() == 10){
             if( auditorTxt.getText().length() > 0){
               leituraTxt.requestFocus(true);  
             } else{
             JOptionPane.showMessageDialog(null, "Informe o nome do Auditor!");
         }
             
         }
    }//GEN-LAST:event_auditorTxtKeyReleased

    private void rotaAuditadaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rotaAuditadaTxtKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
           try {
            roteiro();
            auditorTxt.requestFocus(true);
        }catch(Exception e){
            e.printStackTrace();
        } 
      }  
    }//GEN-LAST:event_rotaAuditadaTxtKeyReleased

    private void dataTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTxtKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            try{
                rotaAuditadaTxt.requestFocus();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_dataTxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            cont1();
            leituraTxt.requestFocus(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Blitz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Blitz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Blitz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Blitz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        excluirDados();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auditorTxt;
    private javax.swing.JLabel contRoteiro1;
    private javax.swing.JLabel contRoteiro10;
    private javax.swing.JLabel contRoteiro11;
    private javax.swing.JLabel contRoteiro12;
    private javax.swing.JLabel contRoteiro13;
    private javax.swing.JLabel contRoteiro14;
    private javax.swing.JLabel contRoteiro15;
    private javax.swing.JLabel contRoteiro16;
    private javax.swing.JLabel contRoteiro17;
    private javax.swing.JLabel contRoteiro18;
    private javax.swing.JLabel contRoteiro19;
    private javax.swing.JLabel contRoteiro2;
    private javax.swing.JLabel contRoteiro20;
    private javax.swing.JLabel contRoteiro21;
    private javax.swing.JLabel contRoteiro22;
    private javax.swing.JLabel contRoteiro23;
    private javax.swing.JLabel contRoteiro24;
    private javax.swing.JLabel contRoteiro25;
    private javax.swing.JLabel contRoteiro26;
    private javax.swing.JLabel contRoteiro27;
    private javax.swing.JLabel contRoteiro28;
    private javax.swing.JLabel contRoteiro3;
    private javax.swing.JLabel contRoteiro4;
    private javax.swing.JLabel contRoteiro5;
    private javax.swing.JLabel contRoteiro6;
    private javax.swing.JLabel contRoteiro7;
    private javax.swing.JLabel contRoteiro8;
    private javax.swing.JLabel contRoteiro9;
    private javax.swing.JFormattedTextField dataTxt;
    private javax.swing.JLabel horaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblH1;
    private javax.swing.JLabel lblH10;
    private javax.swing.JLabel lblH2;
    private javax.swing.JLabel lblH3;
    private javax.swing.JLabel lblH4;
    private javax.swing.JLabel lblH5;
    private javax.swing.JLabel lblH7;
    private javax.swing.JLabel lblH8;
    private javax.swing.JLabel lblH9;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField leituraTxt;
    public javax.swing.JTextField picklistTxt;
    private javax.swing.JTextField rotaAuditadaTxt;
    public javax.swing.JTextField rotaTxt;
    private javax.swing.JLabel roteiro1;
    private javax.swing.JLabel roteiro10;
    private javax.swing.JLabel roteiro11;
    private javax.swing.JLabel roteiro12;
    private javax.swing.JLabel roteiro13;
    private javax.swing.JLabel roteiro14;
    private javax.swing.JLabel roteiro15;
    private javax.swing.JLabel roteiro16;
    private javax.swing.JLabel roteiro17;
    private javax.swing.JLabel roteiro18;
    private javax.swing.JLabel roteiro19;
    private javax.swing.JLabel roteiro2;
    private javax.swing.JLabel roteiro20;
    private javax.swing.JLabel roteiro21;
    private javax.swing.JLabel roteiro22;
    private javax.swing.JLabel roteiro23;
    private javax.swing.JLabel roteiro24;
    private javax.swing.JLabel roteiro25;
    private javax.swing.JLabel roteiro26;
    private javax.swing.JLabel roteiro27;
    private javax.swing.JLabel roteiro28;
    private javax.swing.JLabel roteiro3;
    private javax.swing.JLabel roteiro4;
    private javax.swing.JLabel roteiro5;
    private javax.swing.JLabel roteiro6;
    private javax.swing.JLabel roteiro7;
    private javax.swing.JLabel roteiro8;
    private javax.swing.JLabel roteiro9;
    public javax.swing.JTextField roteiroTxt;
    private javax.swing.JTable tblConferencia;
    public javax.swing.JTextField volumeTxt;
    // End of variables declaration//GEN-END:variables

  
}
