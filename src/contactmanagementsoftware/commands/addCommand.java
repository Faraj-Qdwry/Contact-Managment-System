package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class addCommand implements Command {
    static MUI mui;

    public addCommand(MUI mui) {
       this.mui = mui;
    }


    public  void execute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mui = MUI.getInstance();
        JList jList1 = mui.getjList1();
        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        boolean flag = mui.getIsNewContact();


        int index = jList1.getSelectedIndex();
        if (index < 0) {
            JOptionPane.showMessageDialog(mui, "Select a category!");
            return;
        }
        jPanel1.setVisible(false);
        jPanel3.setVisible(true);
        mui.setChosenCategory(index);
        mui.setIsNewContact(true);
        mui.setDescriptionSet(false) ;
        mui.setDescription();
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void undo(ActionEvent evt) {

    }
}
