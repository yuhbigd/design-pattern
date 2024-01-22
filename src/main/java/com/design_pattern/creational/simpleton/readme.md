## MỤC ĐÍCH:

Khởi tạo duy nhất một đối tượng cho toàn bộ ứng dụng và chỉ sử dụng duy nhất đối tượng.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Rút ngắn thời gian cho việc tạo đối tượng.
-   Tạo biến toàn cầu cho tất cả các ứng dụng muốn sử dụng, chỉ cần sử dụng mà ko cần khởi tạo.

### HẠN CHẾ:

-   Hạn chế trong việc tuỳ chỉnh cho từng nhu cầu.
-   Dễ tạo nên các lỗi do có thể không nắm bắt được việc sửa đổi data bên trong đối tượng singleton vì đối tượng được sử dụng cùng 1 lúc ở nhiều nơi.
