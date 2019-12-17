package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.ProfessionalFriends;

public class ProfessionalFriendsIterator extends ContactsIterator {

    public ProfessionalFriendsIterator(ContactManagementComponent items) {
        super(items);
    }

    public ProfessionalFriends next() {
        return (ProfessionalFriends) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}