import java.lang.StringBuffer;

public class TestProgram{
	public static void main(String[] s){
	
		String[] PRICECALC_ABBR = { "", "/container", "%", "/BL", "/kg", "/ton", "/CBM", "/package", "/WM",
			"/lb", "/AWB", "/MAB", "/MBF", "/MSF", "/unit", "", "", "", "", "/carton", "/day", "/hour", "/delivery", "/entry", "/pallet", "/shipment", "/LNM", "/SQM" };

        System.out.println(PRICECALC_ABBR[-1]);	
	}
}
