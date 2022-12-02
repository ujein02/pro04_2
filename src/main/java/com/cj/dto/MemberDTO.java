package com.cj.dto;

import lombok.Data;

@Data
public class MemberDTO {
	private String id; 
	private String pw;  
	private String name;
	private String email;
	private String tel; 
	private String addr1;
	private String addr2;
	private String postcode;
	private String regdate;
	private String birth;
	private int pt;
	private int visited;
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", tel=" + tel
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", postcode=" + postcode + ", regdate=" + regdate
				+ ", birth=" + birth + ", pt=" + pt + ", visited=" + visited + "]";
	}
}
