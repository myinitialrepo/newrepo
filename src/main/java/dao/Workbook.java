package dao;
import dao.Sheet;

import java.util.List;

public class Workbook {
    //private String name;
    private List<Sheet> sheets;

    public Workbook( List<Sheet> sheets) {

        this.sheets = sheets;
    }

    private Workbook(){

    }


    public List<Sheet> getSheets()
    {
        return sheets;
    }

    public void setSheets(List<Sheet> sheets)
    {
        this.sheets = sheets;
    }

    @Override
    public String toString() {
        return "WorkbookClass{" +

                ", sheets=" + sheets +
                '}';
    }

    /* public List<XSSFSheet> numberOfSheets() {
        this.workbook = new WorkbookLoader().workbookLoader();
        int numberOfSheets = this.workbook.getNumberOfSheets();
        for (int i=0;i<numberOfSheets;i++){
            XSSFSheet sheet = this.workbook.getSheetAt(i);
            sheets = new ArrayList<>();
            sheets.add(sheet);
        }
        return sheets;
    }*/

}














