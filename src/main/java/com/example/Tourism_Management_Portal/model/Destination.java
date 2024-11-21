package com.example.Tourism_Management_Portal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;


@Entity
//@Table(schema = "rma", name = "client_master")
public class Destination {

	@Id
	private Long id;
	private String name;
	private String description;
	private String image;
	private String category;
	private String createby;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date createdt;
	private String modby;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date moddt;
	private Character activeflag;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public Date getCreatedt() {
		return createdt;
	}
	public void setCreatedt(Date createdt) {
		this.createdt = createdt;
	}
	public String getModby() {
		return modby;
	}
	public void setModby(String modby) {
		this.modby = modby;
	}
	public Date getModdt() {
		return moddt;
	}
	public void setModdt(Date moddt) {
		this.moddt = moddt;
	}
	public Character getActiveflag() {
		return activeflag;
	}
	public void setActiveflag(Character activeflag) {
		this.activeflag = activeflag;
	}
	
	
	

}
