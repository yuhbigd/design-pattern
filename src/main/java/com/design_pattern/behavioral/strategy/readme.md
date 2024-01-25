## MỤC ĐÍCH:

Định nghĩa một tập hợp các thuật toán giống nhau, encapsulate chúng và khiến chúng có thể thay thế cho nhau. Strategy làm cho phần thuật toán độc lập khỏi client sử dụng nó. Hay nói cách khác, tách các hành động giống nhau ra thành một tập hợp dưới một abstract và mỗi hành động sẽ là một class độc lập. Class của thuật toán sẽ được truyền thông qua Composition.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH

-   Tách biệt phần thuật toán khỏi phần sử dụng thuật toán
-   Có thể thay thế việc kế thừa bằng việc encapsulate thuật toán
-   Tăng tính open-closed: Khi thay đổi thuật toán hoặc khi thêm mới thuật toán, không cần thay đổi code phần context
-   Cho phép thay đổi các biến thể khác nhau của một xử lý trong một đối tượng và có thể chuyển đổi giữa các xử lý trong runtime.

### HẠN CHẾ:

-   Không nên áp dụng nếu chỉ có một vài xử lý và hiếm khi thay đổi.
-   Client phải nhận biết được sự khác biệt giữa các strategy.
