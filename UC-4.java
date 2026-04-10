public class HelloApp {
    public static void main(String[] args) {

        String message;

        // If names are provided
        if (args.length > 0) {
            message = "Hello " + String.join(", ", args);
        } else {
            // Default case
            message = "Hello World";
        }

        System.out.println(message);
    }
}
