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

		
	case 4:
		String callRegister = """
			1. Misseed call
			2. Recieved calls 
			3. Dailed numbers 
			4. Erase recent call list
			5. Show call duration
			6. Show call cost
			7. Call cost setting
			8. prepaid credit
			""";
		System.out.print(callRegister);	

		System.out.println("Enter option:");
		int callOption = input.nextInt();

		switch(callOption){
			case 1:
				System.out.println("Searching...");
				break;
			case 2: 
				System.out.println("Searching...");
				break;
			case 3:
				System.out.println("Searching...");
				break;
			case 4:
				System.out.println("Searching...");
				break;
			case 5: 
				String showCallDuration = """
							1. Last call duration
							2. All calls duration
							3. Recieved calls duration
							4. Dialled calls duration
							5. Clear timers""";
					System.out.println(showCallDuration);
					break;
			case 6: 
				String showCallCost = """
							1. Last call cost
							2. All calls cost
							3. Clear timers
							""";
					System.out.println(showCallCost);
					break;
			case 7: 
				String callCostSetting = """
							1. Call cost limit
							2. Show cost in""";
					System.out.println(callCostSetting);
					break;
			case 8:
				System.out.println("Searching...");

		}break;

	case 5:
		String tones = """
				1. Ringing tone
				2. Ringing volume
				3. Incoming alert
				4. Composer
				5. Message alert tone
				6. Keypad tones 
				7. Warning and game tones
				8. Vibrating alert
				9. Screen saver""";
			System.out.println(tones);

		System.out.println("Enter option:");
		int toneOption = input.nextInt();

		switch(toneOption){
			case 1: 
				System.out.println("Searching...");
				break;
			case 2: 
				System.out.println("Searching...");
				break;

			case 3: 
				System.out.println("Searching...");
				break;

			case 4: 
				System.out.println("Searching...");
				break;

			case 5: 
				System.out.println("Searching...");
				break;

			case 6: 
				System.out.println("Searching...");
				break;

			case 7: 
				System.out.println("Searching...");
				break;

			case 8: 
				System.out.println("Searching...");
				break;

			case 9: 
				System.out.println("Searching...");
				break;		

		}break;
	case 6:
		String setting = """
				1. Call setting 
				2. Phone setting
				3. Security setting
				4. Restore factory setting""";
			System.out.println(setting);
			
			System.out.print("Enter option:");
			int settingOption = input.nextInt();
			
		switch(settingOption){
			case 1: 
				String callSetting = """
							1. Automatic redial
							2. Speed dialling 
							3. Call waiting options 
							4. Own number sending 
							5. Phone line in use 
							6. Automatic answer
							""";
					System.out.print(callSetting);
					break;

			case 2:
				String phonesetting = """
							1. Language 
							2. Cell info display
							3. Welcome note 
							4. Network selection
							5. Lights
							6. Confirm SIM service actions
							""";
					System.out.println(phonesetting);
					break;		
			case 3: 
				String securitySetting = """
							1. PIN code request
							2. Call barring service
							3. Fixed dialing 
							4. Closed user group
							5. Phone security
							6. Change access codes""";
						System.out.println(securitySetting);
						break;

			case 4: 
				System.out.println("Searching");
				break;
						

		}break;
		

	case 7:
		String callDivert = """
					1. call divert
					""";
			System.out.println(callDivert);
			
			System.out.println("Enter option:"); 
			int divertOption = input.nextInt();
		switch(divertOption){
			case 1:
				System.out.println("searching...");
				break;

		}break;

	case 8:
		String games = """
				1. Games
					""";
			System.out.println(games);
			
			System.out.println("Enter option:"); 
			int gameOption = input.nextInt();
		switch(gameOption){
			case 1:
				System.out.println("searching...");
				break;

		}break;
	case 9:
		String calculator = """
					1. Calculator
					""";
			System.out.println(calculator);
			
			System.out.println("Enter option:"); 
			int calOption = input.nextInt();
		switch(calOption){
			case 1:
				System.out.println("searching...");
				break;

		}break;
	case 10:
		String reminder = """
					1. Reminder
					""";
			System.out.println(reminder);
			
			System.out.println("Enter option:"); 
			int reminderOption = input.nextInt();
		switch(reminderOption){
			case 1:
				System.out.println("searching...");
				break;

		}break;

	case 11:
		String clock = """
					1. Clock
					""";
			System.out.println(clock);
			
			System.out.println("Enter option:"); 
			int clockOption = input.nextInt();
		switch(clockOption){
			case 1:
				String clocks = """
						1. Alarm clock
						2. Clock setting
						3. Date setting
						4. Stopwatch 
						5. Countdown timer 
						6. Auto update of date and time
						"""; 
				
		}break;
	case 12:
		String profile= """
				1. Profiles
					""";
			System.out.println(profile);
			
			System.out.println("Enter option:"); 
			int profileOption = input.nextInt();
		switch(profileOption){
			case 1:
				System.out.println("searching...");
				break;

		}break;
	case 13:
		
		String simService = """
					1. SIM service
					""";
			System.out.println(simService);
			
			System.out.println("Enter option:"); 
			int simOption = input.nextInt();
		switch(simOption){
			case 1:
				System.out.println("searching...");
				break;

		}break;


		
	}



	
	}

}
