package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {
	
	@NotEmpty(message="Name can not be null or empty")
	@Size(min = 5, max = 30,message="no longer")
	private String name;
	
	@NotEmpty(message="Name can not be null or empty")
	@Email(message ="email no valid")
	private String email;
	
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
	private String mobileNumber;
	
	private AccountsDto accountsDto;

}
