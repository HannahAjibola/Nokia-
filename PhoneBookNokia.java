import java.util.Scanner;
public class PhoneBookNokia{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	String phoneBook = """
	Phone book
	1. Phone book
	2. Messages
	3. Chat
	4. Call Register 
	5. Tone
	6. Setting
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM services""";
	
	System.out.print(phoneBook);
	System.out.println("\nSelect an option:");
	int home = input.nextInt();

	switch(home){
		
		case 1:
			String phoneBookOptions = """
			1. Search
			2. Servic Nos
			3. Add Name
			4. Erase
			5. Edit
			6. Assign Tone
			7. Send b card
			8. Options
			9. Speed dials
			10. Voice Tags
			""";
			
			System.out.println(phoneBookOptions);

			System.out.println("Enter choice: ");
			int phoneBookOption = input.nextInt();

			switch(phoneBookOption){
				case 1: 
					System.out.println("Search");
					break;
				case 2: 
					System.out.println("search");
					break;
		
				case 3:
					System.out.println("search");
					break;

				case 4:
					System.out.println("search");
					break;
				case 5: 
					
					System.out.println("search");
					break;
				case 6: 
					
					System.out.println("search");
					break;
				case 7:
					
					System.out.println("search");
					break;

				case 8: 
					String options = """
					1. Type of view
					2. Memory status
					""";
					System.out.print(options);
					break;
				case 9: 
					
					System.out.println("search");
					break;

				case 10:
					
					System.out.println("search");
					break;



			}
			break;

		case 2:
			
			String Message = """
			1. Write messages
			2. Inbox
			3. Outbox
			4. Picture messages
			5. Templates
			6. Smileys
			7. messageSetting
			8. Info Services
			9. Coice mailbox number
			10. Service command editor
			""";
			
			System.out.println(Message);

			System.out.println("Enter Choice:");
			int messageOption = input.nextInt();

			switch(messageOption){
				case 1: 
					System.out.println("Search");
					break;
				case 2: 
					System.out.println("search");
					break;
		
				case 3:
					System.out.println("search");
					break;

				case 4:
					System.out.println("search");
					break;
				case 5: 
					
					System.out.println("search");
					break;
				case 6:
					System.out.println("search");
					break;
				case 7: 
					String messageSetting = """
					1.Set 1		
						1. Message centre number
						2. Message sent as
						3. Message validity
					2. Common
						1. Delivery reports
						2. Reply via same centre
						3. Character support
						""";
						System.out.print(messageSetting);
						break;
				case 8: 
					System.out.println("search");
					break;
		
				case 9:
					System.out.println("search");
					break;

				case 10:
					System.out.println("search");
					break;
	
		}
		break;
	case 3:

		String Chats = """
			1.chat
		""";
		System.out.println(Chats);

		System.out.println("Enter option:");
		int chatOption = input.nextInt();

		switch(chatOption){
			case 1:
				System.out.println("Searching...");
				break;


		}
		break;
		
	}



	
	}

}
