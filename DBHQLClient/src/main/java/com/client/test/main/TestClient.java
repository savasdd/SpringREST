package com.client.test.main;

import com.client.model.document.Document;
import com.client.model.link.Link;
import com.client.model.location.Location;
import com.client.model.phrase.Phrase;
import com.client.model.scope.Scope;
import com.client.model.user.User;
import com.client.test.document.TestDocument;
import com.client.test.link.TestLink;
import com.client.test.location.TestLocation;
import com.client.test.phrase.TestPhrase;
import com.client.test.scope.TestScope;
import com.client.test.user.TestUser;

public class TestClient {

	// TERİMANL: tail -f /home/masallah/JavaEE/log/springrs_hibernate_log

	static TestDocument testDocument = new TestDocument();
	static TestLink testLink = new TestLink();
	static TestLocation testLocation = new TestLocation();
	static TestUser testUser = new TestUser();
	static TestScope testScope = new TestScope();
	static TestPhrase testPhrase = new TestPhrase();

	public static void main(String[] args) throws Exception {

		User user = new User("T", "U", "R", "P", "Email", false);
		Document document = new Document(20, "SVN");
		Location location = new Location("Location1", null, 0, 0, false, false, document);
		Phrase phrase = new Phrase("Phrase1", null);
		Scope scope = new Scope("scope", location);
		Link link = new Link(true, "savas", location, location, phrase);

		 //testDocument.listDocument();
		 testLink.listLink();
		 //testLocation.listLocation();
		 //testUser.listUser();
		 //testScope.listScope();
		 //testPhrase.listPhrase();

		
		//testLink.addLink(link);

		Document document2 = testDocument.getDocumentbyId(34);
		document2.setDocumentContent("GIT");
		//testDocument.updateDocument(document2);
		//testDocument.deleteDocument(34);


	}

}
