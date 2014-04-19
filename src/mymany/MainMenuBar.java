/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mymany;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author mishka
 */
public class MainMenuBar extends javax.swing.JMenuBar{
        
    public MainMenuBar(){
        InitMenu();
    }
    
    private void InitMenu(){ 
     // Меню 1-го уровня 
    JMenu menuFile    = new JMenu("Файл");
    JMenu menuEdit    = new JMenu("Правка");
    JMenu menuView    = new JMenu("Вид");
    JMenu menuCatalog = new JMenu("Справочники");
    JMenu menuTools   = new JMenu("Инструменты");
    JMenu menuHelp    = new JMenu("Помощь");
    
    add(menuFile);
    add(menuEdit);
    add(menuView);
    add(menuCatalog);
    add(menuTools);
    add(menuHelp);
    
     // Меню 2-го уровня *** ФАЙЛ ***
     JMenuItem menuFileItem = new JMenuItem("Выход");
     menuFile.add(menuFileItem);
     
     
    
    }
}
