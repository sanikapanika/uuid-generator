import java.util.UUID;

public class UuidGenerator {

    public static void main(String[] args) {
        int n = 0;
        int limit = 1;
        if (args.length == 0) {
            System.out.println(UUID.randomUUID().toString());
        }
        else if(args.length == 1) {
            try {
                limit = Integer.parseInt(args[0]);
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            }
            do {
                System.out.println(UUID.randomUUID().toString());
                ++n;
            } while (n < limit);
        } else {
            System.out.println("Invalid usage!\n\nExamples: \nuuid\nuuid 4");
        }
    }
}