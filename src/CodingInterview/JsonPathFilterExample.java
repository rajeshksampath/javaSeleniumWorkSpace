package CodingInterview;

public class JsonPathFilterExample {
    public static void main(String[] args) {
        // JSON string
        String jsonString = "
        [
            {
                "name": "Alice",
                "age": 25,
                "occupation": "Software engineer"
            },
            {
                "name": "Bob",
                "age": 30,
                "occupation": "Data scientist"
            },
            {
                "name": "Carol",
                "age": 35,
                "occupation": "Product manager"
            }
        ]
        ";

        // Parse the JSON string into a Java object
        Object json = JsonPath.parse(jsonString);

        // Get all people who are older than 25
        List<Object> peopleOver25 = JsonPath.read(json, "$.[?(@.age > 25)]");

      
        // Print the names of the people who are older than 25
        for (Object person : peopleOver25) {
            System.out.println(JsonPath.read(person, "$.name"));
        }
    }
}