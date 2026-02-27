import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class CRUD{
    // Instance Variable
    Connection con;
    Statement stmt;
    Scanner sc = new Scanner(System.in);
    public CRUD() throws SQLException{

        // Assigning all config to the variable

        String url = "jdbc:mysql://localhost:3306/javadatabase";
        String user = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating connection object
            con = DriverManager.getConnection(url, user, password);

            // Creating statement object 
            stmt = con.createStatement();
            System.out.println("Connected to MySQL!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readAll() throws SQLException{
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM product");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("price")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void read(){
        try{
            System.out.print("Enter the id: ");
            int id = sc.nextInt();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product where id = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("price"));
            }else{
                System.out.println("No record found!!");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(){
        try{
            System.out.print("Enter product id to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new product: ");
            String name = sc.next();
            System.out.print("Enter the price: ");
            int price = sc.nextInt();

            String sql = "UPDATE product SET name = ?, price = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, price);
            ps.setInt(3, id);

            int rowsAffected = ps.executeUpdate(); 

            if (rowsAffected > 0) {
            System.out.println("Product updated successfully!");
            } else {
            System.out.println("No product found with that ID.");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(){

        try{
            System.out.print("Enter Id to delete product: ");
            int id = sc.nextInt();
            String sql = "Delete from product where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate(); 
            if (rowsAffected > 0) {
            System.out.println("Product updated successfully!");
            } else {
            System.out.println("No product found with that ID.");
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

}

public class Main {
    public static void main(String[] args) throws SQLException {
        CRUD obj = new CRUD();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. ReadAll\n2. Read\n3. Update\n4. Delete\n5. Exit");
        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                obj.readAll();
                break;
            case 2:
                obj.read();
                break;
            case 3:
                obj.update();
                break;
            case 4:
                obj.delete();
                break;
            default:
                break;
        }

        sc.close();
    }
}


// To compile -> javac -cp "lib/mysql-connector-j-9.6.0.jar" -d bin src/*.java
// To Run -> java -cp "lib/mysql-connector-j-9.6.0.jar;bin" Main