public class Main {
    public static void main(String[] args) {

        SujetNotification sujetNotification = new SujetNotification();
        SujetNotification sujetNotification2 = new SujetNotification();
        User user1 = new User();
        User user2 = new User();

        sujetNotification.ajouterAbonne(user1);
        sujetNotification2.ajouterAbonne(user2);

        sujetNotification.setNotifications("Salut les loulou");
        sujetNotification2.setNotifications("C'est pas faux");

        System.out.println(user1.getNotifications());
        System.out.println(user2.getNotifications());

        sujetNotification.setNotifications("Pouet pouet");

        System.out.println(user1.getNotifications());
        System.out.println(user2.getNotifications());

    }
}