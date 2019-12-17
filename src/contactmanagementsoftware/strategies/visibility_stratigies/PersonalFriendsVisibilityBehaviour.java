package contactmanagementsoftware.strategies.visibility_stratigies;

import contactmanagementsoftware.MUI;

public class PersonalFriendsVisibilityBehaviour implements ContactsVisibilityBehaviour {
    @Override
    public void setVisibility() {
        MUI mui = MUI.getInstance();

        mui.getTwo().setVisible(true);
        mui.getThree().setVisible(true);
        mui.jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, mui.operation + " Personal Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
        mui.jLabel7.setText("Specific Events:");
        mui.jLabel8.setText("First Acquaintance Context:");
        mui.jLabel9.setVisible(true);
        mui.jLabel3.setVisible(true);
        mui.jLabel8.setVisible(true);
        mui.jLabel7.setVisible(true);
        mui.jScrollPane5.setVisible(true);
        mui.jScrollPane4.setVisible(true);
        mui.jLabel9.setText("<html>First Acquaintance Date:<br>(dd/mm/yyyy)</html>");
    }
}
