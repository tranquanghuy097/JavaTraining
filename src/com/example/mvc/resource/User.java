package com.example.mvc.resource;

public class User implements Resource {
	private String name;
	private String hashedPassword;

	public User(String name, String hashedPassword) {
		this.name = name;
		StringBuilder stringBuilder = new StringBuilder(hashedPassword);
		this.hashedPassword = stringBuilder.append("a").toString();
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}

		if (!(object instanceof User)) {
			return false;
		}

		User user = (User) object;

		return user.getName().equals(this.name) && user.getHashedPassword().equals(this.hashedPassword);
	}

	public String getName() {
		return name;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}
}
