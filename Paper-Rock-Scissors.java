import java.util.Scanner;

public class LG3_Q1 {

    public static String machineChoice()
    {

        int number = (int)(Math.random() * 3) + 1;

        if (number == 1)
            return "p";

        else if (number == 2)
            return "r";

        else
            return "s";

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        System.out.println("Choose (p)aper, (r)ock, (s)cissor or (q)uit: ");
        String choice = input.nextLine();

        int score = 0;

        while(!choice.equals("q"))
        {

            String macChoice = machineChoice();

            if(macChoice.equals(choice))
                System.out.printf("It's a tie! Your score is: %d" , score);

            else if(macChoice.equals("p"))
            {
                switch(choice)
                {
                case "r": score--;
                    System.out.printf("The machine chose paper. Paper covers rock. You lose! Your score: %d" , score);
                    break;
                case "s": score++;
                    System.out.printf("The machine chose paper. Scissor cuts paper. You win! Your score: %d" , score);
                }
            }

            else if (macChoice.equals("r"))
            {
                switch(choice)
                {

                case "p": score++;
                    System.out.printf("The machine chooses rock. Paper covers rock. You win! Your score: %d" , score);
                    break;
                case "s": score--;
                    System.out.printf("The machine chooses rock. Rock breaks scissor. You lose! Your score: %d" , score);

                }
            }

            else if(macChoice.equals("s"))
            {
                switch(choice)
                {
                    case "p": score--;
                        System.out.printf("The machine chooses scissor. Scissor cuts paper. You lose! Your score: %d" , score);
                        break;
                    case "r": score++;
                        System.out.printf("The machine chooses scissor. Rock breaks scissor. You win! Your score: %d" , score);
                }
            }

            System.out.println("\nChoose (p)aper, (r)ock, (s)cissor or (q)uit: ");
            choice = input.nextLine();

        }

    }

}