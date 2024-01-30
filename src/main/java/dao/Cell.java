package dao;

public final  class Cell {
    private final String value;
    private final int rowId;
    private final int colId;
    private final String type;


    public Cell(String value, int rowId, int colId, String type) {
        this.value = value;
        this.rowId = rowId;
        this.colId = colId;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public int getRowId() {
        return rowId;
    }

    public int getColId() {
        return colId;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CellClass{" +
                "value='" + value + '\'' +
                ", rowId=" + rowId +
                ", colId=" + colId +
                ", type='" + type + '\'' +
                '}';
    }
}
