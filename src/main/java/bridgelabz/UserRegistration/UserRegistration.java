/**
 * Purpose:User Registration System needs to ensure all validations
	are in place during the User Entry
 * @author Ananya K
 * @version 1.0
 * @since 18/06/2021
 * 
 */
package bridgelabz.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	private static final Logger LOG = LogManager.getLogger(UserRegistration.class);

	/**
	 * This method validates first name, last name,phone number,email,password. it
	 * uses the switch statement to select the regex required for validation.
	 * 
	 * @param name
	 * @param field
	 * @return
	 * @throws Exception
	 */
	public boolean validate(String name, InputField field) throws UserRegistrationException {
		try {
			String regex = null;
			if (null != field) {
				switch (field) {
				case FIRST_NAME:
					regex = "[A-Z]{1}[a-z]{2,}";
					break;
				case LAST_NAME:
					regex = "[A-Z]{1}[a-z]{2,}";
					break;
				case EMAIL:
					regex = "^[a-zA-Z0-9]+(.?)[a-zA-Z0-9]+@+[a-zA-Z0-9]+(.+)[a-zA-Z0-9]+(.*)[a-zA-Z]{2,}$";
					break;
				case PHONE_NO:
					regex = "[9]{1}[1]{1}+\s{1}+[0-9]{10}";
					break;
				case PASSWORD:
					regex = "^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$)(?=.*[a-z])(?=[^\\p{Punct}]*[\\p{Punct}][^\\p{Punct}]*$).{8,}$";
					break;
				}
				Pattern p = Pattern.compile(regex);
				if (name == null) {
					return false;
				}
				Matcher m = p.matcher(name);
				String result = m.matches() ? field.name() + " " + name + " is valid"
						: field.name() + " " + name + " is not valid";
				if (!m.matches()) {
					throw new UserRegistrationException(result);
				}
				LOG.debug(result);
				return m.matches();
			}
			return false;
		} catch (Exception e) {
			throw new UserRegistrationException(e.getMessage());
		}

	}
}
