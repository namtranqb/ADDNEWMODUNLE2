*--PHẦN MỀM QUẢN LÝ DANH BẠ--*
	1. Xem danh sách
	2. Thêm mới
	3. Cập nhật
	4. Xóa
	5. Tìm kiếm
	6. Đọc từ file
	0. Thoát

*--NỘI DUNG--*

1. Xem danh sách
	- Hiển thị 5 danh bạ, nhấn enter để hiển thị tiếp. Khi hết danh bạ quay lại menu hoặc thoát.

2. Thêm mới
	- Số điện thoại:
		+ Kiểm tra đầu vào theo đầu số Việt Nam, 10 chữ số, định dạng (xxx.xxx.xxxx)
		+ Kiểm tra trùng lặp 
		  Không đúng, nhập lại.

	- Nhóm danh bạ: 
		+ Tự động chuyển đổi chữ thường hay chữ hoa ở giữa về 1 định dạng chuẩn 
		  (chữ cái đầu viết hoa, sau viết thường).

	- Họ tên: 
		+ Tự động chuyển đổi chữ thường hay chữ hoa ở giữa về 1 định dạng chuẩn 
		  (chữ cái đầu viết hoa, sau viết thường).

	- Giới tính:
		+ Tự động chuyển đổi chữ thường hay chữ hoa ở giữa về 1 định dạng chuẩn 
		  (chữ cái đầu viết hoa, sau viết thường).
		+ Nhập "nam", "Nam", "male" .. => "Male"
		+ Nhập "nu", "nữ", "fimale".. => "Fimale"
		+ Nhập "khac", "other", "khÁc" .. => "Other"	

	- Ngày sinh:
		+ Định dạng(dd/MM/yyyy).
		+ Chưa làm đc định dạng có năm nhuận vs số ngày đúng của tháng.

	- Địa chỉ:
		+ Tự động chuyển đổi chữ thường hay chữ hoa ở giữa về 1 định dạng chuẩn 
		  (chữ cái đầu viết hoa, sau viết thường). 

	- Email:
		+ Chuẩn đặt tên.
		+ Bắt buộc có chỉ 1 dấu @
		+ Tài khoản định dạng "@(1 kí tự chữ)mail.com" hoặc "@outlook.com"
		+ Kiểm tra trùng lặp

	Lưu vào file "data/contact.csv"

3. Cập nhật
	- Cập nhật theo số điện thoại:
		+ Set lại Nhóm danh bạ, Họ tên, Giới tính, Ngày sinh, Địa chỉ, Email(nếu trùng hỏi lại có ghi đè không)

	Lưu vào file "data/contact.csv"
4. Xóa
	- Xóa theo số điện thoại
	Lưu vào file "data/contact.csv"

5. Tìm kiếm
	- Tìm kiếm gần đúng, nhập vào 1 chuỗi (Chuỗi có thể là 1 đoạn hay toàn bộ tên, 1 đoạn hay toàn bộ số điện thoại, 1 đoạn hay toàn bộ tên nhóm, 1 đoạn hay toàn bộ email)
	- Có thể nhập không dấu để tìm kiếm có dấu và ngược lại.

6. Đọc từ file
	- Hiển thị toàn bộ danh sách danh bạ từ file csv.

0. Thoát

II.PHẦN TÌM HIỂU THÊM
	- Phần tìm kiếm:
		+ Sử dụng contains để tìm kiếm gần đúng.
		+ Chuyển chuỗi nhập vào sang chuỗi chữ thường, không dấu
		+ Chuyễn chuỗi tìm kiếm đc sang chuỗi chữ thường, không dấu và so sánh với chuỗi nhập vào. Hiển thị kết quả tìm được
	
	- File .csv có hiển thị tiêu đề, đọc file thì bỏ qua tiêu đề và không đọc dòng trống trong file.