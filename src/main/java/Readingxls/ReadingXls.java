package Readingxls;

public class ReadingXls {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/main/java/ReadingXls/Data.xlsx";
        Xls_Reader xls = new Xls_Reader(path);
        int rowCount = xls.getRowCount("LoginTest");
        System.out.println(rowCount);
        int colCount = xls.getColumnCount("LoginTest");
        System.out.println(colCount);
        String data = xls.getCellData("LoginTest", 3, 4);
        //System.out.println(data);
        //String value = null;
        System.out.println("***********************************************");
        for (int i = 1; i <= rowCount; i++) {
            System.out.println("------------------------------------------");
            for (int j = 0; j < colCount; j++) {
                String value = xls.getCellData("LoginTest", j, i);
                //value = value + " ----" + value;
                //System.out.println(value + " -" + i + j);
                System.out.print(value + "|");

            }
            System.out.println();
        }



    }
}
