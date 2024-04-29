package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class AccountsDto {
	
	@NotEmpty(message=" accountNumber not emtpy")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private Long accountNumber;
	
	@NotEmpty(message=" accountType not emtpy")
    private String accountType;
	
	@NotEmpty(message=" branchAddress not emtpy")
    private String branchAddress;
    
   
	

}
