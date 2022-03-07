package excelread;

import java.io.FileInputStream;

public class ExcelCode 
{
static FileInputStream file;
static XSSFWorkbook w;
static XSSFSheet sh;
public static void readStringData(int i,int j)
{
	file=new FileInputStream();
	w=new XSSFWorkbook(file);
	sh=w.getSheet(Sheet1);
	Row r=sh.getRow(i);
}
}
