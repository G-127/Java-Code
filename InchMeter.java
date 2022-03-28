// Write a java program to convert inch into meter
import java.util.Scanner;
public class InchMeter {
	
	public static void main(String[] args) {
		//TODO Auto-generated Method stub
		int i=0;
		//for(i=0;i<5;i++)
		do
		{
			System.out.println("Enter the no.");
			Scanner sd= new Scanner(System.in);
			 float inch =sd.nextFloat();
			 double meter = inch*0.0254;
			 System.out.println("Meter = " +meter);
			 i++;
		}
		while(i<3);
	}
}