/*
Programmer:Ronald Yalung
Date:06/22/2024
This class holds a number of Records.
*/

import java.util.ArrayList;
import java.lang.Math;

//jukebox implements form the JukeInterface class
public class Jukebox implements JukeInterface{
	
		//declaring the arraylist as a part of data in this class
		private ArrayList<Record> _records; //<Record> is a 'generic'
		
		//creating the arraylist with this constructor
		public Jukebox() 
		{
			_records = new ArrayList<Record>();
		}
		
		//inserts a Record at the last position in the jukebox using the .add method
		public void insert(Record aRecord)
		{
			_records.add(aRecord);
		}
		
		//inserts a Record into a specific slot in the jukebox using the .add(index,element) method
		public void insert(int slot, Record aRecord)
		{
			_records.add(slot, aRecord);
		}
		
		// removes a Record from the jukebox using the .remove(object) method.
		public boolean remove(Record aRecord)
		{
				return _records.remove(aRecord);
		}
		
		//returns true if the jukebox contains the Record using .contains(object) method.
		public boolean contains(Record aRecord)
		{	
			return _records.contains(aRecord);
			
		}
		
		//returns the slot that has the Record (-1 if not there) using the .indexOf(object) method.
		public int findSlot(Record aRecord)
		{
			return _records.indexOf(aRecord);
		}

		//returns a Record, chosen at random
		public Record random()
		{
			int record = (int) (Math.random() * _records.size());	
			return _records.get(record);
		}
		
		//returns to string
		public String toString()
		{
			return _records.toString();
		}

}
