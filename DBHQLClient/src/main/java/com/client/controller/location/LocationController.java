package com.client.controller.location;

import java.util.List;

import com.client.controller.rest.Template;
import com.client.model.location.Location;
import com.client.util.Status;
import com.client.util.URI;

public class LocationController {

	Template template = new Template();

	public void addLocation(Location location) throws Exception {

		Status status = template.getRest().postForObject(URI.SERVER_URI + URI.CREATE_LOCATION, location, Status.class);
		System.out.println(status.getMesaj());

	}

	public Location getLocationbyId(int id) throws Exception {

		Location location = template.getRest().getForObject(URI.SERVER_URI + "/location/" + id, Location.class);
		return location;
	}

	@SuppressWarnings("unchecked")
	public List<Object> getLocationList() throws Exception {
		List<Object> list = template.getRest().getForObject(URI.SERVER_URI + URI.GET_ALL_LOCATION, List.class);
		return list;
	}

	public void deteleLocation(int id) throws Exception {

		Status status = template.getRest().getForObject(URI.SERVER_URI + "/location/delete/" + id, Status.class);
		System.out.println(status.getMesaj());

	}

	public void putLocation(int id, Location location) throws Exception {
		template.getRest().put(URI.SERVER_URI + "/location/update/" + id, location);
	}

}
