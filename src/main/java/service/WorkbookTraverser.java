package service;

import dao.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.List;

public class WorkbookTraverser {


    public Workbook prepareWorkbook(XSSFWorkbook xssfWorkbook){
        List<Sheet> sheets = new ArrayList<>();
        for (int i =0 ; i<xssfWorkbook.getNumberOfSheets();i++){
            Sheet sheet = this.prepareSheet(xssfWorkbook.getSheetAt(i));
            sheets.add(sheet);
        }
        return new Workbook(sheets);

    }

    public Sheet prepareSheet(XSSFSheet xssfSheet){
        List<Row> rows = new ArrayList<>();
        for (int i= 0; i<xssfSheet.getLastRowNum();i++){
            Row row = this.prepareRow(xssfSheet.getRow(i));
            rows.add(row);

        }
        return new Sheet(xssfSheet.getSheetName(),rows,1);
    }

    public Row prepareRow(XSSFRow xssfRow){
        List<Cell> cells = new ArrayList<>();
        for (int i=0; i<xssfRow.getLastCellNum(); i++){
            Cell cell = this.prepareCell(xssfRow.getCell(i),xssfRow.getRowNum(),xssfRow.getLastCellNum());
            cells.add(cell);
        }
        return new Row(xssfRow.getRowNum(),cells);
    }


    public Cell prepareCell(XSSFCell cell, int rowid, int colid){
        return new Cell(cell.getStringCellValue(),cell.getRowIndex(), cell.getColumnIndex(), cell.getStringCellValue());
    }

}
