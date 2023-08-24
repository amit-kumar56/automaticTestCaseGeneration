package com.example.Amit.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


public class Sector
{
    private String id;
    private String name;
    private String description;
    
    
    public Sector(String id,  String name,  String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


/*
    @DBRef
    private List<Company> companies = new ArrayList<>();
*/
}
