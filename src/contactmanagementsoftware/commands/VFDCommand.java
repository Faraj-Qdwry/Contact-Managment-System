package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import org.jdesktop.swingx.JXTable;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VFDCommand implements Command {
    static MUI mui;

    public VFDCommand(MUI mui) {
        this.mui = mui;
    }

    @Override
    public void execute(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        mui = MUI.getInstance();
        JList jList1 = mui.getjList1();
        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        int x = mui.getX();
        boolean flag = mui.getIsNewContact();
        boolean dflag = mui.getIsDescriptionSet();
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
        mui.setIsNewContact(false);
        mui.setChosenCategory(index);
        jPanel1.setVisible(false);
        jPanel3.setVisible(true);
        mui.setDescriptionSet(true);
        mui.setDescription();
    }//GEN-LAST:event_jButton6ActionPerformed
}
