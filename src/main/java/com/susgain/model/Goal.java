package com.susgain.model;

import java.sql.Blob;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Goal {
	
	private int id;
	private String name;
	private String description;
	private Blob image;
	private RedemptionItem redemptionItem;
	private double redemptionCost;

}
