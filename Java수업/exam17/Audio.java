package exam17;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("-- Audio�� �մϴ�. --");
	}

	@Override
	public void turnOff() {
		System.out.println("-- Audio�� ���ϴ�. --");
	}

	@Override
	public void setVolume(int i) {
		if (i > RemoteControl.MAX_VOLUME) {
			i = RemoteControl.MAX_VOLUME;
		} else if (i < RemoteControl.MIN_VOLUME) {
			i = RemoteControl.MIN_VOLUME;
		}
		System.out.println("-- Audio�� ���� ũ�⸦ " + i + "�� �մϴ�. --");
	}

}
