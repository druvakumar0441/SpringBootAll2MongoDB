package com.example.springbootall.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "persons")
@Data
public class Persons {

    @Id
    private String id;
    private String pname;
    private String paddress;
    private String pqualification;
    private String pmobileNumber;
    private String ppancard;
    private String pgmail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPqualification() {
		return pqualification;
	}
	public void setPqualification(String pqualification) {
		this.pqualification = pqualification;
	}
	public String getPmobileNumber() {
		return pmobileNumber;
	}
	public void setPmobileNumber(String pmobileNumber) {
		this.pmobileNumber = pmobileNumber;
	}
	public String getPpancard() {
		return ppancard;
	}
	public void setPpancard(String ppancard) {
		this.ppancard = ppancard;
	}
	public String getPgmail() {
		return pgmail;
	}
	public void setPgmail(String pgmail) {
		this.pgmail = pgmail;
	}

    
}
