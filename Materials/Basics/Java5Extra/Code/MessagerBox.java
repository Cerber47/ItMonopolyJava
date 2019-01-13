import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;


public class MessagerBox {

	static Set<User> usersSet = new Set<User>;  

	static Scanner input = new Scanner(System.in);

	static HashMap<String, String> authTable = new HashMap<String, String>(); 

	public static void main(String[] args) {
		String login;
		String password;
		int option;
		while(true) {
			System.out.println("Type 1 to login and 2 to register");
			option = input.nextInt();
			if (option == 1) {
				System.out.print("login:");
				login = input.next();
				System.out.print("pass:");
				password = input.next();
				if (authTable.containsKey(login)) {
					if (authTable.get(login) == password) {
						User currentUser
						while(true) {
							if (currentUser.messages.messagesContainer.size() == 0) {
								System.out.println("No messages");
							} else {
								for(Message m: user.messages.messagesContainer) {
									System.out.println(m.getMessagetext);
								}
							}
							System.out.println("Type new for sending new message");
							String choice = input.next();
							if (choice.equals("new")) {
								System.out.print("To:");
								String toUser = input.next();
								System.out.print("Text:");
								String text = input.next();
								String date = "today";
								for(User usr: usersSet) {
									if (usr.name == toUser){
										usr.messages.addMessage(new Message(toUser, date, text));
										break;
									}
								}
							}
							if (choice.equals("logout")) {
								break;
							}
							System.out.println("type logout to logout");
						}
					}
				}
			}
			if (option == 2) {
				System.out.print("Enter new login:");
				String lgn = input.next();
				System.out.print("Enter new pass:");
				String psw = input.next();

				authTable.put(lgn, psw);
				usersSet.add(new User(lgn));
			}
		}
	}
}

class User {
	String name;
	Box messages;

	User(name) {
		this.name = name;
		messages = Box();
	}
}

class Box {
	ArrayList<Message> messagesContainer;

	Box() {
		messagesContainer = new ArrayList<Message>;
	}

	public void addMessage(Message msg) {
		messagesContainer.add(msg);
	}

	public String getMessage(int n) {
		msg = messagesContainer.get(n);
		String messageString = "\t-------\t";
		messageString += "\t" + msg.sender + "\t" + msg.date + "\n";
		messageString += "\t---\n";
		messageString += msg.text + "\n";
		messageString += "\t-------\t";
		return messageString;
	}
}

class Message {
	String text;
	String date;
	String sender;

	Message(sender,date,text) {
		this.text = text;
		this.date = date;
		this.sender = sender;
	}

	public String getMessageText() {
		String messageString = "\t-------\t";
		messageString += "\t" + sender + "\t" + date + "\n";
		messageString += "\t---\n";
		messageString += text + "\n";
		messageString += "\t-------\t";
		return messageString;
	}
}