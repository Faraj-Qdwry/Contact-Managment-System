package contactmanagementsoftware;

import org.jdesktop.swingx.JXTable;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class editCommand implements Command {

    static MUI mui;
    @Override
    public void execute(ActionEvent evt){//GEN-FIRST:event_jButton5ActionPerformed
        mui = MUI.getInstance();
        JList jList1 = mui.getjList1();
        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        int x = mui.getX();
        boolean flag = mui.getFlag();
        JXTable jXTable1 = mui.getjXTable1();


        int index = jList1.getSelectedIndex();
        if (index < 0) {
            JOptionPane.showMessageDialog(mui, "Select a category!");
            return;
        }
        int tindex = jXTable1.getSelectedRow();
        if (tindex < 0) {
            JOptionPane.showMessageDialog(mui, "Select an entry!");
            return;
        }
        mui.setNum(tindex);
        mui.setFlag(false);
        mui.setDflag(false);
        x = index;
        //todo observable.notify()
        mui.setDescription();
        jPanel1.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
}
