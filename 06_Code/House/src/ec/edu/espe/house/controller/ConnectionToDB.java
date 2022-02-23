
package ec.edu.espe.house.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class ConnectionToDB {
          
        ConnectionString connectionString = new ConnectionString("mongodb+srv://mealvarez:mealvarez@clusteroop.09ypc.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("UserListSmartHome");   
    
    
            public MongoDatabase getDB(){
                return database;
            }
           
}
