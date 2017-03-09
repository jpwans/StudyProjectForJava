package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by jiangqin on 17/3/9.
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{
    private String title = "Sqt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
