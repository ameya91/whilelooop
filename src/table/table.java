package table;

import java.io.DataInputStream;
import java.io.IOException;

public class table {
static int num1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number whose table is required:-");
		DataInputStream dis = new DataInputStream(System.in);
		try {
			num1=Integer.parseInt(dis.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
int i = 1;

		while( i<=10){

			System.out.println(num1 + "X" + i + "=" +(num1*i));
i++;			
			
		}
	
	
	}

}
