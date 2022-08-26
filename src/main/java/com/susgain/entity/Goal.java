package com.susgain.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GOAL")
public class Goal {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
	private int id;

    @Column(name="NAME")
	private String name;

    @Column(name="DESCRIPTION")
	private String description;

    @Column(name="IMAGE")
	private Blob image;
    
    @Column(name= "REDEMPTION_ITEM")
	private int redemptionItem;

    @Column(name="REDEMPTION_COST")
	private double redemptionCost;

}
