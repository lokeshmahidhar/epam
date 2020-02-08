import java.util.Scanner;
 class Gift {

	int chocolates = 0, sweets = 0;	
	int choc_w = 0, sweet_w = 0;	
}
class Chocolate extends Gift {
	public int[] choc;
	public int[] sweet;

		public void chocolate_sort(int chocolates) {
			int temp = 0;
			for(int i = 0; i < chocolates-1; i++) {
				for(int j = i+1; j < chocolates; j++) {
					if (choc[i] < choc[j]) {
						temp = choc[j];
						choc[j] = choc[i];
						choc[i] = temp;
					}
				}
			}
		}
		
		public void sweet_sort(int sweets) {
			int temp = 0;
			for(int i = 0; i < sweets-1; i++) {
				for(int j = i+1; j < sweets; j++) {
					if (sweet[i] < sweet[j]) {
						temp = sweet[j];
						sweet[j] = sweet[i];
						sweet[i] = temp;
					}
				}
			}
		}
	}
	public class NewYear {

		@SuppressWarnings("unused")
		private static int option;
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			Chocolate ch = new Chocolate();
			Scanner scan = new Scanner(System.in);
			option = 0;
			do
			{
			System.out.print("\n\t Enter 1. Chocolate, 2.Sweets :- ");
			int num = scan.nextInt();
			
			switch(num) {
				case 1 : System.out.print("\n\t\t chocolates you want to add : ");
						ch.chocolates = scan.nextInt();
						ch.choc = new int[ch.chocolates];
						System.out.print("weights chocolates : ");
						for(int i = 0; i < ch.chocolates; i++) {
							ch.choc_w = scan.nextInt();
							ch.choc[i] = ch.choc_w;
						}
						break;
				case 2: System.out.print("\n\t\t sweets you want to add : ");
						ch.sweets = scan.nextInt();
						ch.sweet = new int[ch.sweets];
						System.out.print("weights of each sweets : ");
						for(int i = 0; i < ch.sweets; i++) {
							ch.sweet_w = scan.nextInt();
							ch.sweet[i] = ch.sweet_w;
						}
						break;
			}
			System.out.print("\n\t\t continue(1) or not(0) : ");
			option = scan.nextInt();
			
		} while (option == 1);
		
			ch.chocolate_sort(ch.chocolates);
			
			ch.sweet_sort(ch.sweets);
			System.out.println("chocolates are : ");
			for (int i = 0; i < ch.chocolates; i++) {
				System.out.println(ch.choc[i]);
			}
			System.out.println("sweets are : ");
			for (int i = 0; i < ch.sweets; i++) {
				System.out.println(ch.sweet[i]);
			}
		}
}










