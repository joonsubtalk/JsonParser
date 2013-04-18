/* 
 * Just a simple parsing Demo
 * 4/17/13
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
import com.google.gson.Gson;

public class JsonParseDemo {
	private static final String jsonFilePath = 
			"/Users/santoki/yelp/yelp_phoenix_academic_dataset/yelp_academic_dataset_review.json";
			// Should replace with relative location
	
	public static void main(String[] args) throws Exception{

		String json_String = "";
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader(jsonFilePath));
			Gson gson = new Gson();
		    
			while ((json_String = br.readLine()) != null) {
				Yelp_Review yp = gson.fromJson(json_String, Yelp_Review.class);
				System.out.println(yp.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null){
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}// End Main
}// Class End