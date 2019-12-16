package contactmanagementsoftware.strategies.visibility_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.CasualAcquaintances;

public class CasualAcquaintancesVisibilityBehaviour implements AcquaintancesVisibilityBehaviour {

    @Override
    public void setVisibility() {
        MUI mui = MUI.getInstance();
        mui.jScrollPane5.setVisible(true);
        mui.jScrollPane4.setVisible(true);
        mui.getTwo().setVisible(true);
        mui.getThree().setVisible(true);
        mui.jLabel7.setVisible(true);
        mui.jLabel8.setVisible(true);
        mui.jLabel9.setVisible(true);
        mui.jLabel7.setText("First meeting time & location:");
        mui.jLabel8.setText("First meeting Circumstances:");
        mui.jLabel9.setText("Other useful information:");
    }
}
