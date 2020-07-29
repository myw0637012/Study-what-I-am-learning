package exam17;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("-- TV�� �մϴ�. --");
	}

	@Override
	public void turnOff() {
		System.out.println("-- TV�� ���ϴ�. --");
	}

	@Override
	public void setVolume(int i) {
		if (i > RemoteControl.MAX_VOLUME) {
			i = RemoteControl.MAX_VOLUME;
		} else if (i < RemoteControl.MIN_VOLUME){
			i = RemoteControl.MIN_VOLUME;
		} 
		System.out.println("-- Television�� ���� ũ�⸦ " + i + "�� �մϴ�. --");
	}

}
