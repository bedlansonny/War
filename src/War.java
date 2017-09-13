import java.io.*;
import java.util.*;

public class War
{
    public static void main(String args[]) throws IOException
    {
        File file = new File(System.getProperty("user.dir") + "\\src\\input.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNext())
        {
            //fill up player 1 hand
            for(int i = 0; i < 26; i++)
            {
                char card = sc.next().charAt(0);
                int cardNum = 0;
                switch(card)
                {
                    case 'T':
                        cardNum = 10;
                        break;
                    case 'J':
                        cardNum = 11;
                        break;
                    case 'Q':
                        cardNum = 12;
                        break;
                    case 'K':
                        cardNum = 13;
                        break;
                    default:
                        cardNum = card - 48;
                }
            }

            
            //fill up player 2 hand

            //print gameOutcome
        }
    }

    public static String gameOutcome(RingBuffer hand1, RingBuffer hand2)
    {
        return "";
    }
}
