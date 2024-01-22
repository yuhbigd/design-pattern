## MỤC ĐÍCH:

Tạo ra một interface cho việc khởi tạo object, cho phép các class con của interface đó có thể tự quyết định cách khởi tạo và khởi tạo cái gì. Phiên bản nâng cấp của simple factory

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Tăng tính linh hoạt cho codebase, giúp che giấu các logic của việc khởi tạo object đóng gói logic trong việc khởi tạo.
-   Tuân thủ Open-closed principle, khi có thay dổi trong yêu cầu thì chỉ cần tạo thêm class mới mà không động vào phần code đã viết

### HẠN CHẾ:

-   Tăng độ phức tạp của code base, có thể dẫn đễn việc class explosion.
