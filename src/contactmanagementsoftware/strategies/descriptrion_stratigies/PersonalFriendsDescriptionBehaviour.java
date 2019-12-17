package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.Contact;
import contactmanagementsoftware.contacts.PersonalFriends;

public class PersonalFriendsDescriptionBehaviour implements ContactDescriptionBehaviour {

    @Override
    public void setDescription(ContactManagementComponent contact) {
        MUI mui = MUI.getInstance();
        PersonalFriends personalFriends = (PersonalFriends) contact;

        mui.getOne().setText(personalFriends.getEvents());
        mui.getTwo().setText(personalFriends.getAContext());
        mui.getThree().setText(personalFriends.getADate());
    }
}
