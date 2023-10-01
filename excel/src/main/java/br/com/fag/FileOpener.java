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
        XSSFRow row = (XSSFRow) rowIterator.next();
        Aposta aposta = new Aposta();

        if (row.getRowNum() > 0) {
          Iterator<?> cellIterator = row.cellIterator();
          ArrayList<Integer> bolas = new ArrayList<>();

          while (cellIterator.hasNext()) {
            XSSFCell cell = (XSSFCell) cellIterator.next();
            switch (cell.getColumnIndex()) {
              case 0:
                double val = Double.parseDouble(cell.toString());
                aposta.setConcurso((int) Math.floor(val));
                break;

              case 1:
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String date = cell.toString();
                LocalDate localDate = LocalDate.parse(date, formatter);
                aposta.setDataSorteio(localDate);
                break;

              case 2:
                bolas.add((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 3:
                bolas.add((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 4:
                bolas.add((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 5:
                bolas.add((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 6:
                bolas.add((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 7:
                bolas.add((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 8:
                double ganhadores6 = Double.parseDouble(cell.toString());
                aposta.setGanhadores6Acertos((int) Math.floor(ganhadores6));
                break;

              case 9:
                aposta.setLocal(cell.toString());
                break;

              case 10:
                aposta.setRateio6Acertos(Utils.parseStringToDouble(cell.toString()));
                break;

              case 11:
                aposta.setGanhadores5Acertos((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 12:
                aposta.setRateio5Acertos(Utils.parseStringToDouble(cell.toString()));
                break;

              case 13:
                aposta.setGanhadores4Acertos((int) Math.floor(Double.parseDouble(cell.toString())));
                break;

              case 14:
                aposta.setRateio4Acertos(Utils.parseStringToDouble(cell.toString()));
                break;

              case 15:
                aposta.setAcumulado6Acertos(Utils.parseStringToDouble(cell.toString()));
                break;

              case 16:
                aposta.setArrecadacaoTotal(Utils.parseStringToDouble(cell.toString()));
                break;

              case 17:
                aposta.setEstimativaDePremio(Utils.parseStringToDouble(cell.toString()));
                break;

              case 18:
                aposta.setAcumuladoEspecial(Utils.parseStringToDouble(cell.toString()));
                break;
              
              case 19:
                aposta.setObservacao(cell.toString());
                break;
            }
            aposta.setBolasSorteadas(bolas);
          }
          listaApostas.add(aposta);
        }
      }
      workbook.close();

      Analisa analisa = new Analisa();
      analisa.quantidadeDeVezesCadaNumeroFoiSorteado(listaApostas);

    } catch (Exception e) {
      System.out.println("Erro: " + e);
    }

  }
}
