public class MusicPlayer {
    private boolean isPlaying;
    private int volume;

    public MusicPlayer() {
        this.isPlaying = false;
        this.volume = 50;  // Default volume level
    }

    public void playMusic() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Playing music.");
        } else {
            System.out.println("Music is now playing.");
        }
    }

    public void stopMusic() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Stopping music.");
        } else {
            System.out.println("No music is playing.");
        }
    }

    public void increaseVolume() {
        if (isPlaying) {
            if (volume < 100) {
                volume += 10;
                System.out.println("Raising volume level to: " + volume + ".");
            } else {
                System.out.println("Highest volume level reached.");
            }
        } else {
            System.out.println("You must play a music first!");
        }
    }

    public void decreaseVolume() {
        if (isPlaying) {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Reducing volume level to: " + volume + ".");
            } else {
                System.out.println("Lowest volume level reached.");
            }
        } else {
            System.out.println("You must play a music first!");
        }
    }

    public void showStatus() {
        if (isPlaying) {
            System.out.println("Music is now playing. Current volume level: " + volume);
        } else {
            System.out.println("No music is playing.");
        }
    }
}