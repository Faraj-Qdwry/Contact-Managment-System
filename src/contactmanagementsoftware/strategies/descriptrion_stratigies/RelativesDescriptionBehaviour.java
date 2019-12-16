package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.Relatives;

public class RelativesDescriptionBehaviour implements AcquaintancesDescriptionBehaviour {

    @Override
    public void setDescription(Acquaintances acquaintances) {
        MUI mui = MUI.getInstance();
        Relatives relatives = (Relatives) acquaintances;

        mui.getOne().setText(relatives.getBDate());
        mui.getTwo().setText(relatives.getLDate());
    }
}
