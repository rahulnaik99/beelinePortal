package CommonMethods;

import com.aspose.cells.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Util {
    public static void time(PrintWriter out) {

        SimpleDateFormat formatDate = new SimpleDateFormat(
                "dd/MM/yyyy  HH:mm:ss z");
        Date date = new Date();
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println(formatDate.format(date));
        out.println(formatDate.format(date));

    }
    public static PrintWriter csvHandler() throws FileNotFoundException {
        File csvFile = new File("src/main/Output/status.csv");
        PrintWriter out = new PrintWriter(csvFile);
        return out;
    }
    public static void fileOperation() throws Exception {
        Workbook workbook = new Workbook("src/main/Output/status.csv");
        workbook.save("src/main/Output/status.html");

    }

}

