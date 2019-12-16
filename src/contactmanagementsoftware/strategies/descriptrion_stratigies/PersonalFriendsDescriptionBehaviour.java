package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.PersonalFriends;

public class PersonalFriendsDescriptionBehaviour implements AcquaintancesDescriptionBehaviour {

    @Override
    public void setDescription(Acquaintances acquaintances) {
        MUI mui = MUI.getInstance();
        PersonalFriends personalFriends = (PersonalFriends) acquaintances;

        mui.getOne().setText(personalFriends.getEvents());
        mui.getTwo().setText(personalFriends.getAContext());
        mui.getThree().setText(personalFriends.getADate());
    }
}
