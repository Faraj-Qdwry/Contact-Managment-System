package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import org.jdesktop.swingx.JXTable;

import javax.swing.*;

public class DeleteCommand implements Command {
    static MUI mui;

    @Override
    public void execute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mui = MUI.getInstance();
        JList jList1 = mui.getjList1();
        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        int x = mui.getX();
        boolean flag = mui.getNewContact();
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
        int n = JOptionPane.showConfirmDialog(
                mui,
                "Are you sure you want to delete this?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            mui.getMainDirectory().get(index).remove(tindex);
            JOptionPane.showMessageDialog(mui, "Successfully Deleted");
            mui.setUpTableData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
}
