package pkg4btema2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TablaSecante extends AbstractTableModel {

    private String columnas[] = {"i", "X1", "Xo", "fx1", "fxo", "X2", "error"};
    private ArrayList<IteracionSecante> lista;

    public TablaSecante(ArrayList<IteracionSecante> lista) {
        this.lista = lista;
    }

    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.

        return this.lista.size();
    }

    public int getColumnCount() {
        //To change body of generated methods, choose Tools | Templates.

        return this.columnas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        //To change body of generated methods, choose Tools | Templates.

        IteracionSecante fila = this.lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return fila.getI();
            case 1:
                return fila.getX1();
            case 2:
                return fila.getXo();
            case 3:
                return fila.getFx1();
            case 4:
                return fila.getFxo();
            case 5:
                return fila.getX2();
            case 6:
                return fila.getError();

        }
        return null;
    }

    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }

}
