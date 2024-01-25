## MỤC ĐÍCH:

Template pattern cho phép tạo ra khung của thuật toán trong base class và cho phép các lớp con ghi đè các bước mà không thay đổi cấu trúc của tổng thể của base class. Các class con chỉ thay đổi một phần của thuật toán tổng thể mà không thay đổi toàn bộ thuật toán. Giúp cho việc thay đổi thuật toán của class con mà không ảnh hưởng đến các class khác.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH

-   Đưa các phần code không thay đổi vào base class và chỉ cần thay đổi 1 phần nhỏ của thuật toán.

### HẠN CHẾ:

-   Bị hạn chế trong khung được đề ra bởi base class.
-   Có thể vi phạm Liskov Substitution Principle vì mỗi thuật toán con đều có phần cài đặt khác nhau.
-   Thay đổi trong base class dẫn đến phải thay đổi toàn bộ class con.
