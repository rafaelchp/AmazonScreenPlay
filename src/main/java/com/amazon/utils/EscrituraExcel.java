package com.amazon.utils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EscrituraExcel {

    public static void escrituraExcel(String ruta, String texto, int fila, int columna) {
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new FileInputStream(ruta));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(fila);
        if (row == null) {
            row = sheet.createRow(fila);
        }
        Cell cell = row.getCell(columna);
        if (cell == null) {
            cell = row.createCell(columna);
        }
        cell.setCellValue(texto);
        try (FileOutputStream outputStream = new FileOutputStream(ruta)) {
            workbook.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
