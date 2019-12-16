package contactmanagementsoftware.strategies.visibility_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.Relatives;

public class RelativesVisibilityBehaviour implements AcquaintancesVisibilityBehaviour {
    @Override
    public void setVisibility() {
        MUI mui = MUI.getInstance();

        mui.jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, mui.op + " Relatives Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
        mui.jLabel7.setText("<html>Relatives Birthday:<br> (dd/mm/yyyy)</html>");
        mui.jLabel8.setVisible(true);
        mui.jLabel7.setVisible(true);
        mui.getTwo().setVisible(true);
        mui.jLabel8.setText("<html>Last Date met:<br> (dd/mm/yyyy)</html>");
        mui.jLabel9.setVisible(false);
        mui.getThree().setVisible(false);
        mui.jScrollPane4.setVisible(true);
        mui.jScrollPane5.setVisible(false);
    }
}
