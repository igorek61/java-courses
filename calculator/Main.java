import java.util.Scanner;

public class Main{
	public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String exit = "no";
        Arifm calc = new Arifm();
        while (!exit.equals("yes"))
        {
            int arg2;
            if (Arifm.result == 0)
            {
                System.out.println("Input first argument");
                Arifm.result = Integer.parseInt(reader.next());
                System.out.println("Input second argument");
                arg2 = Integer.parseInt(reader.next());
            }
            else
            {
                System.out.println("Input argument");
                arg2 = Integer.parseInt(reader.next());
            }
            System.out.println("Choose operator\n1. +\n2. -\n3. *\n4. /");
            switch (Integer.parseInt(reader.next()))
            {
                case 1: calc = new Add(); 
                    break;
                case 2: calc = new Razn();
                    break;
                case 3: calc = new Proizv();
                    break;
                case 4: calc = new Del();     
                    break;
            }
            calc.do_it(Arifm.result, arg2);
            System.out.println("Result:  " + calc.getResult());
            System.out.println("Save result?  yes/no");
            if (reader.next().equals("yes")) continue; else calc.clearResult();
            System.out.println("Exit? yes/no");
            exit=reader.next();
        }
        reader.close();
    }
}