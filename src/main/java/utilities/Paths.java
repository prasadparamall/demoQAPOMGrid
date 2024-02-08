package utilities;

public interface Paths {
		
		String config = System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties";
	    
		//String excel = System.getProperty("user.dir") + "\\src\\main\\java\\testdata\\makemytrip_data.xlsx";

	String excel =  System.getProperty("user.dir")+ "\\src\\main\\java\\testdata\\demoQA_Data.xlsx";
	    
	    String table = "//table[@class='table table-dark table-striped table-bordered table-hover']//tr";
		
		String table1 = "//table[@class='table table-dark table-striped table-bordered table-hover']//tr[1";
		String table2 = "]//th";
		String table3 = "//table[@class='table table-dark table-striped table-bordered table-hover']//tr[";
		String table4 = "]//td";
		
		String table5 = "//div[@class='rt-table']/div[2]/div[";
		String table6 = "]/div/div";
		
		String pic = System.getProperty("user.dir") + "\\src\\main\\java\\testdata\\abc.jpg";


	

}
