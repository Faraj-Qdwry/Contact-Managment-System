package contactmanagementsoftware.Iterator;
import contactmanagementsoftware.acquaintances.Relatives;
import contactmanagementsoftware.strategies.descriptrion_stratigies.RelativesDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class RelativesIterator implements Iterator {
	ArrayList<Relatives> items;
	int position = 0;
 
	public RelativesIterator(ArrayList<Relatives> items) {
		this.items = items;
	}
 
	public Relatives next() {
		Relatives item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} 
		else {
			return true;
		}
	
    }
}
