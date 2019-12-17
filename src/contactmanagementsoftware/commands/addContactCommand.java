package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.*;
import contactmanagementsoftware.strategies.descriptrion_stratigies.CasualContactDescriptionBehaviour;
import contactmanagementsoftware.strategies.descriptrion_stratigies.PersonalFriendsDescriptionBehaviour;
import contactmanagementsoftware.strategies.descriptrion_stratigies.ProfessionalFriendsDescriptionBehaviour;
import contactmanagementsoftware.strategies.descriptrion_stratigies.RelativesDescriptionBehaviour;

import javax.swing.*;

public class addContactCommand implements Command {

    static MUI mui;

    @Override
    public void execute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        mui = MUI.getInstance();
        ContactManagementComponent mainDirectory = mui.getMainDirectory();

        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        boolean flag = mui.getNewContact();

        int num = mui.getNum();
        int x = mui.getX();

        JTextField name = mui.getname();
        JTextField mobile = mui.getMobile();
        JTextField email = mui.getEmail();

        JTextArea one = mui.getOne();
        JTextArea two = mui.getTwo();
        JTextArea three = mui.getThree();

        //mui.setDflag(true);

        String Name = name.getText();
        if (Name.isEmpty()) {
            JOptionPane.showMessageDialog(mui, "Enter mainDirectory name");
            return;
        }
        String Mobile = mobile.getText();
        if (!mui.MobileNoChecker(Mobile)) {
            JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid mobile number (6-15 digits)");
            return;
        }
        String Email = email.getText();
        if (!Email.contains("@")) {
            JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid email");
            return;
        }

        String One, Two, Three;
        switch (mui.getX()) {
            case 0: //perF
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }

                Two = two.getText();
                System.out.println(Two);
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                Three = three.getText();
                System.out.println(Three);
                if (!mui.validDate(Three)) {
                    return;
                }
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                PersonalFriends perF;
                System.out.println(flag);
                if (flag)
                    perF = new PersonalFriends(new PersonalFriendsDescriptionBehaviour());
                else
                    perF = (PersonalFriends) mainDirectory.get(x).get(num);
                perF.setName(Name);
                perF.setMobileNo(Mobile);
                perF.setEmail(Email);
                perF.setEvents(One);
                perF.setAContext(Two);
                perF.setADate(Three);
                System.out.println(flag);
                if (flag)
                    mainDirectory.get(x).add(perF);
                //this.mainDirectory.get(x).add(perF);
                break;
            case 1: //rel
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                if (!mui.validDate(One)) {
                    return;
                }
                Two = two.getText();
                System.out.println(Two);
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                if (!mui.validDate(Two)) {
                    return;
                }
                Relatives rel;
                System.out.println(flag);
                if (flag)
                    rel = new Relatives(new RelativesDescriptionBehaviour());
                else
                    rel = (Relatives) mainDirectory.get(x).get(num);
                rel.setName(Name);
                rel.setMobileNo(Mobile);
                rel.setEmail(Email);
                rel.setBDate(One);
                rel.setLDate(Two);
                System.out.println(flag);
                if (flag)
                    mainDirectory.get(x).add(rel);
                break;

            case 2: //proF
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                ProfessionalFriends proF;
                System.out.println(flag);
                if (flag)
                    proF = new ProfessionalFriends(new ProfessionalFriendsDescriptionBehaviour());
                else
                    proF = (ProfessionalFriends) mainDirectory.get(x).get(num);
                proF.setName(Name);
                proF.setMobileNo(Mobile);
                proF.setEmail(Email);
                proF.setCommonInterests(One);
                System.out.println(flag);
                if (flag)
                    mainDirectory.get(x).add(proF);
                break;
            case 3: //ca
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                Two = two.getText();
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                Three = three.getText();
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter mainDirectory valid value ( 1 to 300 chars)");
                    return;
                }
                CasualContact ca;
                System.out.println(flag);
                if (flag)
                    ca = new CasualContact(new CasualContactDescriptionBehaviour());
                else
                    ca = (CasualContact) mainDirectory.get(x).get(num);
                ca.setName(Name);
                ca.setMobileNo(Mobile);
                ca.setEmail(Email);
                ca.setWhenWhere(One);
                ca.setCircumstances(Two);
                ca.setOtherInfo(Three);
                System.out.println(flag);
                if (flag)
                    mainDirectory.get(x).add(ca);
                break;
            default:
                break;
        }
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);
        mui.setUpTableData();
    }//GEN-LAST:event_jButton10ActionPerformed

}
