package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.contacts.Relatives;

import contactmanagementsoftware.composit.ContactManagementComponent;

public class RelativesIterator extends ContactsIterator {

    public RelativesIterator(ContactManagementComponent items) {
        super(items);
    }

    public Relatives next() {
        return (Relatives) super.next();
    }

    public boolean hasNext() {
        return super.hasNext();
    }
}