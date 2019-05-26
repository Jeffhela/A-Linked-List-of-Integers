// ***************************************************************
// FILE: IntList.java
//
// Purpose: Defines a class that represents a list of integers
//
// ***************************************************************
public class IntList
{
	private IntNode front; //first node in list

	//-----------------------------------------
	// Constructor. Initially list is empty.
	//-----------------------------------------
	public IntList()
	{
		front = null;
	}

	//-----------------------------------------
	// Adds given integer to front of list.
	//-----------------------------------------
	public void addToFront(int val)
	{
		front = new IntNode(val,front);
	}

	//-----------------------------------------
	// Adds given integer to end of list.
	//-----------------------------------------
	public void addToEnd(int val)
	{
		IntNode newnode = new IntNode(val,null);

		//if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;
		else
		{
			//make temp point to last thing in list
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			//link new node into list
			temp.next = newnode;
		}
	}

	//-----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	//-----------------------------------------
	public void removeFirst()
	{
		if (front != null)
			front = front.next;
	}

	//-----------------------------------------
	// Removes last node 
	//-----------------------------------------
	public void removeLast()
	{

		//if list is empty, nothing will be removed
		if (front == null)
			return;
		else if( front.next == null) // one item, which is the front
			front =null;
		else
		{
			//make temp point to next to last thing in list (second one from the tail/back
			IntNode temp = front;
			while (temp.next.next != null) // study:temp.next.next
				temp = temp.next;
			//set next position of temp to null, which kills the last node
			temp.next = null;
		}
	}

	//------------------------------------------------
	// Prints the list elements from first to last.
	//------------------------------------------------
	public void print()
	{
		System.out.println("--------------------");
		System.out.print("List elements: ");

		IntNode temp = front;

		while (temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println("\n-----------------------\n");
	}

	//------------------------------------------------
	// Count the list elements from first to last.
	//------------------------------------------------
	public int length()
	{
		//create a counter variable
		int count = 0;

		IntNode temp = front;

		while (temp != null)
		{
			count++; //count = count + 1
			temp = temp.next;
		}

		return count;
	}

	//------------------------------------------------
	// Count the list elements from first to last.
	//------------------------------------------------
	public void replace(int oldVal, int newVal)
	{
		
		IntNode temp = front;

		while (temp != null)
		{
			if(temp.val == oldVal)
				temp.val = newVal;
			
			temp = temp.next;
		}

	}



	//*************************************************************
	// An inner class that represents a node in the integer list.
	// The public variables are accessed by the IntList class.
	//*************************************************************
	private class IntNode
	{
		public int val; //value stored in node
		public IntNode next; //link to next node in list

		//------------------------------------------------------------------
		// Constructor; sets up the node given a value and IntNode reference
		//------------------------------------------------------------------
		public IntNode(int val, IntNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
}
