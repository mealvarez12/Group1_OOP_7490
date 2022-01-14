
package ec.edu.espe.house.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Connection {
    
    // COPIAR AQUI EL CODIGO
      
ConnectionString connectionString = new ConnectionString("mongodb+srv://asde2:AlE_12AlE@clusteroop.ofume.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("UserListSmartHome");

 
    
    public MongoDatabase obtenerDB(){
        return database;
        
    }
}
