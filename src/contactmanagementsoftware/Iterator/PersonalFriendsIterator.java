package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.acquaintances.Acquaintances;
import contactmanagementsoftware.acquaintances.PersonalFriends;

import java.util.ArrayList;

public class PersonalFriendsIterator extends AcquaintancesIterator {

    public PersonalFriendsIterator(ArrayList<Acquaintances> items) {
        super(items);
    }

    public PersonalFriends next() {
        return (PersonalFriends) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}
