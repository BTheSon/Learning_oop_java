package FSoft.tbao;


import java.io.*;
import java.util.*;

public class FormatChecker {
	
	private ArrayList<String> logs;
	private ArrayList<Vehicle> valids;
	
	public FormatChecker(String fileName) throws IOException {
		logs = new ArrayList<>();
		valids = new ArrayList<>();
		check(fileName);
	}
	
	private void check(String fileName) throws IOException {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int lineCount = 0;
		boolean validLine;
		while ((line = br.readLine()) != null) {
			lineCount++;
			validLine = true;
			String[] parts = line.split(", ");
			if (!Valid.soKhung(parts[1])) {
				collect(lineCount, "Số khung");
				validLine = false;
			}
			if (!Valid.soMay(parts[2])) {
				collect(lineCount, "Số máy");
				validLine = false;
			}
			if (!Valid.mauSon(parts[3])) {
				collect(lineCount, "Màu sơn");
				validLine = false;
			}
			if (!Valid.hieuXe(parts[4], Integer.parseInt(parts[0]))) {
				collect(lineCount, "Hiệu xe");
				validLine = false;
			}
			if (!Valid.ngayNhap(parts[8])) {
				collect(lineCount, "Ngày nhập");
				validLine = false;
			}
			if (!Valid.giaBan(Long.parseLong(parts[9].replace(".", "")), Integer.parseInt(parts[0]))) {
				collect(lineCount, "Giá bán");
				validLine = false;
			}
			if (validLine) {
				addValid(parts);
			}
		}
		br.close();
		fr.close();
	}
	
	private void collect(int line, String field) {
		logs.add("Dòng " + line + ": Sai định dạng ở trường " + field);
	}
	
	public void logInvalids(String fileName) throws IOException {
		if (logs.isEmpty()) {
			return;
		}
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < logs.size(); i++) {
			bw.write(logs.get(i));
			if (i < logs.size() - 1) {
				bw.newLine();
			}
		}
		bw.close();
		fw.close();
	}
	
	public void addValid(String[] parts) {
		if (parts[0].equals("1")) {
			valids.add(new Car(
					parts[1],
					parts[2],
					parts[3],
					parts[4],
					parts[5],
					Integer.parseInt(parts[6]),
					parts[7],
					parts[8],
					Long.parseLong(parts[9].replace(".", "")),
					Integer.parseInt(parts[10]),
					parts[11], parts[12], parts[13], parts[14]));

		} else if (parts[0].equals("2")) {
			valids.add(new Motorbike(
					parts[1], parts[2],
					parts[3], parts[4],
					parts[5], Integer.parseInt(parts[6]),
					parts[7], parts[8],
					Long.parseLong(parts[9].replace(".", "")),
					parts[15], parts[16]));
		}
	}
	
	public ArrayList<Vehicle> getValids() {
		return valids;
	}
	
}