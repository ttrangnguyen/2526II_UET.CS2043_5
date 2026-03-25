package org.example;

//Pet là một interface
//interface là một cấu trúc dữ liệu của Java (tương đương với class) nhưng không phải là một class
//interface quy định vai trò của các đối tượng
//tất cả các phương thức của interface đều là phương thức abstract (chỉ có khai báo tên hàm, không có thân hàm)

public interface Pet {
    int x  = 10; //các biến khai báo trong interface, mặc định là public static final

    //các phương thức khai báo trong interface, mặc định là public abstract
    void beFriendly();
    void eat();
    void sleep();


}
