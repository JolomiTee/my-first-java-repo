public class Iser {
    String username;
    String email;
    int age;

    Iser () {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    Iser (String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 1;
    }

    Iser (String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 1;
    }
}
