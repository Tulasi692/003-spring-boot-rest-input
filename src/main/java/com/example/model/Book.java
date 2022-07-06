package com.example.model;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookCost;
	private List<String> authors;
	private Map<String,String> versions;
	private Publisher pob;

	
}
