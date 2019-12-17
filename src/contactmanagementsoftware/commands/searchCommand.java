package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import org.jdesktop.swingx.JXTable;

import javax.swing.*;

public class searchCommand implements Command {

    static MUI mui;

    @Override
    public void execute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        mui = MUI.getInstance();
        JList jList1 = mui.getjList1();
        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel2 = mui.getjPanel2();
        int x = mui.getX();
        boolean flag = mui.getIsNewContact();
        JXTable jXTable1 = mui.getjXTable1();
        javax.swing.JTextPane details = mui.getDetails();
        String str = mui.getSearchString();

        String s = (String) JOptionPane.showInputDialog(
                mui,
                "Enter name: ",
                "Input",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                "");
        if (s == null)
            return;
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        mui.setSearchString(s);
        details.setContentType("text/html");
        mui.searchContactRun();
    }//GEN-LAST:event_jButton3ActionPerformed

}
