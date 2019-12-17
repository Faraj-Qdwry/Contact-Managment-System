package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.CasualContact;

public class CasualContactsIterator extends ContactsIterator {

    public CasualContactsIterator(ContactManagementComponent items) {
        super(items);
    }

    public CasualContact next() {
        return (CasualContact) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}
