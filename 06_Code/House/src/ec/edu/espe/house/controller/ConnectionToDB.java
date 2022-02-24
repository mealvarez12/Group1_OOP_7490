
package ec.edu.espe.house.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class ConnectionToDB {
          
        ConnectionString connectionString = new ConnectionString("mongodb+srv://andersmn:andersmn@clusteroop.3poht.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Home");   
    
    
            public MongoDatabase getDB(){
                return database;
            }
           
}
