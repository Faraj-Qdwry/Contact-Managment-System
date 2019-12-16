package contactmanagementsoftware.strategies.visibility_stratigies;

import contactmanagementsoftware.MUI;

public class ProfessionalFriendsVisibilityBehaviour implements AcquaintancesVisibilityBehaviour {
    @Override
    public void setVisibility() {
        MUI mui = MUI.getInstance();

        mui.jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, mui.op + " Professional Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
        mui.jLabel7.setText("Common Interests: ");
        mui.jLabel7.setVisible(true);
        mui.jLabel8.setVisible(false);
        mui.getTwo().setVisible(false);
        mui.jScrollPane4.setVisible(false);
        mui.jLabel9.setVisible(false);
        mui.getThree().setVisible(false);
        mui.jScrollPane5.setVisible(false);
    }
}
