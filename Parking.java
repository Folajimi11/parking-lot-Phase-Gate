import java.util.Scanner;
public class Parking{	
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		char [] array = new char [20];
		for(int row = 0; row < array.length; row++){
				array[row]= '0';
		}
		for(int row = 0; row < array.length; row++){
			System.out.print("Slot " + (row + 1) + ": ");
			System.out.println(array[row] + " ");
		}
			System.out.print("Enter slot: ");
			int rowPrompt = input.nextInt();
			System.out.println();
			
			int rowInput = rowPrompt - 1;
			if(rowInput >= 0 && rowInput < 20){
				array[rowInput] = '1';
			}
		
			System.out.println("UPDATED SLOT");
		for(int row = 0; row < array.length; row++){
			System.out.print("Slot " + (row + 1) + ": ");
			System.out.println(array[row]);
		}
		System.out.println();
		System.out.println("Slot " + rowPrompt + " Reserved");
				
		String menu = """
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
SEMICOLON PARKING LOT
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=

1. Available Space
2. Marked Space
0. Exit

=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
		""";
		while(true){
		System.out.println(menu);
		System.out.println("Select Option: ");
		int usersAnswer = input.nextInt();
		switch(usersAnswer){
			case 1 ->{		
				String title = """
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
	   AVAILABLE SPACE
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
					""";
				System.out.println(title);
				for(int row = 0; row < array.length; row++){
					if(row == rowInput){
						continue;
					}
					else{
						System.out.print("Slot " + (row + 1) + ": ");
						System.out.println(array[row] + "[Available]");
					}
				}
			}
		case 2 ->{
			String title = """
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
	    MARKED SPACE
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
					""";
			System.out.println(title);
			for(int row = 0; row < array.length; row++){
				if(row != rowInput){
					continue;
				}
				else{
					System.out.print("Slot " + (row + 1) + ": ");
					System.out.println(array[row] + "--> [Occupied]");
				}
			}	
		}
	}
	if(usersAnswer == 0){
		break;
	}
	}
	}
}
	
