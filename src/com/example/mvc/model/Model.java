package com.example.mvc.model;

import com.example.mvc.resource.Resource;

public interface Model {
	public boolean ifExists(Resource resource);
	public boolean add(Resource resource);
	public void reset();
}
