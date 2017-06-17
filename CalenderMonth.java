import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner s =new Scanner(System.in);
		String a =s.next();
		String[] part = a.split("-");
		String part1 =part[1];
		String m;
		switch (part1)
		{
		case "01":
		m ="January";
		break;
		case "02":
		m ="February";
		break;
		case "03":
		m="March";
		break;
		case "04":
		m="April";
		break;
		case "05":
		m="May";
		break;
		case "06":
		m="June";
		break;
		case "07":
		m = "July";
		break;
		case "08":
		m="August";
		break;
		case "09":
		m="September";
		break;
		case "10":
		m="October";
		break;
		case "11":
		m ="November";
		break;
		default:
		m ="December";
		break;
		
		}
		System.out.println(m);
	}
}
