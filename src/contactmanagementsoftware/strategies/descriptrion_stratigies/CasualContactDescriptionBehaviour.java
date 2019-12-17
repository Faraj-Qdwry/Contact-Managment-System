package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.Contact;
import contactmanagementsoftware.contacts.CasualContact;

public class CasualContactDescriptionBehaviour implements ContactDescriptionBehaviour {

    @Override
    public void setDescription(ContactManagementComponent contact) {
        MUI mui = MUI.getInstance();
        CasualContact casualContacts = (CasualContact) contact;

        mui.getOne().setText(casualContacts.getWhenWhere());
        mui.getTwo().setVisible(true);
        mui.getThree().setVisible(true);
        mui.getTwo().setText(casualContacts.getCircumstances());
        mui.getThree().setText(casualContacts.getOtherInfo());
    }
}
