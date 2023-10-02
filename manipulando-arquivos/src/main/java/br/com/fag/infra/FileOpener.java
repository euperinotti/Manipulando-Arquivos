package br.com.fag.infra;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import br.com.fag.domain.entities.Aposta;

public class FileOpener {

  public List<Aposta> read() {
    List<Aposta> listaApostas = new ArrayList<Aposta>();

    try {
      InputStream planilha = new ResourceLoader().run();
      XSSFWorkbook workbook = new XSSFWorkbook(planilha);
      XSSFSheet sheetApostas = workbook.getSheetAt(0);
      Iterator<?> rowIterator = sheetApostas.iterator();

      while (rowIterator.hasNext()) {
        XSSFRow row = (XSSFRow) rowIterator.next();
        Aposta aposta = new Aposta();

        if (row.getRowNum() > 0) {
          Iterator<?> cellIterator = row.cellIterator();

          while (cellIterator.hasNext()) {
            XSSFCell cell = (XSSFCell) cellIterator.next();
            ColumnMapper.values()[cell.getColumnIndex()].map(aposta, cell);
          }
          listaApostas.add(aposta);
        }
      }
      workbook.close();

      return listaApostas;

    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }
    return null;
  }
}
