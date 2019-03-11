/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kauil
 */
public class TablaNewton extends AbstractTableModel{
    private String columnas[]={"i","xi","fxi","fxi'","fx/fx","raiz","error"};
    private ArrayList<IteracionNewton> lista;
    
    public TablaNewton(ArrayList<IteracionNewton> lista){
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
         //To change body of generated methods, choose Tools | Templates.
         return this.lista.size();
    }

    @Override
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
         return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         //To change body of generated methods, choose Tools | Templates.
         
          IteracionNewton fila = this.lista.get(rowIndex);
     switch(columnIndex){
         
         case 0: return fila.getI();
         case 1: return fila.getXi();
         case 2: return fila.getFxi();
         case 3: return fila.getFxi1();
         case 4: return fila.getFxidiv();
         case 5: return fila.getRaiz();
         case 6: return fila.getError();
       
         
                
     
     }
     return null;
         
    }
    
    @Override
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
