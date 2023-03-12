import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {

        /*
        8.Hãy nhập vào 1 String. Kiểm tra xem String đó có chứa một ngày theo định dạng DD/MM/YYYY hay không?
         */
        String str;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào chuỗi ngày tháng năm: ");
            str = scanner.nextLine();
            if (str.length() != 10) {
                System.out.println("ban da nhap sai (độ dài có 10 ký tư), vui long nhap lai!");
            }
        } while (str.length() != 10);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); //ko đúng định dạng cũng parse đc, chỉ cần có 2 / /

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
//            simpleDateFormat.parse(str);
            LocalDate.parse(str, formatter);
            System.out.println("ngày tháng năm '" + str +"' nhập vào đúng định dạng");
        } catch (DateTimeParseException e ) {
            System.out.println("ngày tháng năm '" + str +"' nhập vào không đúng định dạng");
        }
    }
}
