package src;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        String x=input.nextLine();
        String y=input.nextLine();
        //Cho biết tổng chiểu dài của chuỗi x.
        System.out.println(x.length());
        //Cho biết 3 kí tự đầu tiên của chuỗi x.
        System.out.println(x.substring(0,3));
        //Cho biết 3 kí tự cuối của chuỗi x.
        System.out.println(x.substring(x.length()-3,x.length()));
        //Cho biết kí tự thứ 6 của chuỗi x.
        System.out.println(x.charAt(5));
        //Tạo chuỗi mới gồm 3 kí tự đầu tiên của chuỗi x và 3 kí tự cuối của chuỗi y.
        String c= new String(x.substring(0,3)+y.substring(y.length()-3,y.length()));
        System.out.println(c);
        //Kiểm tra 2 chuỗi x, y có bằng nhau hay không (phân biệt chữ hoa, thường)?(Hướng dẫn: sử dụng hàm equals)
        System.out.println(x.equals(y));
        //Kiểm tra 2 chuỗi x, y có bằng nhau hay không (không phân biệt chữ hoa, h.thường)? (Hướng dẫn: sử dụng hàm equalsIgnoreCase)
        System.out.println(x.equalsIgnoreCase(y));
        //Cho biết y có xuất hiện trong x hay không? Nếu có, tại vị trí nào? (Hướng dẫn: sử dụng hàm indexOf)
        System.out.println(x.indexOf(y));
        //Cho biết tất cả các vị trí xuất hiện của y trong x.
        int viTri[]=new int [10];
        int length=0;
        String z=x;
        while(z.indexOf(y)!=-1){
            int d=z.indexOf(y);
            z=removeCharAt(z,d);
            viTri[length]=d+length;
            length+=1;
        }
        for(int a=0;a<length;a+=1){
            System.out.println(viTri[a]);
        }




    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
