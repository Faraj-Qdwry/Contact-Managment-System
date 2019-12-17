package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.*;
import contactmanagementsoftware.strategies.descriptrion_stratigies.CasualContactDescriptionBehaviour;
import contactmanagementsoftware.strategies.descriptrion_stratigies.PersonalFriendsDescriptionBehaviour;
import contactmanagementsoftware.strategies.descriptrion_stratigies.ProfessionalFriendsDescriptionBehaviour;
import contactmanagementsoftware.strategies.descriptrion_stratigies.RelativesDescriptionBehaviour;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class addContactCommand implements Command {

    static MUI mui;

    public addContactCommand(MUI mui) {
        this.mui = mui;
    }


    @Override
    public void execute(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        mui = MUI.getInstance();
        ContactManagementComponent mainDirectory = mui.getMainDirectory();

        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        boolean flag = mui.getIsNewContact();

        int num = mui.getNum();
        int x = mui.getX();

        JTextField name = mui.getNameTF();
        JTextField mobile = mui.getMobile();
        JTextField email = mui.getEmail();

        JTextArea one = mui.getOne();
        JTextArea two = mui.getTwo();
        JTextArea three = mui.getThree();
        mui.setDescriptionSet(true);
        String Name = name.getText();

        if (Name.isEmpty()) {
            JOptionPane.showMessageDialog(mui, "Enter a name");
            return;
        }
        String Mobile = mobile.getText();
        if (!mui.MobileNoChecker(Mobile)) {
            JOptionPane.showMessageDialog(mui, "Enter a valid mobile number (6-15 digits)");
            return;
        }
        String Email = email.getText();
        if (!Email.contains("@")) {
            JOptionPane.showMessageDialog(mui, "Enter a valid email");
            return;
        }

        String One, Two, Three;
        switch (mui.getChosenCategory()) {
            case 0: //perF
                One = one.getText();
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Two = two.getText();
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Three = three.getText();
                if (!mui.validDate(Three)) {
                    return;
                }
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                PersonalFriends perF;
                if (mui.getIsNewContact())
                    perF = new PersonalFriends(new PersonalFriendsDescriptionBehaviour());
                else
                    perF = (PersonalFriends) mainDirectory.get(mui.getChosenCategory()).get(num);
                perF.setName(Name);
                perF.setMobileNo(Mobile);
                perF.setEmail(Email);
                perF.setEvents(One);
                perF.setAContext(Two);
                perF.setADate(Three);
                if (mui.getIsNewContact())
                    mainDirectory.get(mui.getChosenCategory()).add(perF);
                //this.a.get(x).add(perF);
                break;
            case 1: //rel
                One = one.getText();
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                if (!mui.validDate(One)) {
                    return;
                }
                Two = two.getText();
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                if (!mui.validDate(Two)) {
                    return;
                }
                Relatives rel;
                if (mui.getIsNewContact())
                    rel = new Relatives(new RelativesDescriptionBehaviour());
                else
                    rel = (Relatives) mainDirectory.get(mui.getChosenCategory()).get(num);
                rel.setName(Name);
                rel.setMobileNo(Mobile);
                rel.setEmail(Email);
                rel.setBDate(One);
                rel.setLDate(Two);
                if (mui.getIsNewContact())
                    mainDirectory.get(mui.getChosenCategory()).add(rel);
                break;

            case 2: //proF
                One = one.getText();
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                ProfessionalFriends proF;
                if (mui.getIsNewContact())
                    proF = new ProfessionalFriends(new ProfessionalFriendsDescriptionBehaviour());
                else
                    proF = (ProfessionalFriends) mainDirectory.get(mui.getChosenCategory()).get(num);
                proF.setName(Name);
                proF.setMobileNo(Mobile);
                proF.setEmail(Email);
                proF.setCommonInterests(One);
                if (mui.getIsNewContact())
                    mainDirectory.get(mui.getChosenCategory()).add(proF);
                break;
            case 3: //ca
                One = one.getText();
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Two = two.getText();
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Three = three.getText();
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                CasualContact ca;
                if (mui.getIsNewContact())
                    ca = new CasualContact(new CasualContactDescriptionBehaviour());
                else
                    ca = (CasualContact) mainDirectory.get(mui.getChosenCategory()).get(num);
                ca.setName(Name);
                ca.setMobileNo(Mobile);
                ca.setEmail(Email);
                ca.setWhenWhere(One);
                ca.setCircumstances(Two);
                ca.setOtherInfo(Three);
                if (mui.getIsNewContact())
                    mainDirectory.get(mui.getChosenCategory()).add(ca);
                break;
            default:
                break;
        }
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);
        mui.setUpTableData();
    }//GEN-LAST:event_jButton10ActionPerformed

    @Override
    public void undo(ActionEvent evt) {

    }

}
