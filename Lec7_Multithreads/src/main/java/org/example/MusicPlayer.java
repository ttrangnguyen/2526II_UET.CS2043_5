package org.example;

class MusicPlayer implements Runnable {
    public int playMusic() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Playing music... second " + i);
            //Khi thread đang thực thi một job và gặp lệnh sleep
            //thread đó sẽ tạm dừng thực thi trong một khoảng thời gian (ví dụ trong code này là 1000 miliseconds)
            //khi thread đang sleep, nó sẽ không thể được lựa chọn để thực thi
            //khi kết thời gian sleep, thread sẽ tự động trở về trạng thái "runnable"
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Music player interrupted.");
            }
        }
        System.out.println("Music finished.");
        return 1;
    }
    @Override
    public void run() {
       int x = playMusic();
    }
}