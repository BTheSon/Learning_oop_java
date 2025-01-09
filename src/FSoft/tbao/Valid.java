package FSoft.tbao;


import java.text.*;
import java.util.*;

// Lớp này dùng để kiểm tra định dạng cho từng trường cụ thể
public class Valid {
	
	public static boolean ngayNhap(String input) {
		/*
		 * Định dạng yêu cầu: dd-MM-yyyy
		 * Tương ứng: ngày-tháng-năm
		 * Ví dụ: 01-01-2000
		 */
		
		/*
		// Cách 1 - Dùng Regex sai vì nó chỉ kiểm tra định dạng chứ cú pháp ngày tháng năm sai hoàn toàn
			vd 22-22-2222 nó vẫn thỏa regex
		boolean correctFormat = input.matches("^\\d{2}-\\d{2}-\\d{4}$");
		if (!correctFormat) {
			return false;
		}
		*/
		
		// Cách 2 - Kiểm tra thủ công theo từng yêu cầu
		
		// Tách chuỗi được phân cách bằng <dấu gạch nối> thành các phần riêng biệt
		String[] parts = input.split("-");

		// Kiểm tra chuỗi sau khi tách có đủ 3 phần hay không
		if (parts.length != 3) {
			return false;
		}
		
		// Kiểm tra độ dài mỗi chuỗi có tương ứng 2-2-4 hay không
		if (parts[0].length() != 2 || parts[1].length() != 2 || parts[2].length() != 4) {
			return false;
		}
		
		// Kiểm tra các ký tự trong mỗi chuỗi có phải là số hay không
		
		// Vòng lặp qua từng chuỗi
		for (int i = 0; i < parts.length; i++) {
			
			// Vòng lặp qua từng ký tự trong chuỗi đó
			for (char c : parts[i].toCharArray() /* Chuyển chuỗi thành mảng ký tự để duyệt */) {
				
				// Nếu ký tự không phải chữ số
				if (!Character.isDigit(c)) {
					return false;
				}
			}
		}
		
		// Dùng chung
		
		// Lớp này dùng để định dạng chuỗi thời gian theo một định dạng cụ thể
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date inp, now;
		try {
			// Định dạng cho chuỗi thời gian <nhập vào>
			inp = sdf.parse(input);
			
			// Định dạng cho chuỗi thời gian <hiện tại>
			now = sdf.parse(sdf.format(new Date()));
		} catch (ParseException pe) {
			return false;
		}
		
		/*
		 * Hàm compareTo kiểm tra nếu thời gian nhập vào:
		 * 	+) Trước thời gian hiện tại:	trả về số nhỏ hơn 0
		 * 	+) Bằng thời gian hiện tại:		trả về số 0
		 * 	+) Sau thời gian hiện tại:		trả về số lớn hơn 0
		 */
		// Yêu cầu là nhỏ hơn hoặc bằng hiện tại nên sẽ lấy nhỏ hơn hoặc bằng 0
		return (inp.compareTo(now) <= 0);
	}
	
	public static boolean soKhung(String input) {
		/*
		 * Định dạng yêu cầu: XXXX-XXXXX
		 * Ví dụ: AB12-C3D4E
		 */
		
		/*
		// Cách 1 - Dùng Regex
		boolean correctFormat = input.matches("^[0-9a-zA-Z]{4}-[0-9a-zA-Z]{5}$");
		if (!correctFormat) {
			return false;
		}
		*/
		
		// Cách 2 - Kiểm tra thủ công theo từng yêu cầu
		
		// Tách chuỗi được phân cách bằng <dấu gạch nối> thành các phần riêng biệt
		String[] parts = input.split("-");
		
		// Kiểm tra chuỗi sau khi tách có đủ 2 phần hay không
		if (parts.length != 2) {
			return false;
		}
		
		// Kiểm tra độ dài mỗi chuỗi có tương ứng 4-5 hay không
		if (parts[0].length() != 4 || parts[1].length() != 5) {
			return false;
		}
		
		// Kiểm tra các ký tự trong mỗi chuỗi có phải là số hay không
		
		// Vòng lặp qua từng chuỗi
		for (int i = 0; i < parts.length; i++) {
			
			// Vòng lặp qua từng ký tự trong chuỗi đó
			for (char c : parts[i].toCharArray() /* Chuyển chuỗi thành mảng ký tự để duyệt */) {
				
				// Nếu ký tự không phải chữ số hoặc chữ cái
				if (!(Character.isDigit(c) || Character.isLetter(c))) {
					return false;
				}
			}
		}
		
		// Dùng chung
		
		// Nếu các yêu cầu trên đều đạt thì code sẽ chạy đến đây
		// -> chuỗi đúng định dạng: trả về true
		return true;
	}
	
	public static boolean soMay(String input) {
		// Định dạng số khung và số máy giống nhau nên sẽ gọi lại hàm của số khung.
		// Chia thành 2 hàm riêng biệt cho nó rõ ràng.
		return soKhung(input);
	}
	
	public static boolean giaBan(long input, int type) {
		// Mức giá giới hạn
		long car = 3000000000L; // 3 tỉ
		long motorbike = 100000000L; // 100 triệu
		
		// 1 và 2 đã quy định trong đề. 1 là car, 2 là motorbike
		if (type == 1) {
			return input > 0 && input <= car;
		}
		if (type == 2) {
			return input > 0 && input <= motorbike;
		}
		return false;
	}
	
	public static boolean mauSon(String input) {
		// Bộ các dữ liệu hợp lệ
		Set<String> color = Set.of("Den", "Trang", "Xam", "Do");
		
		// Nếu bộ trên không chứa dữ liệu nhập vào thì dữ liệu đó là không hợp lệ
		return color.contains(input);
	}
	
	public static boolean hieuXe(String input, int type) {
		// Bộ các dữ liệu hợp lệ cho car
		Set<String> car = Set.of("HRV", "BRV", "CRV");
		
		// Bộ các dữ liệu hợp lệ cho motorbike
		Set<String> motorbike = Set.of("Lead", "Vision", "Air Blade");
		
		// 1 và 2 đã quy định trong đề. 1 là car, 2 là motorbike
		if (type == 1) {
			// Nếu bộ car không chứa dữ liệu nhập vào thì dữ liệu đó là không hợp lệ
			return car.contains(input);
		}
		if (type == 2) {
			// Nếu bộ motorbike không chứa dữ liệu nhập vào thì dữ liệu đó là không hợp lệ
			return motorbike.contains(input);
		}
		return false;
	}
	
}