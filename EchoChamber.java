
public class EchoChamber {
	private String soundReceived;
	
	// constructor
	public EchoChamber(String sound) {
		this.soundReceived = sound;
	}
	
	// send back the echo
	public String sendBackSound() {
		System.out.println(soundReceived);
		return soundReceived;
	}
}
