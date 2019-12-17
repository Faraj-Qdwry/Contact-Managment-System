package contactmanagementsoftware.contacts;

import contactmanagementsoftware.composit.ContactComponent;
import contactmanagementsoftware.strategies.descriptrion_stratigies.ContactDescriptionBehaviour;

import java.io.Serializable;

public class Contact extends ContactComponent implements Serializable {

    private ContactDescriptionBehaviour descriptionBehaviour;

    Contact(ContactDescriptionBehaviour descriptionBehaviour) {
        this.descriptionBehaviour = descriptionBehaviour;
        number++;
    }

    @Override
    public ContactDescriptionBehaviour getDescriptionBehaviour() {
        return descriptionBehaviour;
    }

    @Override
    public boolean MobileNoChecker(String str) {
        int x;
        for (int j = 0; j < str.length(); j++) {
            x = (int) str.charAt(j);
            if (x < 48 || x > 57)
                return false;
        }
        return true;
    }
}
