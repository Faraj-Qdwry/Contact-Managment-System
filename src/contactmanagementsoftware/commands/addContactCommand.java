package contactmanagementsoftware.commands;
import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.*;

import javax.swing.*;
import java.util.ArrayList;

public class addContactCommand implements Command {

    static MUI mui;

    @Override
    public void execute(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jButton10ActionPerformed

        mui = MUI.getInstance();
        ArrayList<ArrayList<Acquaintances>> a = mui.getA();

        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        boolean flag = mui.getFlag();

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
        switch (mui.getX()) {
            case 0: //perF
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }

                Two = two.getText();
                System.out.println(Two);
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Three = three.getText();
                System.out.println(Three);
                if (!mui.validDate(Three)) {
                    return;
                }
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                PersonalFriends perF;
                System.out.println(flag);
                if (flag)
                    perF = new PersonalFriends();
                else
                    perF = (PersonalFriends) a.get(x).get(num);
                perF.setName(Name);
                perF.setMobileNo(Mobile);
                perF.setEmail(Email);
                perF.setEvents(One);
                perF.setAContext(Two);
                perF.setADate(Three);
                System.out.println(flag);
                if (flag)
                    a.get(x).add(perF);
                //this.a.get(x).add(perF);
                break;
            case 1: //rel
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                if (!mui.validDate(One)) {
                    return;
                }
                Two = two.getText();
                System.out.println(Two);
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                if (!mui.validDate(Two)) {
                    return;
                }
                Relatives rel;
                System.out.println(flag);
                if (flag)
                    rel = new Relatives();
                else
                    rel = (Relatives) a.get(x).get(num);
                rel.setName(Name);
                rel.setMobileNo(Mobile);
                rel.setEmail(Email);
                rel.setBDate(One);
                rel.setLDate(Two);
                System.out.println(flag);
                if (flag)
                    a.get(x).add(rel);
                break;

            case 2: //proF
                One = one.getText();
                System.out.println(One);
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mui, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                ProfessionalFriends proF;
                System.out.println(flag);
                if (flag)
                    proF = new ProfessionalFriends();
                else
                    proF = (ProfessionalFriends) a.get(x).get(num);
                proF.setName(Name);
                proF.setMobileNo(Mobile);
                proF.setEmail(Email);
                proF.setCommonInterests(One);
                System.out.println(flag);
                if (flag)
                    a.get(x).add(proF);
                break;
            case 3: //ca
                One = one.getText();
                System.out.println(One);
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
                CasualAcquaintances ca;
                System.out.println(flag);
                if (flag)
                    ca = new CasualAcquaintances();
                else
                    ca = (CasualAcquaintances) a.get(x).get(num);
                ca.setName(Name);
                ca.setMobileNo(Mobile);
                ca.setEmail(Email);
                ca.setWhenWhere(One);
                ca.setCircumstances(Two);
                ca.setOtherInfo(Three);
                System.out.println(flag);
                if (flag)
                    a.get(x).add(ca);
                break;
            default:
                break;
        }
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);
        mui.setUpTableData();
    }//GEN-LAST:event_jButton10ActionPerformed

}
