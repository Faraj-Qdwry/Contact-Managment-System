package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.CasualAcquaintances;

public class CasualAcquaintancesDescriptionBehaviour implements AcquaintancesDescriptionBehaviour {

    @Override
    public void setDescription(Acquaintances acquaintances) {
        MUI mui = MUI.getInstance();
        CasualAcquaintances casualAcquaintances = (CasualAcquaintances) acquaintances;

        mui.getOne().setText(casualAcquaintances.getWhenWhere());
        mui.getTwo().setVisible(true);
        mui.getThree().setVisible(true);
        mui.getTwo().setText(casualAcquaintances.getCircumstances());
        mui.getThree().setText(casualAcquaintances.getOtherInfo());
    }
}
