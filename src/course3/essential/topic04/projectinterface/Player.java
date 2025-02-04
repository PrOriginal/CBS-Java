package course3.essential.topic04.projectinterface;

public class Player implements Playable, Recodable {


    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    public static void main(String[] args){
        Player p = new Player();
        System.out.println("Testing Playable methods:");
        p.play();
        p.pause();
        p.stop();
        System.out.println("Testing Recodable methods:");
        p.record();
        p.pause();
        p.stop();
    }

}
