import java.util.UUID;

public class UuidGenerator {

    public static void main(String[] args) {
        int n = 0;
        int limit = 1;
        if (args.length == 0) {
            System.out.println(UUID.randomUUID().toString().toUpperCase());
        }
        else if(args.length > 0) {
            try {
                limit = Integer.parseInt(args[0]);
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            }
            do {
		if (args.length > 1) {
		    if (args[1].equals("shopware")) {
			String uuid = UUID.randomUUID().toString();
			uuid = uuid.replace("-", "");
			System.out.println(uuid.toUpperCase());
			++n;
		    }
		} else {
		    System.out.println(UUID.randomUUID().toString().toUpperCase());
                    ++n;
		}
            } while (n < limit);
        } else {
            System.out.println("Invalid usage!\n\nExamples: \nuuid\nuuid 4");
        }
    }
}
