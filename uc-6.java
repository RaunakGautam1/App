public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {

            String result = "Hello ";

            // Add all names with comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", " using substring
            result = result.substring(0, result.length() - 2);

            System.out.println(result);

        } else {
            System.out.println("Hello World");
        }
    }
}
