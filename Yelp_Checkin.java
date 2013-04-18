import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Yelp_Checkin {
	@SerializedName("type")
	public String type;

	@SerializedName("business_id")
	public String business_id;

	@SerializedName("checkin_info")
	public Map<String, Integer> checkin_info;

	// const
	public Yelp_Checkin() {
	}

	// get/set methods
	public String get_type() {
		return type;
	}

	public void set_type(String type) {
		this.type = type;
	}

	public String get_business_id() {
		return business_id;
	}

	public void set_business_id(String business_id) {
		this.business_id = business_id;
	}

	public Map<String, Integer> get_checkin_info() {
		return checkin_info;
	}

	public void set_checkin_info(Map<String, Integer> checkin_info) {
		this.checkin_info = checkin_info;
	}

	@Override
	public String toString() {
		return "type: " + type + "\n" + "business_id: " + business_id + "\n"
				+ "checkin_info: " + checkin_info + "\n";
	}

}