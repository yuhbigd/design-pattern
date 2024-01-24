## MỤC ĐÍCH:

Mediator (middle-man) đóng gói và chỉ định sự tương tác lẫn nhau giữa một tập hợp các object. Các object này sẽ giao tiếp thông qua với nhau thông qua mediator. Giảm độ phức tạp của codebase.

## LỢI ÍCH VÀ HẠN CHẾ:

### LỢI ÍCH:

-   Giảm độ phụ thuộc lẫn nhau giữa các đối tượng.
-   Tăng tính tái sử dụng do giờ đây khi các đối tượng chỉ cần biết làm cách nào để tương tác với mediator.

### HẠN CHẾ:

-   Single point of failure.
-   Mediator phụ thuộc vào các đối tượng cụ thể -> tăng tính phụ thuộc vào các đối tượng này.
    <br/>
    https://stackoverflow.com/questions/75645008/what-are-the-differences-between-the-mediator-and-command-design-pattern
