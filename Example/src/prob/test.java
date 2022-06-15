package prob;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	//5 24
	//4 9 8 5 6
	
	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter no.of.item need and Amount you have:");
		String itemsWantAndAmountHave = inputNumber.nextLine();
		System.out.println("Input 1:" + itemsWantAndAmountHave);
		String itemsPrices = inputNumber.nextLine();
		System.out.println("Input 2:" + itemsPrices);
		inputNumber.close();
		String[] i1Data = itemsWantAndAmountHave.split(" ");
		int itemsNeed = Integer.valueOf(i1Data[0]);
		int totalAmount = Integer.valueOf(i1Data[1]);
		String[] itemsAmt = itemsPrices.split(" ");
		int minItem = 0;
		int maxItem = 0;
		int amount = 0;
		int item = 0;
		int[] itemsAmtInInt = new int[itemsAmt.length];
		for(int i = 0; i<itemsAmt.length;i++) {
			itemsAmtInInt[i] = Integer.valueOf(itemsAmt[i]);
		}
		Arrays.sort(itemsAmtInInt);
		for(int i = 0; i<itemsNeed;i++) {
			item = i+1;
			int prices = itemsAmtInInt[i];
			amount = amount + prices;	
			if(amount >= totalAmount && i!=0) {
				item = item - 1;
				break;
			}
		}
		System.out.println("Items Buyed: " + item);
		
	}

}
