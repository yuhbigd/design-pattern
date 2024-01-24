## MỤC ĐÍCH:

Đóng gói tất cả thông tin cần thiết vào 1 đối tượng để thực hiện hành động hay kích hoạt một sự kiện thực hiện sau đó mà không cần thêm gì thông tin gì cả (single method take no argument). Các thông tin có thể bao gồm tên phương thức, các biến và giá trị cần thiết...hay đơn giản hơn đó là nó cho phép chuyển yêu cầu thành đối tượng độc lập, có thể được sử dụng để tham số hóa các đối tượng với các yêu cầu khác nhau như log, queue (undo/redo), transtraction.<br/>
Các thành phần cần có của Command Pattern: <br/>

-   Command : là một interface hoặc abstract class, chứa một phương thức trừu tượng thực thi (execute) một hành động (operation). Request sẽ được đóng gói dưới dạng Command.
-   ConcreteCommand : là các implementation của Command. Định nghĩa một sự gắn kết giữa một đối tượng Receiver và một hành động. Thực thi execute() bằng việc gọi operation đang hoãn trên Receiver. Mỗi một ConcreteCommand sẽ phục vụ cho một case request riêng.
-   Client : tiếp nhận request từ phía người dùng, đóng gói request thành ConcreteCommand thích hợp và thiết lập receiver của nó.
-   Invoker : tiếp nhận ConcreteCommand từ Client và gọi execute() của ConcreteCommand để thực thi request.
-   Receiver : đây là thành phần thực sự xử lý business logic cho case request. Trong phương thức execute() của ConcreteCommand chúng ta sẽ gọi method thích hợp trong Receiver.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Tạo ra một api chung cho việc xử lý. Invoker(class tiếp nhận request) sẽ có thể tách biêt với Receiver. Giúp cả 2 có thể độc lập phát triển.
-   Cho phép lưu các yêu cầu trong hàng đợi.
-   Đảm bảo Single responsibility principle nhờ việc mỗi xử lý đều được tách rời và có ý nghĩa riêng.
-   Đảm bảo OCP do có thể dễ dàng thêm các xử lý mới mà không ảnh hưởng đến các xử lý cũ.
-   Tạo ra 1 api đơn giản cho các hành động phức tạp.

### HẠN CHẾ:

-   Khó khăn trong việc debug do tạo ra một sự phức tạp nhất định trong code.
