package COM.YIT;
public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        int result = app.add(2, 3);   // fixed spelling
        System.out.println("2+3=" + result);
        System.out.println("application executed successfully");
    }
}
