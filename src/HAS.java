

import java.util.Scanner;

public class HAS {
	public static int deviceNO;
	static Device SelectedDevice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panel P = new Panel();
		openPanel(P);
		System.out.println("Select Your Device");
		Scanner selectedDevice = new Scanner(System.in);
		
		deviceNO = selectedDevice.nextInt();
		if(deviceNO == 100){
			
			return;
		}
		else{
			System.out.println(P.devices.get(deviceNO).DeviceName+" Selected");
			SelectedDevice = P.devices.get(deviceNO); 
			ListOperations(SelectedDevice);
			System.out.println("Select Operation to Perform...");
			Scanner selectedOperation = new Scanner(System.in);
			int option = selectedOperation.nextInt();
			if(option == 100)
				System.exit(0);
			if(option == 99)
				openPanel(P);
			else{
				// button pressed operations
			}
		}
		
	}

	private static void ListOperations(Device device) {
		// TODO Auto-generated method stub
		int i ;
		for(i=0 ;i< device.buttons.size();i++)
			System.out.println(i +". " + device.buttons.get(i).Action);
		System.out.println("99. Return");
		System.out.println("100. Exit");
	}

	private static void openPanel(Panel p) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Opening Panel...");
		for(i = 0; i < p.devices.size(); i++ ){
			System.out.println(i + ". " +p.devices.get(i).DeviceName);
		}
		System.out.println("100. Exit");
	}

}
