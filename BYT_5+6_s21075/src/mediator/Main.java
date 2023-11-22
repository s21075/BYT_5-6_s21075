package mediator;

/**
 * mediator pattern uses to identify an object that encapsulates a way of interaction
 * of many objects and promises weak connection between them
 */

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, it is user1");
        admin.sendMessage("Hello. I am an admin");
    }
}
