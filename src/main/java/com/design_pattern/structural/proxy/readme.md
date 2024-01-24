## MỤC ĐÍCH:

Proxy pattern được sử dụng để kiểm soát quyền truy cập vào một đối tượng bằng cách đóng vai trò là class thay thế hoặc class chứa một đối tượng khác và thêm các chức năng khi client access object. Nó thường được sử dụng để thêm chức năng bổ sung như lazy loading, access control, logging, monitoring mà không thay đổi chức năng cốt lõi của đối tượng ban đầu. <br/>
Khác với decorator: proxy pattern có implementation y hệt nhưng khác nhau ở mục đích. Proxy pattern hạn chế client và kiểm soát quyển truy cập vào các chức năng của class. Còn Decorator thì đóng vai trò thêm hoặc thay đổi chức năng của class ở runtime.

-   Decorator informs and empowers its client.
-   Proxy restricts and disempowers its client.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Kiểm soát sự truy cập vào đối tượng.
-   Thêm các chức năng mới mà không cần tạo class con hay thay đổi implemetation.

### HẠN CHẾ:


