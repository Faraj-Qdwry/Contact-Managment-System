package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.SerializationUtil;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.Contact;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class readFromFileCommand implements Command {

    static MUI mui;

    public readFromFileCommand(MUI mui) {
        this.mui = mui;
    }

    @Override
    public void execute(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mui = MUI.getInstance();

        ContactManagementComponent temp = mui.getTempDirectory();

        ContactManagementComponent mainDirectory = mui.getMainDirectory();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showOpenDialog(mui); //Potential Error, Changed parameter from: (parent: this) => (mui)
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                temp = (Contact) SerializationUtil.deserialize(selectedFile);
            } catch (ClassNotFoundException | IOException e) {
                JOptionPane.showMessageDialog(mui, "Error");
                return;
            }
        } else {
            return;
        }
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < temp.get(i).size(); j++) {
                    mainDirectory.get(i).add(temp.get(i).get(j));
                }
            }
        } catch (Exception e) {

        }
        mui.setUpTableData();
    }//GEN-LAST:event_jButton7ActionPerformed
}
