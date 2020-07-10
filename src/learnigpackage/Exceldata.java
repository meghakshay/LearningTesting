package learnigpackage;

public class Exceldata {

	public static void main(String[] args) {
		DataFile dataobj = new DataFile();
		String ROW1_CELL1= dataobj.Exceldata("sheet1", 1, 0);
		String ROW1_CELL2= dataobj.Exceldata("sheet1", 1, 1);
		System.out.println(ROW1_CELL1);
		System.out.println(ROW1_CELL2);

	}

}
