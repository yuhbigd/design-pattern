## MỤC ĐÍCH:

Giúp tối ưu memory cần dùng cho việc lưu trữ đối tượng nhờ vào việc chia sẻ các thuộc tính chung của các đối tượng có thuộc tính giống như nhau nhờ đó giảm việc lưu trữ các thuộc tính giống nhau. <br/>
Thường được sử dụng khi ứng dụng tạo một lượng rất lớn các object có nhiều thuộc tính như nhau. <br/>
-   Chia các thuộc tính trong class thành 2 phần
-   -   intrinsic state: các thuộc tính không thay đổi và lặp lại nhiều lần giữa các đối tượng.
-   -   extrinsic state: các thuộc tính độc lập và riêng cho từng đối tượng.
-   Để lại các trường đại diện cho intrinsic state trong class nhưng hãy đảm bảo chúng không thể thay đổi. Chúng chỉ nên lấy các giá trị ban đầu bên trong constructor.
-   Thường được sử dụng với factory pattern và singleton để tạo các intrinsic state.
## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:
-   Tối ưu memory cần dùng.
### HẠN CHẾ:
-   Codebase trở nên rất phức tạp và rối rắm
<br/>
<br/>
-> Chỉ nên dùng khi thật sự cần thiết.