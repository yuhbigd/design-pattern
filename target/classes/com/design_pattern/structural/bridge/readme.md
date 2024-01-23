## MỤC ĐÍCH:

Là pattern giúp cho việc tách class thành 2 phần abstraction và implementation. Qua đó thì giúp cho việc 2 phần có thể thay đổi một cách độc lâp (e.g. website với các theme khác nhau). <br/>
Điều đó có nghĩa là, ban đầu chúng ta thiết kế một class với rất nhiều xử lý (concrete class), bây giờ chúng ta cần một phiên bản có phần xử lý khác (concrete class) của class thì chúng ta phải tạo ra một class mới có chứa các class cụ thể của phần xử lý mới. Việc này khiến mỗi khi thay đổi xử lý thì chúng ta lại cần phải tạo class mới hoặc thay đổi class cũ (I.E: web với nhiều theme khác nhau). Với Bridge pattern thì ta sẽ tạo một abstraction(interface, abstract class. Tuy nhiến không phải là phần abstraction trong bridge pattern) cho việc xử lý và sử dụng chúng thay cho class cụ thể và tạo ra một abstraction cho class sẽ bị chia lúc đầu và trong abstraction này sẽ sử dụng các abstraction của việc xử lý.
## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Giảm sự phụ thuộc giữa client và class cụ thể nào đó, làm cho code dễ hiểu và dễ thay đổi hơn.
-   Giúp thay đổi implementation dễ dàng hơn
-   Cho phép phát triển một cách độc lập giữa abstraction và implementation 
### HẠN CHẾ:

-   Tăng sự phức tạp của codebase.
