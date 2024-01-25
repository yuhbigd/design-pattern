## MỤC ĐÍCH:

Observer pattern là một design pattern mà một đối tượng, gọi là subject, duy trì một danh sách các thành phần phụ thuộc nó, gọi là observer, và thông báo tới chúng một cách tự động về bất cứ thay đổi nào, thường thì bằng cách gọi 1 hàm của chúng.

## LỢI ÍCH VÀ HẠN CHẾ:

-   Tách rời sự phụ thuộc giữa subject và các observers của nó. Subject không quan tâm với việc observers là class nào, do đó đảm bảo tính linh hoạt và tách biệt của các module. Sự rời rạc này là quan trọng trong các tình huống mà cần thay đổi trong một module sẽ không yêu cầu sự thay đổi trong các module khác.
-   Dynamic relationship giữa subject và các observers, observer có thể unsubcribe hoặc subcribe subject và subject cũng có thể remove các observers trong runtime.
-   Giúp cho việc lan truyền sự kiện đến nhiều đối tượng cùng một lúc.
### HẠN CHẾ:
-   Có thể dẫn đến circular dependencies làm hệ thống bị treo.
-   Không kiểm soát một cách hợp lý các đối tượng có thể dẫn đến memory leak và gửi nhầm event đến các object không liên quan.
