## MỤC ĐÍCH:

Memento (snapshot) giúp lưu trữ và restore trạng thái (cả private lẫn public) của đối tượng mà không vi phạm encapsulation do pattern này giao việc tạo snapshot cho chính object cần tạo.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Tạo snapshot của đối tượng mà không vi phạm tính encapsulation.
-   Thêm thành phần caretaker giúp kiểm soát và lưu trữ snapshot.

### HẠN CHẾ:

-   Tốn ram do caretaker cần lưu snapshot.
-   Cần thêm cơ chế track xem originator có cần dùng nữa hay không để xoá nếu không -> memory leak.
    <br/>
    https://stackoverflow.com/questions/75075521/what-is-the-difference-between-the-momento-and-prototype-design-pattern
    <br/>
    https://www.cs.trinity.edu/~mlewis/CSCI3394-F07/Lectures/Lect13.pdf
