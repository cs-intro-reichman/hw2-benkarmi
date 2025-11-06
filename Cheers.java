// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int repeat = Integer.parseInt(args[1]);
                String useAn = "AEFHILMNORSX";

                for (int i = 0; i < word.length(); i++) {
                        char letter = word.charAt(i);
                        String a = "a";
                        if (useAn.indexOf(letter) != -1) {
                        a = "an";
                        }
                        System.out.println("Give me " + a + " " + letter + ": " + letter + "!");
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < repeat; i++) {
                        System.out.print(word + "!!!");
                }

        }
}
