public class Methods {

    public static boolean didPlayerWin(String userChoice, String computerChoice) {
        if (userChoice.equals("rock")) {
            return computerChoice.equals("scissors");
        }
        else if (userChoice.equals("paper")) {
            return computerChoice.equals("rock");
        } else {
            return computerChoice.equals("paper");
        }
    }

    //all move prediction methods will go here
}
