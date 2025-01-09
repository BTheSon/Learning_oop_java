package FSoft.tbao;


import java.util.*;

public class Main {
	
	/*
	 * File input.txt gồm 4 dòng
	 * 2 dòng đầu hợp lệ
	 * 2 dòng sau không hợp lệ ở trường thứ 2 và 4 (số khung và màu sơn)
	 */
	
	public static void main(String[] args) throws Exception {
		FormatChecker formatChecker = new FormatChecker("input.txt");
		
		// Lưu trường không hợp lệ vào file
		formatChecker.logInvalids("output.txt");
		
		// Đưa dữ liệu hợp lệ vào database
		ArrayList<Vehicle> vehicles = formatChecker.getValids();
		Database.addVehicleListToDatabase(vehicles);
		
		System.out.println("Xong!");
	}
	
}