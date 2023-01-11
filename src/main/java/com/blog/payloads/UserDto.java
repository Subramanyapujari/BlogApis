package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.blog.entity.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min = 2,message = "name must be greater than 2 character")
	private String name;
	@Email(message = "please enter valid email id")
	private String email;
	@NotEmpty
	@Size(min = 4,max = 10,message = "password must be minimum 4 character and maximum 8 character")
	private String password;
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();

}
