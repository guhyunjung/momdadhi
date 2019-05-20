package com.momdadhi.bbs.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "mdh", catalog = "")
public class UserEntity {
	private int seq;
	private String userid;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private Integer level;
	private Integer point;
	private String homepage;
	private String phone;
	private String birthday;
	private Timestamp regdate;
	private Timestamp uptdate;
	private String loginip;

	@Id
	@Column(name = "SEQ")
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Basic
	@Column(name = "USERID")
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Basic
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "NICKNAME")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Basic
	@Column(name = "LEVEL")
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Basic
	@Column(name = "POINT")
	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	@Basic
	@Column(name = "HOMEPAGE")
	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	@Basic
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic
	@Column(name = "BIRTHDAY")
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Basic
	@Column(name = "REGDATE")
	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	@Basic
	@Column(name = "UPTDATE")
	public Timestamp getUptdate() {
		return uptdate;
	}

	public void setUptdate(Timestamp uptdate) {
		this.uptdate = uptdate;
	}

	@Basic
	@Column(name = "LOGINIP")
	public String getLoginip() {
		return loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UserEntity that = (UserEntity) o;
		return seq == that.seq &&
				Objects.equals(userid, that.userid) &&
				Objects.equals(password, that.password) &&
				Objects.equals(email, that.email) &&
				Objects.equals(name, that.name) &&
				Objects.equals(nickname, that.nickname) &&
				Objects.equals(level, that.level) &&
				Objects.equals(point, that.point) &&
				Objects.equals(homepage, that.homepage) &&
				Objects.equals(phone, that.phone) &&
				Objects.equals(birthday, that.birthday) &&
				Objects.equals(regdate, that.regdate) &&
				Objects.equals(uptdate, that.uptdate) &&
				Objects.equals(loginip, that.loginip);
	}

	@Override
	public int hashCode() {
		return Objects.hash(seq, userid, password, email, name, nickname, level, point, homepage, phone, birthday, regdate, uptdate, loginip);
	}
}
