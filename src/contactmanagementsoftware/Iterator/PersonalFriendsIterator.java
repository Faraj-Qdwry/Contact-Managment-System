package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.composit.ContactManagementComponent;
import contactmanagementsoftware.contacts.PersonalFriends;


public class PersonalFriendsIterator extends ContactsIterator {

    public PersonalFriendsIterator(ContactManagementComponent items) {
        super(items);
    }

    public PersonalFriends next() {
        return (PersonalFriends) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}
