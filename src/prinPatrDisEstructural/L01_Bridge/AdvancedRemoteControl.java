package prinPatrDisEstructural.L01_Bridge;

public class AdvancedRemoteControl extends RemoteControl
{
    public AdvancedRemoteControl(Device device)
    {
        super(device);
    }

    public void mute() {
        this.getDevice().setVolume(0);
    }
}
