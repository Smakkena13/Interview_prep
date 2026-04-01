package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Randomwriting {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\caldata2.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook();

        XSSFSheet sheet= wb.createSheet("sample");
        sheet.createRow(3).createCell(4).setCellValue("happy");

        wb.write(fs);
        wb.close();
        fs.close();

    }
}
