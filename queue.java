import java.util.Scanner;
public class queue {
	Pizza first=null;// the head of the list				
	Pizza last= null;// the tail of the list/end
	
	
	public void enqueue(Pizza made){
		if (first == null) { // testing to see if an object reference is null if it is it will terminate
			first = made;
		}
		else {
			last.next= made;
		}
		last=made;// return the last pizza made
	
	}
	Pizza dequeue(){
		Pizza deliveryneeded=null;
		if (this.first != null) {// this reference refers to the object on which method was invoked
			deliveryneeded=this.first;
			
			this.first =this.first.next;// the keyword this is passing all the made pizzas 
		}
		else {
			this.last=null;
		}
		return deliveryneeded;// returns the deliveries that need to be delivered	
	}
	public void delivery(){// when delivery is called in main it checks to see if there are pizza's on the queue 
		
		Pizza made= dequeue();
		
		if (made==null) {// this is to see if the queue is empty
			System.out.println(" No deliveries pending ");
			return;
		}
		System.out.println("Deliver a pizza with "+ made.ingridiants+ " to "+made.address);// prints address and topings until there is no more 
	
	}
	public void userInput() {// added user input which could be expanded into having exceptions and more
		try (//additions to the list 
		Scanner FromUser = new Scanner(System.in)) {
			System.out.print("Would you like to add another delivery?");
			String yesno = FromUser.next();
			
			if(yesno.equals("yes")) {
				System.out.println("Lets process more orders! ");
			}
			else if (yesno.equals("no")) {
				System.out.print("Thank you, for letting us serve you");
			}
		}
		
		
	}
	 
	

}
