package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;

import javax.swing.*;

public class BackToMainMenuCommand implements Command {
    static MUI mui;
    @Override
    public void execute(java.awt.event.ActionEvent evt)  {//GEN-FIRST:event_jButton9ActionPerformed
        mui = MUI.getInstance();

        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel2 = mui.getjPanel2();

        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
}
