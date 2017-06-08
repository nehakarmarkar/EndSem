

public class AudioSystem extends Device {
	public AudioSystem(){
		this.DeviceName = "AudioSystem";
		buttons.add(new Button("VolumnUp"));
		buttons.add(new Button("VolumnDown"));
		buttons.add(new Button("Next"));
		buttons.add(new Button("Previous"));
	}
}
