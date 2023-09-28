package br.com.fag;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOpener {

  private static final String filePath = "/home/euperinotti/Documents/Github/Manipulando-Arquivos/excel/src/main/java/br/com/fag/data/Mega-Sena.xlsx";

  public static void main(String[] args) {
    List<Aposta> listaApostas = new ArrayList<Aposta>();

    try {
      FileInputStream planilha = new FileInputStream(new File(FileOpener.filePath));
      XSSFWorkbook workbook = new XSSFWorkbook(planilha);
      XSSFSheet sheetApostas = workbook.getSheetAt(0 );

      Iterator<Row> rowIterator = sheetApostas.iterator();

      while (rowIterator.hasNext()) {
        Row row = rowIterator.next();
          Iterator<Cell> cellIterator = row.cellIterator();
          Aposta aposta = new Aposta();

          while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            System.out.println(cell.toString());
          }
          listaApostas.add(aposta);
      }

    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }
  }
}
