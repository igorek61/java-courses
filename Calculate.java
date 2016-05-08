public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate..");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int sum = first + second;
        long raz=first-second;
        System.out.println("Sum   " + sum);
        System.out.println("Raz   " + raz);
	}
}