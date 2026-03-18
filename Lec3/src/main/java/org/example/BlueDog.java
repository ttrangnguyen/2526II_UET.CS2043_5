package org.example;

//BlueDog là con của Dog,
// BlueDog có các thành phần của lớp Dog và Animal được khai báo khai báo public, protected, và default
public class BlueDog extends Dog{

    public BlueDog(){
        System.out.println("Executing constructor BlueDog()");
    }

    //Khi khởi tạo đối tượng Dog thông qua new BlueDog(String) thì constructor này sẽ được gọi
    //Trước khi thực hiện phần thân của constructor này, constructor của lớp cha (lớp Dog) sẽ được gọi
    //Nếu không gọi constructor của lớp cha một cách tường minh (thông qua super như dòng 15) thì constructor không có tham số của lớp cha sẽ được gọi mặc định
    public BlueDog(String _name){
        super(_name);
        System.out.println("Executing constructor BlueDog(String)");
    }

    @Override
    public void makeNoise() {
        System.out.println("Calling from class BlueDog:");
        //từ lớp con, có thể truy cập tới các phương thức của lớp cha thông qua từ khoá super
        super.makeNoise();
        //Không thể truy cập đến makeNoise của Animal thông qua super.super
        //uncomment dòng 23, chương trình sẽ báo lỗi
        //super.super.makeNoise();
        System.out.println("BlueDog " + name + " is making noise");
    }
}
