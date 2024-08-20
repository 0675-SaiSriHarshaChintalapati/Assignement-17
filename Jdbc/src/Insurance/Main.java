package Insurance;

import java.sql.Connection;

class Main{
    public static void main(String[] args) {
        DbFunctions db=new DbFunctions();
        Connection conn=db.connect_to_db("Jdbc","postgres","root");
        //db.create_table(conn,"Employee");
        //db.insert_row(conn,"employee","Harsha","India");
       // db.readData(conn,"employee");
       // db.updateName(conn,"employee","Harsha","Har");
        //db.deleteRowByName(conn,"employee","Harsha");
        db.deleteTable(conn,"employee");


    }
}
