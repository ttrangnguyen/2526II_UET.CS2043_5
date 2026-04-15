package org.example;

public class MusicAppSingleThread {
    public void playMusic() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Playing music... second " + i);
        }
        System.out.println("Music finished.");
    }

    public void downloadSong() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Downloading song... " + (i * 5) + "%");
        }
        System.out.println("Download completed.");
    }
}
