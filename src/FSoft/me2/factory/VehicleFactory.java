package FSoft.me2.factory;

import FSoft.me2.model.Car;
import FSoft.me2.model.Motorcycle;
import FSoft.me2.model.Vehicle;
import FSoft.me2.util.Constants;
import FSoft.me2.valid.CarValidField;
import FSoft.me2.valid.MotorcycleValidField;
import FSoft.me2.valid.VehicleValidField;

import java.io.*;
import java.security.cert.X509Certificate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
* thực hiện load file và gửi data vào database
* */
public class VehicleFactory {
    private List<Vehicle> vehicles = null;
    private final String logFileErr = "log\\log.txt";

    public VehicleFactory() {
        vehicles = new ArrayList<Vehicle>();
    }

    public List<Vehicle> loadVehicelFromFile(String fileName) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

//            VehicleValidField carChecker = new CarValidField();
//            VehicleValidField motoChecker = new MotorcycleValidField();


            String line;
            String[] fields;
            List<String> errList = null;
            boolean checkRedundantFields = false;
            int numline = 0;
            while ((line = reader.readLine()) != null) {
                fields = line.split(", ");

                switch (fields[0]) {
                    case "1":
//                        checkRedundantFields = carChecker.checkRedundantFields();
//                        errList = carChecker.getListError();
                        vehicles.add(new Car(
                                fields[1],
                                fields[2],
                                fields[3],
                                fields[4],
                                fields[5],
                                Integer.parseInt(fields[6]),
                                fields[7],
                                LocalDate.parse(fields[8], Constants.DATE_TIME_FORMATTER),
                                Integer.parseInt(fields[9].replace(".", "")),
                                Integer.parseInt(fields[10]),
                                fields[11],
                                fields[12],
                                fields[13],
                                Integer.parseInt(fields[14].replace(" mm", ""))
                        ));
                        break;
                    case "2":
//                        checkRedundantFields = motoChecker.checkRedundantFields();
//                        errList = carChecker.getListError();
                        vehicles.add(
                                new Motorcycle(
                                fields[1],
                                fields[2],
                                fields[3],
                                fields[4],
                                fields[5],
                                Integer.parseInt(fields[6]),
                                fields[7],
                                LocalDate.parse(fields[8], Constants.DATE_TIME_FORMATTER),
                                Integer.parseInt(fields[9].replace(".", "")),
                                Integer.parseInt(fields[15].replace(" mm", "")),
                                fields[16]
                        ));
                        break;
                    default:
//                        checkRedundantFields = false;
                }

//                String numLineStr = "Dòng "+ numline+": ";
//                errList = errList.stream().map(other -> numLineStr + "Sai định dạng ở trường "+ other).collect(Collectors.toList());
//
//
//                errorLogger(errList);


                ++numline;
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

        return vehicles;
    }

    private void errorLogger(List<String> logInfo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(logFileErr));
        for (String line : logInfo) {
            writer.write(line + "\n");
        }
    }



}
