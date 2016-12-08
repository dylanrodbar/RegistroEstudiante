package registroestudiante;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorCelda extends DefaultTableCellRenderer {
    String colorCelda = "";    
    
    public ColorCelda getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      System.out.println(value.toString());
       System.out.println(this.colorCelda);
       if(value.toString().equals("No")){
           this.colorCelda = "Rojo";
           this.setBackground(Color.RED);
       }
       
       else if(value.toString().equals("Si")){
           this.colorCelda = "Verde";
           this.setBackground(Color.GREEN);
       }
       
       else{
           if(this.colorCelda.equals("Rojo"))
               this.setBackground(Color.RED);
           else
               this.setBackground(Color.GREEN);
           }
      

      return this;
   }

    
}
