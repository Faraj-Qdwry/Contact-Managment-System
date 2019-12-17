package contactmanagementsoftware.Iterator;
import contactmanagementsoftware.acquaintances.ProfessionalFriends;
import contactmanagementsoftware.strategies.descriptrion_stratigies.ProfessionalFriendsDescriptionBehaviour;

import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ProfessionalFriendsIterator implements Iterator {

	ArrayList<ProfessionalFriends> items;
	int position = 0;
 
	public ProfessionalFriendsIterator(ArrayList<ProfessionalFriends> items) {
		this.items = items;
	}
 
	public ProfessionalFriends next() {
		ProfessionalFriends item = items.get(position);
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
