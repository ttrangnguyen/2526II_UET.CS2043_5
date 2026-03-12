package org.example;


public class Main {
    public static void main(String[] args) {

        //Tạo một đối tượng Student thông qua constructor không có tham số,
        //các thuộc tính của đối tượng sẽ có giá trị mặc định.
        //s1 không phải là đối tượng, s1 là tham chiếu tới đối tượng
        //Nhưng thông thường chúng ta hay nói nhanh là đối tượng Student s1
        Student s1 = new Student();
        //Thực hiện gán các giá trị cho thuộc tính của đối tượng s1
        s1.setName("Nguyen Van A");
        s1.setID("25001");
        s1.setAge(19);
        System.out.println("S1 Info:");
        System.out.println(s1.getInfo());

        //Tạo đối tượng thông qua Constructor nhận vào 3 tham số
        //các thuộc tính của đối tượng được gán bằng các giá trị được truyền vào
        Student s2 = new Student("Nguyen Van B", "25002", 19);
        System.out.println("S2 Info:");
        System.out.println(s1.getInfo());

        Student s3 = new Student("Nguyen Van A", "25001", 19);
        System.out.println("S3 Info:");
        System.out.println(s3.getInfo());

        //giá trị lưu trên s1 và s3 là tham chiếu đối tượng, không phải là các giá trị thể hiện trạng thái của đối tượng
        //do đó khi so sánh s1 == s3 sẽ trả về false, vì tham chiếu khác nhau
        if(s1 == s3){
            System.out.println("s1 == s3 is true");
        }else{
            System.out.println("we cannot compare the values of two objects by == or != operators");
        }

        //Chúng ta sử dụng phương thức equals đã cài đè trong lớp Student để so sánh
        if(s1.equals(s3)){
            System.out.println("s1 and s3 has the same values");
        }

        Teacher teacher1 = new Teacher();
        //Nếu không có instanceof (dòng 107, class Student), khi truyền đối tượng Teacher vào equals (dòng 46 file này)
        //chương trình vẫn sẽ dịch được (compile)
        //tuy nhiên khi chạy sẽ lỗi, do không thể ép kiểu Teacher về kiểu Student
        if(s1.equals(teacher1)){
            System.out.println("s1 and teacher1 has the same values");
        }

        Student s4 = new Student(s1);
        if(s4.equals(s1)){
            System.out.println("s1 and s4 has the same values");
        }
        if(s1 == s4){
            System.out.println("s1 and s4 are referring to the same object");
        }

        //x và y là các biến địa phương (local variables).
        // Biến địa phương là các biến khai báo bên trong một phương thức.
        //biến địa phương phải được khởi tạo trước khi sử dụng
        //kiểu dữ liệu của x và y là kiểu byte, đây là kiểu nguyên thuỷ (primitive), không phải kiểu đối tượng
        //do đó, giá trị lưu trên vùng nhớ của x và y là giá trị binary của 7 (0000111)
        //chúng ta sử dụng == để so sánh x, y sẽ nhận được kết quả true
        byte x = 7;
        byte y = 7;
        if(x == y){
            System.out.println("x and y has the same values");
        }

        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        //String cũng là kiểu đối tượng do đó chúng ta cũng cần sử dụng equals để so sánh
        //String là lớp được cung cấp bởi thư viện chuẩn của Java, do đó phương thức equals đã được cài đặt sẵn
        if (hello1 == hello2){
            System.out.println("hello1 and hello2 has the same values");
        }

        String hello3 = "Hello";
        String hello4 = "Hello";
        //Trong trường hợp này dấu == trả về true vì hello3 và hello4 được khởi tạo với các giá trị literal
        //khi khởi tạo hello3 như trên JVM sẽ tạo ra một ô nhớ cho "Hello" trong String pool
        //tiếp theo khi khởi tạo hello4, thay vì tạo ra một ô nhớ mới,
        // JVM sẽ tham chiếu hello4 tới ô nhớ có giá trị "Hello" mà nó tạo trước đó trong String pool
        //String pool giúp tối ưu việc lưu trữ và sử dụng vùng nhớ với biến kiểu String
        if (hello3 == hello4){
            System.out.println("hello3 and hello4 has the same values");
        }


    }


}