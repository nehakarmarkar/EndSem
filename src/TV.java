

public class TV extends Device {
	public TV(){
		this.DeviceName = "TV";
		buttons.add(new Button("Power"));
		buttons.add(new Button("ChannelUp"));
		buttons.add(new Button("ChannelDown"));
		buttons.add(new Button("VolumnUp"));
		buttons.add(new Button("VolumnDown"));
	}
}
