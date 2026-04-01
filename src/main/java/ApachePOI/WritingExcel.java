package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcel {
    public static void main(String[] args) throws IOException {
        //excelfile->workbook->sheet->rows->cell

        FileOutputStream fs=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\caldata1.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("data");

        XSSFRow row1= sheet.createRow(0);
        row1.createCell(0).setCellValue("NAME");
        row1.createCell(1).setCellValue("AGE");
        row1.createCell(2).setCellValue("CITY");

        XSSFRow row2=sheet.createRow(1);
        row2.createCell(0).setCellValue("PRMG");
        row2.createCell(1).setCellValue(28);
        row2.createCell(2).setCellValue("HYD");

        XSSFRow row3=sheet.createRow(2);
        row3.createCell(0).setCellValue("AMIT");
        row3.createCell(1).setCellValue(30);
        row3.createCell(2).setCellValue("PUNE");

        workbook.write(fs);
        workbook.close();
        fs.close();
        System.out.println("file created succesfully");



    }
}
