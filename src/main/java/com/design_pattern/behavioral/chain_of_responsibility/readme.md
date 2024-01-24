## MỤC ĐÍCH:

Chain of Responsiblity là một thiết kế bao gồm dữ liệu vào và  một chuỗi các đối tượng dùng để xử lý dữ liêu. Mỗi đôi tượng xử lý sẽ bao gồm các logic dùng để xử lý đối tượng đầu vào và truyền tiếp cho các đối tượng xử lý đằng sau trong chuỗi để tiếp tục xử lý.<br/>
Chain of Responsibility Pattern hoạt động như một danh sách liên kết (Linked list) với việc đệ quy duyệt qua các phần tử (recursive traversal).

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Tách rời việc xử lý request và object cần xử lý. Tạo ra sự linh hoạt và dễ sửa đổi ở trong codebase nhờ việc có thể tuỳ ý thêm hoặc xoá các xử lý trong chuỗi mà không sợ làm ảnh hưởng đến các code khác.
-   Có thể thêm hoặc xoá xử lý khi ở trong runtime.
-   Đảm bảo Single responsibility principle nhờ việc mỗi xử lý đều được tách rời và có ý nghĩa riêng.
-   Đảm bảo OCP do có thể dễ dàng thêm các xử lý mới mà không ảnh hưởng đến các xử lý cũ.
### HẠN CHẾ:
-   Khó khăn trong việc debug do tạo ra một sự phức tạp nhất định trong code.
-   Nếu có quá nhiều handler thì code sẽ bị rối.