package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.Contact;
import contactmanagementsoftware.contacts.ProfessionalFriends;

public class ProfessionalFriendsDescriptionBehaviour implements ContactDescriptionBehaviour {

    @Override
    public void setDescription(ContactManagementComponent contact) {
        MUI mui = MUI.getInstance();
        ProfessionalFriends professionalFriends = (ProfessionalFriends) contact;

        mui.getOne().setText(professionalFriends.getCommonInterests());
    }
}
