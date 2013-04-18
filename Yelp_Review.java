import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;



public class Yelp_Review {
	@SerializedName("business_id")
	public String business_id;
	
	@SerializedName("type")
	public String type;
	
	@SerializedName("date")
	public String date;
	
	@SerializedName("review_id")
	public String review_id;
	
	@SerializedName("user_id")
	public String user_id;
	
	@SerializedName("stars")
	public int stars;

	//@SerializedName("votes")
	//ArrayList<Attr> attrs;
	
	
	// get/set methods
	public String get_business_id() {
		return business_id;
	}
	public void set_business_id(String business_id) {
		this.business_id = business_id;
	}
	
	public String get_type() {
		return type;
	}
	public void set_type(String type) {
		this.type = type;
	}
	
	public String get_date() {
		return date;
	}
	public void get_date(String date) {
		this.date = date;
	}
	
	public String get_review_id() {
		return review_id;
	}
	public void get_review_id(String review_id) {
		this.review_id = review_id;
	}
	
	public String get_user_id() {
		return user_id;
	}
	public void get_user_id(String user_id) {
		this.user_id = user_id;
	}
	
	public int get_stars() {
		return stars;
	}
	public void set_stars(int stars) {
		this.stars = stars;
	}
	
	@Override
	public String toString() {
		return  "business_id: " + business_id + "\n" +
				"type_id: " + type + "\n" +
				"date: " + date + "\n" +
				"review_id: " + review_id + "\n" +
				"user_id: " + user_id + "\n" +
				"stars: " + stars + "\n";
	}
}