package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.ProfessionalFriends;

public class ProfessionalFriendsDescriptionBehaviour implements AcquaintancesDescriptionBehaviour {

    @Override
    public void setDescription(Acquaintances acquaintances) {
        MUI mui = MUI.getInstance();
        ProfessionalFriends professionalFriends = (ProfessionalFriends) acquaintances;

        mui.getOne().setText(professionalFriends.getCommonInterests());
    }
}
