package com.server.services.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.dao.location.LocationDao;
import com.server.model.location.Location;

public class LocationServices {

	@Autowired
	LocationDao locationDao;

	public Location addLocation(Location location) throws Exception {
		// TODO Auto-generated method stub
		return locationDao.addLocation(location);
	}

	public Location getLocationbyId(int id) throws Exception {
		// TODO Auto-generated method stub
		return locationDao.getLocationbyId(id);
	}

	public List<Location> getLocationList() throws Exception {
		// TODO Auto-generated method stub
		return locationDao.getLocationList();
	}

	public boolean deteleLocation(int id) throws Exception {
		// TODO Auto-generated method stub
		return locationDao.deteleLocation(id);
	}

	public boolean updateLocation(int id, Location location) throws Exception {
		// TODO Auto-generated method stub
		return locationDao.updateLocation(id, location);
	}

}
