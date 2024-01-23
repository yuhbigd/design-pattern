## MỤC ĐÍCH:

Cho phép hành vi được thêm vào một đối tượng cụ thể mà không cần phải thay đổi class implementation hoặc toạ class con cũng như không ảnh hưởng đến các đối tượng cùng kiểu trong hệ thống. <br/>
Decorator pattern có thể được xem như là một phiên bản đơn giản của composite pattern. Tuy nhiên, 2 pattern này giải quyết 2 vấn đề hoàn toàn khác nhau. Decorator pattern có nhiệm vụ thêm hoặc thay đổi hành vi của đối tượng lúc runtime và nó không có mục đích dành cho đồng nhất api giữa các đối tượng kết hợp và đơn giản. Decorator pattern chỉ có duy nhất một biến của đối tượng cần thay đổi hành vi bên trong class của nó.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Dễ dàng thêm mới hành vi cho class trong runtime. Kết hợp nhiều hành vi mới cho class.
-   Duy trì đặc tính Single responsibility.

### HẠN CHẾ:
