import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DriverClass
{
	static String recieptFile="receiptFile.txt",line=null;
	static int count=0, maxCount;
	static PrintWriter textStream = textfile.createTextWrite(recieptFile);
	public static void main(String[]args)
	{	//go to food item class for menu which comes from category classes
		//
		//then goto the gui and collect food order and add on to the orders or delete or search
		//order is then written into a file
		// store it into linked list classes? 
		//CategoryList ll = new CategoryList();
		//d.update();
		//GUIClass.Update button = d.new Update();
		DriverClass D= new DriverClass();
		DriverClass.foodGUI food = D.new foodGUI();
	}
	public class foodGUI
	{
		foodGUI()
		{
			System.out.println("foodGUI");
			GUIClass d= new GUIClass();
			d.Search();
		}
	}
	public static class textfile
	{

		textfile()
		{//build food
			maxCount=count;
			System.out.println("textfile method");
			Scanner scanFile= textfile.createTextRead(recieptFile);
			for(count=1;count< maxCount;count++)//fix limit
			{
				System.out.println("count= "+count);
				count=scanFile.nextInt();
				line = scanFile.nextLine();
				if(line==null)
				{
					DriverClass D= new DriverClass();
					DriverClass.excelfile food = D.new excelfile();
				}
				System.out.println(count + line);
			}scanFile.close();
			//GUIClass d= new GUIClass();
			//GUIClass.buttonAction button = d.new buttonAction();
			//scanFile.close();
		}
		public static PrintWriter createTextWrite(String S)
		{
			//textStream.close();
			PrintWriter TStream=null;
			try
			{
				TStream= new PrintWriter(new FileOutputStream(S));
			}
			catch(FileNotFoundException e)
			{
				System.out.println("Error opening the file in createTextWrite "+S.toString());
			}
			return TStream;
		}
		public static Scanner createTextRead(String S)
		{
			Scanner textFile=null;
			try 
			{
				textFile= new Scanner(new FileInputStream(new File(S)));
			}
			catch(FileNotFoundException e)
			{
				System.out.println("file not found "+S.toString());
				System.out.println("or could not be opened. "+S.toString());
			}
			return textFile;
		}
	}
	public class excelfile
	{
		excelfile(){System.out.println("excelfilemethod");}
	/*//Driverclass()
	//public class excelfile{
		//excelfile(){
			//public class ReadExcel {
				@SuppressWarnings({ "unchecked", "unchecked" })
				//public static void main(String[] args) throws Exception {
					// An excel file name. You can create a file name with a full
					// path information.
					//C:\Users\tkanchanawanchai6403\Documents
					String filename = "Files\\test.xls";

					//
					// Create an ArrayList to store the data read from excel sheet.
					//
					List sheetData = new ArrayList();
					FileInputStream fis = null;
					try {
						//
						// Create a FileInputStream that will be use to read the
						// excel file.
						//
						fis = new FileInputStream(filename);

						//
						// Create an excel workbook from the file system.
						//
						HSSFWorkbook workbook = new HSSFWorkbook(fis);
						//
						// Get the first sheet on the workbook.
						//
						HSSFSheet sheet = workbook.getSheetAt(0);

						//
						// When we have a sheet object in hand we can iterator on
						// each sheet's rows and on each row's cells. We store the
						// data read on an ArrayList so that we can printed the
						// content of the excel to the console.
						//
						Iterator rows = sheet.rowIterator();
						while (rows.hasNext()) {
							HSSFRow row = (HSSFRow) rows.next();
							Iterator cells = row.cellIterator();

							List data = new ArrayList();
							while (cells.hasNext()) {
								HSSFCell cell = (HSSFCell) cells.next();
								data.add(cell);
							}

							sheetData.add(data);
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						if (fis != null) {
							fis.close();
						}
					}

					showExcelData(sheetData);
				}

				private static void showExcelData(List sheetData) {
					//
					// Iterates the data and print it out to the console.
					//
					for (int i = 0; i < sheetData.size(); i++) {
						List list = (List) sheetData.get(i);
						for (int j = 0; j < list.size(); j++) {
							Cell cell = (Cell) list.get(j);
							if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
								System.out.print(cell.getNumericCellValue());
							} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
								System.out.print(cell.getRichStringCellValue());
							} else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
								System.out.print(cell.getBooleanCellValue());
							}
							if (j < list.size() - 1) {
								System.out.print(", ");
							}
						}
						System.out.println("");
					}
				}
			}*/
			
		}
	}
