## MỤC ĐÍCH:

Tạo ra một interface cho việc khởi tạo các đối tượng liên quan tới nhau hoặc liên kết với nhau. Được coi như phần mở rộng của factory method vì giờ đây các factory sẽ được gộp và sử dụng dưới một factory interface(factory of factories).

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Giảm sự phụ thuộc giữa client và class cụ thể nào đó, làm cho code dễ hiểu và dễ thay đổi hơn.
-   Tạo ra một điểm tạo chung cho các đối tượng liên quan đến nhau(platform or library) giúp client giảm phụ thuộc do chỉ sử dụng các interface được cung cấp bởi factory.
-   Tăng tính nhất quán giữa các đối tượng trong cùng một family hoặc related với nhau.

### HẠN CHẾ:

-   Tăng sự phức tạp của codebase.
