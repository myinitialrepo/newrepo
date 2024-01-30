package dao;


import dao.Row;

import java.util.List;

public class Sheet {

    private String name;
    private List<Row> rows;
    private Integer id;

    public Sheet(String name, List<Row> rows, Integer id) {
        this.name = name;
        this.rows = rows;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SheetClass{" +
                "name='" + name + '\'' +
                ", rows=" + rows +
                ", id=" + id +
                '}';
    }
    /*public List<XSSFRow> numberOfRows(){
        sheets = new WorkbookClass().numberOfSheets();
        XSSFSheet sheetAtIndexOne = sheets.get(0);
        int numberOfRows = sheetAtIndexOne.getLastRowNum();
        for (int i=0; i<numberOfRows;i++){
            XSSFRow row = sheetAtIndexOne.getRow(i);
            rows = new ArrayList<>();
            rows.add(row);
        }
        return rows;*/

}









