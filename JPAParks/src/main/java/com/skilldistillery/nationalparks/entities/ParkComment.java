package com.skilldistillery.nationalparks.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="park_comment")
public class ParkComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String content;
	@Column(name="created_at")
	@CreationTimestamp
	private LocalDateTime createdAt;
	private Boolean enabled;
//	private User user;
//	private Park park;
//	private ParkComment reply;
	
	public ParkComment() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Park getPark() {
//		return park;
//	}
//
//	public void setPark(Park park) {
//		this.park = park;
//	}
//
//	public ParkComment getReply() {
//		return reply;
//	}
//
//	public void setReply(ParkComment reply) {
//		this.reply = reply;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParkComment [id=");
		builder.append(id);
		builder.append(", content=");
		builder.append(content);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkComment other = (ParkComment) obj;
		return id == other.id;
	}
	
}
