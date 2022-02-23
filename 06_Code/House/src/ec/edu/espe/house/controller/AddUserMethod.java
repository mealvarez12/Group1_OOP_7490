
package ec.edu.espe.house.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class AddUserMethod {
    
       
    MongoCollection<Document> User = new ConnectionToDB().getDB().getCollection("User");
    DefaultTableModel table = new DefaultTableModel() {
        
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
                
        public void view(){
           
            MongoCursor<Document> query = User.find().iterator();
            int total = table.getRowCount();
            for(int i = 0; i<total; i++){
                table.removeRow(0);
            }
            while(query.hasNext()){
                ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
                table.addRow(doc.toArray());
            }
        }
        
        public boolean Delete(String id){
        DeleteResult answer = User.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }
    
}
