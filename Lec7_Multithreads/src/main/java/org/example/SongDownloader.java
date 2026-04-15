package org.example;

class SongDownloader implements Runnable {
    public void downloadSong() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Downloading song... " + (i * 5) + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Downloader interrupted.");
            }
        }
        System.out.println("Download completed.");

    }
    @Override
    public void run() {
        downloadSong();
    }
}
