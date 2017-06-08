package com.client.test.location;

import java.util.List;

import com.client.controller.location.LocationController;
import com.client.model.location.Location;

public class TestLocation {

	LocationController locationController = new LocationController();

	public void listLocation() throws Exception {
		List<Object> list3 = locationController.getLocationList();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
	}

	public void addLocation(Location location) throws Exception {
		locationController.addLocation(location);
	}

	public void updateLocation(int id, Location location) throws Exception {
		locationController.putLocation(id, location);
	}

	public void deleteLocation(int id) throws Exception {
		locationController.deteleLocation(id);
	}

}
