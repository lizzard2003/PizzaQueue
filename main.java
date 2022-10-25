
//driver 
public class main {

	public static void main(String[] args) {
		
		queue q= new queue(); // making a new object
		
		q.enqueue(new Pizza(" pepperoni ", " 1234 Bobcat Trail "));// these work like a push 
		q.enqueue(new Pizza(" sasuage", " 2345 University Drive "));
		q.delivery();
		q.enqueue(new Pizza(" extra cheese ", " 3456 Rickster Road "));
		q.enqueue(new Pizza(" everything ", " 4567 King Court "));
		q.enqueue(new Pizza("coffee beans", " 5678 Java Circle "));
		q.delivery();// this works like a pop off 
		q.delivery();
		q.delivery();
		q.delivery();
		q.delivery();
		q.userInput();
		
		return;
		
	}

}
