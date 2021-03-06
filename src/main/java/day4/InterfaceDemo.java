package day4;
interface MusicPlayer{
    int maxSoundLevel = 200;
    void play();
    void pause();
}
interface Radio{
    void scanChannels();
}

interface AdvancedRadio extends Radio{
    void addSoundMixer();
}
abstract class MediaDevice {
    abstract void on();
}
class Mobile extends MediaDevice implements MusicPlayer,AdvancedRadio{

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    void on() {

    }

    @Override
    public void scanChannels() {

    }

    @Override
    public void addSoundMixer() {

    }
}
public class InterfaceDemo {
    Mobile m = new Mobile();

}
