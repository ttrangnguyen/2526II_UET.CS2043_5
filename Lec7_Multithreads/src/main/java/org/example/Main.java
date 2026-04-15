package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Execute MusicAppSingleThread
//        System.out.println("Example of single thread execution");
//        MusicAppSingleThread appSingleThread = new MusicAppSingleThread();
//        appSingleThread.playMusic();
//        appSingleThread.downloadSong();
//        System.out.println("--------------------------------");


        //Execute musicplayer and song downloader in different threads
//        System.out.println("Example of multi-thread execution");
//        //Tạo đối tượng musicJob là một job MusicPlayer
//        Runnable musicJob = new MusicPlayer();
//        //Tạo thread thực thi job musicJob
//        Thread musicThread = new Thread(musicJob);
//
//        //Tạo đối tượng downloadJob là một job SongDownloader
//        Runnable downloadJob = new SongDownloader();
//        //Tạo thread thực thi job downloadJob
//        Thread downloadThread = new Thread(downloadJob);
//
//        //Một thread chỉ được chuyển sang trạng thái "runnable" (sẵn sàng để chạy) khi nó được gọi start()
//        //Scheduler chỉ lựa các threads có trạng thái "runnable" để thực thi
//        musicThread.start();
//        downloadThread.start();
//        System.out.println("--------------------------------");


//        System.out.println("Example of synchronized methods");
//        //Tạo đối tượng B kiểu BankAccount với số dư khởi tạo balance = 30 đồng
//        BankAccount B = new BankAccount(30);
//        //Tạo job withdrawTask1 thực hiện việc rút tiền (withdraw) 20 đồng từ BankAccount B
//        WithdrawTask withdrawTask1 = new WithdrawTask(B, 20);
//        //Tạo job withdrawTask2 thực hiện việc rút tiền (withdraw) 20 đồng từ BankAccount B
//        WithdrawTask withdrawTask2 = new WithdrawTask(B, 20);
//
//        //Thread t1 thực hiện job withdrawTask1
//        Thread t1 = new Thread(withdrawTask1);
//        t1.setName("Thread 1");
//
//        //Thread t2 thực hiện job withdrawTask2
//        Thread t2 = new Thread(withdrawTask2);
//        t2.setName("Thread 2");
//
//        //start thread t1 và t2
//        //Vì thread t1 và t2 cùng thực thi việc rút tiền từ BankAccount B
//        //t1 và t2 thực hiện độc lập, do đó t1 không biết đến việc rút tiền diễn ra trong t2
//        //t2 cũng không biết đến việc rút tiền diễn ra trong t1.
//        //Nếu phương thức withdraw của BankAccount không cài đặt synchonized,
//        // việc rút tiền có thể diễn ra cùng lúc trên cả hai threads và dẫn tới số dư bị âm
//        //(xoá từ khoá synchonized trong phương thức withdraw của BankAccount để xem kết quả)
//        t1.start();
//        t2.start();


//        System.out.println("Example of synchronized methods");
//        //Tạo đối tượng B2 kiểu BankAccount với số dư khởi tạo balance = 30 đồng
//        BankAccount B2 = new BankAccount(30);
//        //Tạo job withdrawTask3 thực hiện việc rút tiền (withdraw) 20 đồng từ BankAccount B2
//        WithdrawTask withdrawTask3 = new WithdrawTask(B2, 20);
//        //Tạo job depositTask1 thực hiện việc gửi tiền (deposit) 20 đồng vào BankAccount B2
//        DepositTask depositTask1 = new DepositTask(B2, 20);
//
//        //Thread t3 thực hiện job withdrawTask1
//        Thread t3 = new Thread(withdrawTask3);
//        t3.setName("Thread 3");
//
//        //Thread t2 thực hiện job withdrawTask2
//        Thread t4 = new Thread(depositTask1);
//        t4.setName("Thread 4");
//
//        //start thread t3 và t4
//        //t3 thực hiện việc rút tiền từ tài khoản B2
//        //t4 thực hiện việc gửi tiền vào tài khoản B2
//        //Cả hai phương thức withdraw và deposit đều là phương thức synchronized (xem class BankAccount)
//        //Do đó, khi t3 (hoặc t4) được schedular lựa chọn thực thi nó sẽ giữ khoá của đối tượng B2 cho tới khi thực thi xong phương thức synchronized tương ứng
//        //Mỗi một đối tượng chỉ có 1 khoá, do đó khi t3 đang thực thi withdraw của B2 thì t4 sẽ không thể thực thi (do nó cần khoá của B2 để thực thi deposit)
//        //Hoặc ngược lại, khi t4 đang thực thi thì t3 sẽ phải chờ đến khi t4 xong mới có thể thực thi
//        t3.start();
//        t4.start();


//        System.out.println("Example of ExecutorService");
//        BankAccount B4 = new BankAccount(30);
//        WithdrawTask withdrawTask4 = new WithdrawTask(B4, 20);
//        WithdrawTask withdrawTask5 = new WithdrawTask(B4, 20);
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        executor.submit(withdrawTask4);
//        executor.submit(withdrawTask5);
//        executor.shutdown();



        System.out.println("Example of Callable and Future");
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Calculation mytask = new Calculation(7, 8);
        Future<Integer> result = executor.submit(mytask);
        executor.shutdown();

        System.out.println("The value of calculation:" + result.get() );


    }

}