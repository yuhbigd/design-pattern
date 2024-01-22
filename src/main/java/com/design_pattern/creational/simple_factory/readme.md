## MỤC ĐÍCH:

Tạo ra một static method giúp cho việc khởi tạo các object cụ thể của cùng một kiểu. Giúp cho việc hiding implementation logic của các đối tượng và giúp cho client có thể chú tâm vào việc sử dụng hơn là làm cách nào để tạo ra một đối tượng cụ thể.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Giúp cho việc quản lý việc tạo object ở trong cùng một nơi, tránh việc sử dụng keyword "new" trong codebase.
-   Giảm sự phụ thuộc giữa client và class cụ thể nào đó, làm cho code dễ hiểu và dễ thay đổi hơn.

### HẠN CHẾ:

-   Chỉ phù hợp với các đối tượng có constructor đơn giản và giống nhau. Khi thay đổi logic trong class cụ thể thì đồng thời phải thay đổi ở trong factory method(vi phạm open-closed principle).
-   Tăng sự phức tạp của codebase.
