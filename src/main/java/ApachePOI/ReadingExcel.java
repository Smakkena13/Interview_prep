package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {
    public static void main(String[] args) throws IOException {
        //excelfile->workbook->sheet->rows->cells

        FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\testData\\caldata.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(fs);
        XSSFSheet sheet =workbook.getSheet("Sheet2");
//        workbook.getSheetAt(0); //sheet by index

        int rows=sheet.getLastRowNum(); //total rows
        System.out.println("rows: "+rows); //row starts-0, cols starts-1
        int cols=sheet.getRow(0).getLastCellNum();
        System.out.println("cols: "+cols);

        for(int r=0;r<=rows;r++){
            XSSFRow row=sheet.getRow(r);
            for(int c=0;c<cols;c++){
                XSSFCell cell= row.getCell(c);
                System.out.print(cell.toString()+" | ");
            }
            System.out.println();
        }

        workbook.close();
        fs.close();

    }
}
