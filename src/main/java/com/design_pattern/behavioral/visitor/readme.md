## MỤC ĐÍCH:

Visitor pattern giúp thêm hành vi vào các đối tượng mà không cần phải thay đổi code bên trong đối tượng đó. Nhờ vào việc chúng ta sẽ đưa hành vi đó vào class Visitor và để cho đối tượng lựa chọn hành vi nào sẽ được thực hiện. Điều này giúp tuân thủ OCP vì chúng ta chỉ thêm mới các hàm (implement interface mới) chứ không thay đổi các method của đối tượng. Ngoài ra giúp tăng tính linh hoạt, bất kì các hành vi mới được thực hiện trong visitor mới thì đều không cần thay đổi code trong các class cũ do class cũ chỉ dùng reference của interface của Visitor để thực hiện hành vi.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Separation of Concerns: tách implement của hành vi khỏi class mà chúng sẽ hoạt động. Giúp thêm mới và sửa đổi hành vi mà không bị vi phạm OCP.
-   Double Dispatch: đảm bảo rằng method được gọi sẽ được quy định bởi kiểu của class cụ thể do đó tránh được lỗi early binding gây ra hành vi sai.

### HẠN CHẾ:

-   Tăng độ phức tạp. Chỉ nên sử dụng với các class phức tạp và không liên quan đến nhau nhiều.
-   Vi phạm encapsulation do việc sử dụng các internal state(qua getter method) để thực hiện hành vi của Visitor, điều này vi phạm việc các hành vi xử lý và kết hợp giữa các internal state nên được thực hiện trong class(Bundling data and operations together).
