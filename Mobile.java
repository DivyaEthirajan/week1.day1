package week1.day1;

public class Mobile {
	public void sendMsg() {
		System.out.println("the message is sent");
	}

	private void makeCall() {
		System.out.println("your sim is activated to make calls ");
	}
	
	void saveContact(){
		System.out.println("contact is saved");
		
	}
	public static void main(String[] args) {

Mobile mob = new Mobile();
mob.makeCall();
mob.saveContact();
mob.sendMsg();
	}

}
