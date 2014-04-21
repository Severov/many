/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mymany;

import com.sun.org.apache.regexp.internal.RESyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

import org.sqlite.*;


/**
 *
 * @author mishka
 */
public class  CWorkInDataBaseSQLite implements IWorkInDataBase{
    
    private String connectString;
    
    private static Connection dataBase;
    private static Statement  statement;
    private static ResultSet  resSet;
    /**
     * 
     * @param connectString - строка подключения к БД
     */
    public CWorkInDataBaseSQLite(String connectString){
        this.connectString = connectString;
    }
    
    public  CWorkInDataBaseSQLite(){
        
    }
    
    /**
     * 
     * @return - результат подключения к БД 
     */
    @Override
    public boolean connect(){
        try {
            Class.forName("org.sqlite.JDBC");
            dataBase  = DriverManager.getConnection("jdbc:sqlite:" + connectString);
            statement = dataBase.createStatement();   
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CWorkInDataBaseSQLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /**
     * 
     * @param SQL - SQL запрос для выполнения
     * @return    - Результат выполнения запроса
     */
    @Override
    public ResultSet execute(String SQL){     
        try {
            return statement.executeQuery(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(CWorkInDataBaseSQLite.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean Insert(String SQL){
        try {
            return statement.execute(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(CWorkInDataBaseSQLite.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    @Override
     public boolean createNewDataBase() {
        return false;
    }
    
    // *** СЕКЦИЯ PRIVATE ***

   
    
}
