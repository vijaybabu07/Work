package com.eiq.mongo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DDT_Mongo {

	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("10.15.1.38", 27017);

		// Creating Credentials
		/*
		 * MongoCredential credential; credential =
		 * MongoCredential.createCredential("sampleUser", "myDb",
		 * "password".toCharArray());
		 */
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("svcentral");

		// Creating a collection
		// System.out.println("Collection created successfully");

		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("s3_access_details");
		System.out.println("Collection myCollection selected successfully");
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;

		// Getting the iterator
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			Document doc = (Document) it.next();
			System.out.println(doc);
			// System.out.println(doc.get("aws_region"));
			i++;
		}
	}
}
