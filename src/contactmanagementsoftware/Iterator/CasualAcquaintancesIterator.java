package contactmanagementsoftware.Iterator;

import contactmanagementsoftware.acquaintances.CasualAcquaintances;
import contactmanagementsoftware.strategies.descriptrion_stratigies.CasualAcquaintancesDescriptionBehaviour;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class CasualAcquaintancesIterator implements Iterator {
	ArrayList<CasualAcquaintances> items;
	int position = 0;
 
	public CasualAcquaintancesIterator(ArrayList<CasualAcquaintances> items) {
		this.items = items;
	}
 
	public CasualAcquaintances next() {
		CasualAcquaintances item = items.get(position);
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
