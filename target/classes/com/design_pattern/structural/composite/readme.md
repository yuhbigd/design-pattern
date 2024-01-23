## MỤC ĐÍCH:

Được sử dụng để gom nhóm các đối tượng riêng biệt thành một kiếu cấu trúc cây và sử dụng cấu trúc này như là một đối tượng riêng biệt với api tương tự nhau. <br/>
Sử dụng pattern này nếu muốn client xử lý cả đối tượng đơn giản lẫn phức tạp như nhau theo một quy chuẩn chung (interface).

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Làm việc với cấu trúc cây phức tạp dễ dàng hơn vì nhờ vào tận dụng polymorphism và đệ quy.
-   Thay đổi hoặc thêm mới các đối tượng cụ thể mà không làm thay đổi codebase cũ.

### HẠN CHẾ:

-   Có thế sẽ gặp khó khăn trong việc tạo ra một interface chung cho các class vì mục đích và khả năng của chúng có thể khác nhau rất nhiều.
