package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CategoryDto {

	private Integer categoryId;
	@NotBlank
	@Size(min = 2,message = "category title should be more then 2 character")
	private String categoryTitle;
	@NotBlank
	@Size(min = 10,message = "category description should be more then 10 character")
	private String categoryDescription;
}
