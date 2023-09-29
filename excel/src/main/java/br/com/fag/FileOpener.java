package br.com.fag;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOpener {

  public static void main(String[] args) {
    List<Aposta> listaApostas = new ArrayList<Aposta>();

    try {
      InputStream planilha = new ResourceLoader().run();
      XSSFWorkbook workbook = new XSSFWorkbook(planilha);
      XSSFSheet sheetApostas = workbook.getSheetAt(0);

      Iterator<Row> rowIterator = sheetApostas.iterator();

      boolean proximo = rowIterator.hasNext();

      while (proximo) {
        Row row = rowIterator.next();

        if (row.getRowNum() > 0 && row.getRowNum() < 2) {
          System.out.println("Linha " + row.getRowNum() + ":");
          Iterator<Cell> cellIterator = row.cellIterator();
          Aposta aposta = new Aposta();

          while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            switch (cell.getColumnIndex()) {
              case 0:
                aposta.setConcurso((int) cell.getNumericCellValue());
                break;
              case 1:
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                String date = cell.toString();
                LocalDate localDate = LocalDate.parse(date, formatter);
                System.out.println("data -> " + formatter.format(localDate));
                break;
            }
            System.out.println(cell.toString());
          }
          proximo = false;
        }

      }

      workbook.close();

    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }

  }
}
