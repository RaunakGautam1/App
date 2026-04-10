public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.print("Hello ");

            boolean first = true;

            // Enhanced for loop
            for (String name : args) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(name);
                first = false;
            }

        } else {
            System.out.print("Hello World");
        }
    }
}
