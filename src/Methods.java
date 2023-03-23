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

//Notes for me

//czy użytkownik używa dwa razy tej samej figury, jeśli tak, załóż, że nie weźmie jej trzeci raz, jeśli znowu ją weźmie, załóż to ponownie
//zapamiętaj ile razy średnio powtarza jedną figurę i następnym razem załóż, że gdy znowu będzie powtarzać figurę, to powtórzy ją podobną ilość razy
//jeśli użytkownik to zauważy, załóż z powrotem, że po powtórzeniu figury weźmie inną

//jeśli powtarza swoją figurę po zwycięstwie, uznaj, że znowu to zrobi przy innej figurze i wybierz figurę wygrywającą lub tą samą zależnie od ryzyka

//czy zmienia figury według schematu rock, paper, scissors lub odwrotnego? jeśli tak, zrób na odwrót dopóki użytkownik tego nie zauważy
//czy zmienia figury wedlug odwrotnego schematu, jeśli tak, powtórz jego ruch dopóki użytkownik tego nie zauważy
//jeśli użytkownik to zauważy i wykorzysta, nie daj mu się podpuścić przez losową liczbę powtórzeń jego schematu od 1 do 3

//czy stosuje schemat zmiany figur zależnie od swojej ostatniej figury lub figury komputera