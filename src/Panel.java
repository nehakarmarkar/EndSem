

import java.util.ArrayList;

public class Panel {
	ArrayList<Device> devices = new ArrayList<Device>();
	public Panel(){
		devices.add(new Light());
		devices.add(new TV());
		devices.add(new AirConditioner());
		devices.add(new Light());
		devices.add(new AudioSystem());
	}
}
