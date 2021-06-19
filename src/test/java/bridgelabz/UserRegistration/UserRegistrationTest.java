package bridgelabz.UserRegistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class UserRegistrationTest {
	UserRegistration userRegistration;

	@Before
	public void init() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void validate_shouldReturnFalseWhenNameAndFieldAreNull() {
		boolean result = userRegistration.validate(null, null);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenNameIsNull() {
		boolean result = userRegistration.validate(null, InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenFirstNameStartsWithCaps() {
		boolean result = userRegistration.validate("Ananya", InputField.FIRST_NAME);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenFirstNameNotStartsWithCaps() {
		boolean result = userRegistration.validate("ananya", InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenFirstNameHasLessThanThreeChars() {
		boolean result = userRegistration.validate("An", InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenFirstNameHasThreeChars() {
		boolean result = userRegistration.validate("Ana", InputField.FIRST_NAME);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenFirstNameHasMoreThanThreeChars() {
		boolean result = userRegistration.validate("Anany", InputField.FIRST_NAME);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenFirstNameHasDigits() {
		boolean result = userRegistration.validate("Anany1", InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenFirstNameHasSpecialChars() {
		boolean result = userRegistration.validate("Anany@", InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenFirstNameHasSpace() {
		boolean result = userRegistration.validate("An any@", InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenFirstNameHasMoreThanOneCaps() {
		boolean result = userRegistration.validate("AnAany", InputField.FIRST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameIsNull() {
		boolean result = userRegistration.validate(null, InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenLastNameStartsWithCaps() {
		boolean result = userRegistration.validate("Ananya", InputField.LAST_NAME);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameNotStartsWithCaps() {
		boolean result = userRegistration.validate("ananya", InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameHasLessThanThreeChars() {
		boolean result = userRegistration.validate("An", InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenLastNameHasThreeChars() {
		boolean result = userRegistration.validate("Ana", InputField.LAST_NAME);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenLastNameHasMoreThanThreeChars() {
		boolean result = userRegistration.validate("Anany", InputField.LAST_NAME);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameHasDigits() {
		boolean result = userRegistration.validate("Anany1", InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameHasSpecialChars() {
		boolean result = userRegistration.validate("Anany@", InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameHasSpace() {
		boolean result = userRegistration.validate("An any@", InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenLastNameHasMoreThanOneCaps() {
		boolean result = userRegistration.validate("AnAany", InputField.LAST_NAME);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenPhoneNumHasTwoDigitCountryCode() {
		boolean result = userRegistration.validate("91 1234566789", InputField.PHONE_NO);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenPhoneNumHasTwoDigitCountryCodeFollowedBySpace() {
		boolean result = userRegistration.validate("91 1234566789", InputField.PHONE_NO);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenPhNoHasTwoDigitCountryCodeFollowedBySpaceAndTenDigitPhNo() {
		boolean result = userRegistration.validate("91 1234566789", InputField.PHONE_NO);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasTwoDigitCountryCodeNoSpaceAndTenDigitPhNo() {
		boolean result = userRegistration.validate("911234566789", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasTwoDigitCountryCodeSpaceAndLessThanTenDigitPhNo() {
		boolean result = userRegistration.validate("91 12345667", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasTwoDigitCountryCodeSpaceAndMoreThanTenDigitPhNo() {
		boolean result = userRegistration.validate("91 123456672345", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasMoreThanTwoDigitCountryCode() {
		boolean result = userRegistration.validate("912 123456672345", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasLessThanTwoDigitCountryCode() {
		boolean result = userRegistration.validate("9 123456672345", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasNoTwoDigitCountryCode() {
		boolean result = userRegistration.validate(" 123456672345", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasOnlyCountryCode() {
		boolean result = userRegistration.validate("91", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasNoCountryCode() {
		boolean result = userRegistration.validate("9134567890", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasAlpha() {
		boolean result = userRegistration.validate("91as567890", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasSpecialChars() {
		boolean result = userRegistration.validate("91@#567890", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPhNoHasSpaceInBetween() {
		boolean result = userRegistration.validate("91 1234 567890", InputField.PHONE_NO);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenPasswordHasMinOneUpperLowerDigitSpecialCharAndEightChars() {
		boolean result = userRegistration.validate("Anany12@q", InputField.PASSWORD);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasMinOneUpperLowerDigitSpecialCharAndLessThanEightChars() {
		boolean result = userRegistration.validate("Anny12@", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenPasswordHasMinOneUpperLowerDigitSpecialCharAndMoreThanEightChars() {
		boolean result = userRegistration.validate("Anny12@qwert", InputField.PASSWORD);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenPasswordHasMoreThanOneUpperLowerDigitAndOneSpecialCharAndMoreThanEightChars() {
		boolean result = userRegistration.validate("Anny12K@qwert", InputField.PASSWORD);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasNoUpper() {
		boolean result = userRegistration.validate("nny12@qwert", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasNoLower() {
		boolean result = userRegistration.validate("ASD123$TYK", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasNoNumber() {
		boolean result = userRegistration.validate("ASDasd$TYK", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasNoSpecialChar() {
		boolean result = userRegistration.validate("ASDasd8TYK", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasMoreThanOneSpecialChar() {
		boolean result = userRegistration.validate("AS&as%8TYK", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenPasswordHasSpace() {
		boolean result = userRegistration.validate("AS as%8TYK", InputField.PASSWORD);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailDomainStartsWithDot() {
		boolean result = userRegistration.validate("abc@.com.my", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailHasMoreThanTwoConsecutiveDots() {
		boolean result = userRegistration.validate("abc..2002@gmail.com", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnTrueWhenEmailMustContainAmpersand() {
		boolean result = userRegistration.validate("abc@yahoo.com", InputField.EMAIL);
		assertTrue(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailPartOfDomainAfterLastDotHasDigits() {
		boolean result = userRegistration.validate("abc@gmail.com.1a", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailPartOfDomainAfterLastDotMustBeTwoChars() {
		boolean result = userRegistration.validate("abc123@gmail.a", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailFirstCharCannotStartWithDot() {
		boolean result = userRegistration.validate(".abc@abc.com", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailAllowOnlyCharDigitUnderscoreAndDash() {
		boolean result = userRegistration.validate("abc()*@gmail.com", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailTldAllowsOnlyCharAndDigit() {
		boolean result = userRegistration.validate("abc@%*.com", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailsLastCharCannotEndWithDot() {
		boolean result = userRegistration.validate("abc.@gmail.com", InputField.EMAIL);
		assertFalse(result);
	}

	@Test
	public void validate_shouldReturnFalseWhenEmailCannotHaveMultipleTlds() {
		boolean result = userRegistration.validate("abc@gmail.com.aa.au ", InputField.EMAIL);
		assertFalse(result);
	}
}
