public class OverloadedConstructors {
    public static void main(String[] args) {
        Iser user1 = new Iser("Taiwo");
        Iser user2 = new Iser("Patrick", "ps@gmail.com");
        Iser user3 = new Iser();


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
