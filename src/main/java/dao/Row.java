package dao;


import dao.Cell;

import java.util.List;

public class Row {


    private int id;
    private List<Cell> cells;

    public Row(int id, List<Cell> cells) {
        this.id = id;
        this.cells = cells;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "RowsClass{" +
                "id=" + id +
                ", cells=" + cells +
                '}';
    }
    /*public List<XSSFCell> numberOfCells() {
        rows = new SheetClass().numberOfRows();
        int columns = rows.get(0).getLastCellNum();
        for (int i=0;i<rows.size();i++){
            XSSFRow row = rows.get(i);
            for (int j=0;j<columns;j++){
                XSSFCell cell = row.getCell(j);
                cells = new ArrayList<>();
                cells.add(cell);
            }

        }
        return cells;

    }*/

}











