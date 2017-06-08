package com.server.controller.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.server.model.location.Location;
import com.server.model.util.Status;
import com.server.services.location.LocationServices;

@Controller
@RequestMapping("/location")
public class LocationController {

	@Autowired
	LocationServices locationServices;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status add(@RequestBody Location location) {
		try {
			locationServices.addLocation(location);
			return new Status(1, "Record added!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Location get(@PathVariable("id") int id) {
		Location location = null;
		try {
			location = locationServices.getLocationbyId(id);
		} catch (Exception e) {
			System.out.println("id okuma hatası " + e.getMessage());

		}

		return location;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Location> gets() {
		List<Location> doList = null;
		try {
			doList = locationServices.getLocationList();
		} catch (Exception e) {
			System.out.println("listeleme hatası " + e.getMessage());

		}
		return doList;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status delete(@PathVariable("id") int id) {
		try {
			locationServices.deteleLocation(id);
			return new Status(1, "Record deleted!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status update(@PathVariable("id") int id, @RequestBody Location location) {
		try {
			locationServices.updateLocation(id, location);
			return new Status(1, "Kayıt güncelleme başarılı!");
		} catch (Exception e) {
			return new Status(0, e.getMessage());
		}
	}

}
