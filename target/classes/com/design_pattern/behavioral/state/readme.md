## MỤC ĐÍCH:

Giúp đối tượng thay đổi hành vi khi mà state của đối tượng thay đổi. Giúp cho hành vi của đối tượng được thay đổi ở runtime. Giúp loại bỏ ifels và switch case để thay đổi đối tượng.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Giúp encapsulate các hành vi liên quan đến state trong 1 class cụ thể. Giúp code được clean và tách phần implementation ra khỏi class sử dụng state. Từ đó có thể thêm mới hoặc sửa đổi state thì không làm codebase bị thay đổi quá nhiều.
-   Tạo ra một cấu trúc cho finite state machine cơ bản.

### HẠN CHẾ:

-   Tăng số lượng class.
-   overkill khi state không thay đổi quá nhiều trong quá trình hoạt động.

<br/>
<br/>
<br/>
<br/>
Khác biệt với strategy: Class sử dụng state cần phải biết chi tiết của state sẽ sử dụng trong khi strategy thì ngược lại. Trong strategy thì các concrete class không liên quan đến nhau còn state thì ngược lại.
