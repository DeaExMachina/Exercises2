public class PingPong {
    public static void main(String[] args) {

        int variable = 15;

        while (variable < 100) {
            if (variable %6 == 0) {
                System.out.println("Ping Pong");
            }
            else if (variable %3 == 0) {
                System.out.println("Pong");
            }
            else if (variable %2 == 0) {
                System.out.println("Ping");
            }
            else {
                System.out.println("-");
            }
            variable++;
        }
        System.out.println("New column starts here!");

        for (int variable2 = 1; variable2 < 100; variable2++) {
            if (variable2 %6 == 0) {
                System.out.println("Ping Pong");
            }
            else if (variable2 %3 == 0) {
                System.out.println("Pong");
            }
            else if (variable2 %2 == 0) {
                System.out.println("Ping");
            }
            else {
                System.out.println("-");
            }
        }

    }
}

