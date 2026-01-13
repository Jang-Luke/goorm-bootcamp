package commons;

public class Commons {
    public static void printTitle(String title) {
        System.out.printf("########### %s ###########%n", title);
    }
    
    public static void printSubtitle(String title) {
        System.out.printf("==== %s ====%n", title);
    }
    
    public static void printDelimiter() {
        System.out.println();
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();
        System.out.println();
    }
    
    public static void printSubject(Runnable function) {
        function.run();
        printDelimiter();
    }
}
