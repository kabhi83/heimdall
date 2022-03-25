/**
 * 
 */
package home.ak.heimdall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import home.ak.heimdall.dto.request.RegistrationRequest;
import home.ak.heimdall.dto.response.RegistrationResponse;
import home.ak.heimdall.service.RegistrationService;

/**
 * @author kundu
 *
 */
@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;

	@PostMapping(value = "register", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RegistrationResponse regsiter(RegistrationRequest request) {
		return null;
	}

}
