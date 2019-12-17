package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.SerializationUtil;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.Contact;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SaveCommand implements Command {
    static MUI mui;

    @Override
    public void execute(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mui = MUI.getInstance();

        ContactManagementComponent temp = mui.getTempDirectory();

        ContactManagementComponent mainDirectory = mui.getMainDirectory();

        String s = (String) JOptionPane.showInputDialog(
                mui,
                "Enter file name: (*.ser)",
                "Input",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                "output.ser");
        if (s == null)
            return;
        if (!s.endsWith(".ser")) {
            JOptionPane.showMessageDialog(mui, "File name should end with .ser");
            return;
        }
        File[] fileList = (new File(".")).listFiles((File pathname) -> pathname.getName().endsWith(".ser"));
        boolean flag = false;
        for (File f : fileList) {
            if (f.getName().matches(s)) {
                flag = true;
            }
        }
        if (flag) {
            int q = JOptionPane.showConfirmDialog(mui, s + " already exists:\nAre you sure you want to overwrite?");
            if (q != 0)
                return;
        }
        try {
            SerializationUtil.serialize(mainDirectory, s);
        } catch (IOException e) {
            return;
        }
        JOptionPane.showMessageDialog(mui, s + " saved successfully");
    }//GEN-LAST:event_jButton8ActionPerformed
}
