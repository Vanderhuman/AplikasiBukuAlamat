
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseSetup {
 public static void main(String[] args) {
 String sql = "CREATE TABLE IF NOT EXISTS bukuAlamat ("
 + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
 + "nama TEXT NOT NULL,"
 + "telepon TEXT NOT NULL,"
 + "email TEXT NOT NULL,"
 + "alamat TEXT NOT NULL"
 + ");";
 try (Connection conn = DatabaseConnection.getConnection();
 Statement stmt = conn.createStatement()) {
 stmt.execute(sql);
 System.out.println("Tabel 'bukuAlamat' berhasil dibuat atau sudah ada.");
 } catch (SQLException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}

