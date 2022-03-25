/**
 * 
 */
package home.ak.heimdall.dto.request;

import lombok.Data;

/**
 * @author kundu
 *
 */
@Data
public class RegistrationRequest {
	
	private String name;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private String country = "India";
	
	private String countryCode = "IN";
	
	

}
