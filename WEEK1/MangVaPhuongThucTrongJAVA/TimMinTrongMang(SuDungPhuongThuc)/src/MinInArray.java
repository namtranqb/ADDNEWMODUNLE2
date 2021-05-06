import java.util.Collections;
import java.util.Arrays;

public class MinInArray {
//    public static int minValue(int[] array){
//        return -1;
//    }
    public static void main(String[] args) {
//        Khởi tạo mảng số nguyên "kiểu Integer"
        Integer[] arr ={5,6,3,45,12,65,8};
        int min = Collections.min(Arrays.asList(arr));
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == min){
                System.out.println(" Min in Array: "+min+" at index: "+i);
            }
        }

//Để nhận giá trị nhỏ nhất hoặc lớn nhất từ mảng,
// chúng ta có thể sử dụng các phương thức Collections.min ()
// và Collections.max ().  //  "Khai báo thêm import java.util.Arrays;"
// Nhưng vì phương pháp này yêu cầu kiểu dữ liệu danh sách,
// nên trước tiên, chúng ta cần chuyển đổi mảng thành danh sách
// bằng cách sử dụng hàm “aslist ()”

//        Mảng bạn đang chuyển tới Arrays.asList ()
//        phải có kiểu trả về là Số nguyên hoặc bất kỳ lớp nào bạn muốn sử dụng”,
//        vì Collections.sort () chấp nhận đối tượng ArrayList làm tham số.

//        Nếu bạn sử dụng kiểu int trong khi khai báo mảng,
//        bạn sẽ gặp lỗi này:
//        “không tìm thấy phương thức phù hợp cho min (List <int []>)”
    }

}
