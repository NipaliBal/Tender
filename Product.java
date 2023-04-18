package com.tender.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pid;
	@Column(name="p_name",length=22,nullable=false)
	private String pName;
	@Column(name="quant",nullable=false)
	private long quant;
	@Column(name="p_name",length=22,nullable=false)
	private String quality;
	@Lob
	@Column(name = "imagedata")
    private byte[] imageData;
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getQuant() {
		return quant;
	}
	public void setQuant(long quant) {
		this.quant = quant;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
}
