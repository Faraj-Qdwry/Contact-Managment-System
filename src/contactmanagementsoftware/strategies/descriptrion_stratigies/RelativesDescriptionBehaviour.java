package contactmanagementsoftware.strategies.descriptrion_stratigies;

import contactmanagementsoftware.MUI;
import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.Contact;
import contactmanagementsoftware.contacts.Relatives;

public class RelativesDescriptionBehaviour implements ContactDescriptionBehaviour {

    @Override
    public void setDescription(ContactManagementComponent contact) {
        MUI mui = MUI.getInstance();
        Relatives relatives = (Relatives) contact;

        mui.getOne().setText(relatives.getBDate());
        mui.getTwo().setText(relatives.getLDate());
    }
}
