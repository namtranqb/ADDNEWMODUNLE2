public class BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương ");
            for(int i = 1; i <= 10;i++){
                System.out.println();
                for(int j = 2; j <= 9;j++){
                    System.out.printf("%02d * %02d = %02d      ",i,j,i*j);
                }
            }
        }


}