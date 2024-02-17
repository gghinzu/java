import java.util.Scanner;

public class LG4_Q2 {
	
	public static final int SIZE = 10;
	
	public static int menu()
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\tMENU\r\n"
				+ "1. Initialize array\r\n"
				+ "2. Input array elements\r\n"
				+ "3. Output array elements\r\n"
				+ "4. Search a value\r\n"
				+ "5. Exit program");
		
		System.out.println("Enter your choice: ");
		int choice=input.nextInt();
		
		while(choice < 1 || choice > 5)
		{
			
			System.out.println("Enter your choice");
			choice=input.nextInt();
			
		}
		
		return choice;
		
	}
	
	public static void initialize(int [] arr)
	{
		
		for(int i=0; i<SIZE; i++)
			arr[i]=0;
				
	}
	
	public static int fillArray(int [] arr)
	{
		
		System.out.println("Enter the elements of the array: ");
		
		Scanner input2 = new Scanner(System.in);
		int input = input2.nextInt();
		int index = 0; 
		
		while(input != 0 && index < SIZE)
		{
			
			arr[index]=input;
			input=input2.nextInt();
			index++;
			
		}
		
		return index;
			
	}
	
	public static void displayArray(int[] arr, int elements)
	{
		
		for(int i=0; i<elements; i++)
			System.out.println("" + arr[i]);
		
	}
	
	public static int findPos(int[] arr, int num)
	{
		
		for(int i=0; i<SIZE; i++)
			if(arr[i]==num)
				return i;
		
			return -1;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		Scanner input1 = new Scanner(System.in);
		int [] arr = new int[SIZE];
		int index=SIZE;
		
		do
		{
			
			choice = menu();
			
			switch(choice)
			{
			
			case 1: initialize(arr);
			System.out.println("All elements are initialized by zero.");
				break;
			case 2: index = fillArray(arr);
				break;
			case 3: displayArray(arr, index);
				break;
			case 4: System.out.println("Enter the value that will be searched: ");
			int num = input1.nextInt();
			int a = findPos(arr, num);
				if(a == -1)
					System.out.println("The array does NOT contain the searched number!");
				else
					System.out.println(""+a);
				
			}
			
		}while(choice != 5);
		
		
	}
	
}