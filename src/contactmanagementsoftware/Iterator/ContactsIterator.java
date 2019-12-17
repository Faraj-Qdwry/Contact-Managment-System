package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.composit.ContactManagementComponent;

import java.util.Iterator;

public abstract class ContactsIterator implements Iterator<ContactManagementComponent> {
    ContactManagementComponent items;
    int position = 0;

    ContactsIterator(ContactManagementComponent items) {
        this.items = items;
    }

    @Override
    public ContactManagementComponent next() {
        ContactManagementComponent item = items.get(position);
        position = position + 1;
        return item;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    public boolean isIndex(int i) {
        return position == i;
    }
}
