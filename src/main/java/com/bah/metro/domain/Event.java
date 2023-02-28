package com.bah.metro.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="events")
public class Event {
		
		@Id
		public long id;
				
		public String code;
		
		public String title;
		
		public String description;


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		@Override
		public String toString() {
			return "Event [id=" + id + ", code=" + code + ", title=" + title + ", description=" + description + "]";
		}

	}


