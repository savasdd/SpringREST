package com.server.dao.location;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.server.model.location.Location;
import com.server.session.JpaEntityManagerFactory;

public class LocationDao {

	@Autowired
	JpaEntityManagerFactory factory;

	public Location addLocation(Location location) throws Exception {
		factory.open();
		factory.begin();
		factory.manager.persist(location);
		factory.commit();
		factory.close();

		return location;
	}

	public Location getLocationbyId(int id) throws Exception {
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Location> getLocationList() throws Exception {
		factory.open();
		Query query = factory.manager.createQuery("Select u From Location u");
		List<Location> locations = query.getResultList();
		return locations;
	}

	public boolean deteleLocation(int id) throws Exception {

		factory.open();
		Location location = factory.manager.find(Location.class, id);
		factory.begin();
		factory.manager.remove(location);
		factory.commit();
		factory.close();

		return false;
	}

	public boolean updateLocation(int id, Location location) throws Exception {

		return false;
	}

}
