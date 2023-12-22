import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args) {
		
		//print no. of courses
		JsonPath js = new JsonPath(Payload.CoursePrice());
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//print purchaseAmount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//print title of 1st course
		String titlefirstCourse = js.get("courses[0].title");
		System.out.println(titlefirstCourse);
		
		//print all course title and its prices
		
		for ( int i=0; i<count; i++)
		{
						String title = js.get("courses["+i+"].title");
						System.out.println(js.get("courses["+i+"].price").toString());
						System.out.println(title);
		}
	}

}
