package mymany;

import java.sql.ResultSet;

/**
 *
 * @author mishka
 * Интерфейс описывающий работу с БД
 */
public interface IWorkInDataBase {
    /**
     * 
     * @param connectString - Строка подключения к БД
     * @return - Результат подключения
     */
    
    public boolean connect();
    
    public boolean createNewDataBase();
    
   /**
     * 
     * @param SQL - SQL запрос для выполнения
     * @return    - Результат выполнения запроса
     */
    public ResultSet execute(String SQL);
    
}
