package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.acquaintances.Acquaintances;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AcquaintancesIterator implements Iterator<Acquaintances> {
    ArrayList<Acquaintances> items;
    int position = 0;

    AcquaintancesIterator(ArrayList<Acquaintances> items) {
        this.items = items;
    }

    @Override
    public Acquaintances next() {
        Acquaintances item = items.get(position);
        position = position + 1;
        return item;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    public boolean isIndex(int i){
        return position == i;
    }
}
