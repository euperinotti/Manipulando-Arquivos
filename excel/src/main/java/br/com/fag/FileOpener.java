package br.com.fag;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOpener {

  public static void main(String[] args) {
    List<Aposta> listaApostas = new ArrayList<Aposta>();

    try {
      InputStream planilha = new ResourceLoader().run();
      XSSFWorkbook workbook = new XSSFWorkbook(planilha);
      XSSFSheet sheetApostas = workbook.getSheetAt(0);
      Iterator<?> rowIterator = sheetApostas.iterator();

      while (rowIterator.hasNext()) {
        System.out.println("Tem proximo?: " + rowIterator.hasNext());
        XSSFRow row = (XSSFRow) rowIterator.next();
        System.out.println("Linha " + row.getRowNum() + ": ");
        Iterator<?> cellIterator = row.cellIterator();

        while (cellIterator.hasNext()) {
          XSSFCell cell = (XSSFCell) cellIterator.next();
          System.out.print(" - " + cell.toString());
        }
      }

      workbook.close();

    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }

  }
}
