import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KontakDAO {
// Method untuk mengambil semua data kontak di tabel
public List<Kontak> getAllContacts() throws SQLException {
    List<Kontak> contacts = new ArrayList<>();
    String sql = "SELECT * FROM bukuAlamat";
    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Kontak contact = new Kontak(
                rs.getInt("id"),
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("email"),
                rs.getString("alamat")
            );
            contacts.add(contact);
        }
    }
    return contacts;
}

// Method untuk menambahkan kontak ke tabel
public void addContact(Kontak contact) throws SQLException {
    String sql = "INSERT INTO bukuAlamat (nama, telepon, email, alamat) VALUES (?, ?, ?, ?)";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, contact.getNama());
        pstmt.setString(2, contact.getNomorTelepon());
        pstmt.setString(3, contact.getEmail());
        pstmt.setString(4, contact.getAlamat());
        pstmt.executeUpdate();
    }
}

// Method untuk mengupdate kontak ke tabel
public void updateContact(Kontak contact) throws SQLException {
    String sql = "UPDATE bukuAlamat SET nama = ?, telepon = ?, email = ?, alamat = ? WHERE id = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, contact.getNama());
        pstmt.setString(2, contact.getNomorTelepon());
        pstmt.setString(3, contact.getEmail());
        pstmt.setString(4, contact.getAlamat());
        pstmt.setInt(5, contact.getId());
        pstmt.executeUpdate();
    }
}

// Method untuk menghapus kontak di tabel
public void deleteContact(int contactId) throws SQLException {
    String sql = "DELETE FROM bukuAlamat WHERE id = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, contactId);
        pstmt.executeUpdate();
    }
}

// Method untuk mencari kontak di tabel
public List<Kontak> searchContacts(String keyword) throws SQLException {
    List<Kontak> contacts = new ArrayList<>();
    String sql = "SELECT * FROM bukuAlamat WHERE nama LIKE ? OR telepon LIKE ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, "%" + keyword + "%");
        pstmt.setString(2, "%" + keyword + "%");

        try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Kontak contact = new Kontak(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("telepon"),
                    rs.getString("email"),
                    rs.getString("alamat")
                );
                contacts.add(contact);
            }
        }
    }
    return contacts;
}

// Method untuk memeriksa nomor telepon duplikat
public boolean isDuplicatePhoneNumber(String nomorTelepon, Integer excludeId) throws SQLException {
    String sql = "SELECT COUNT(*) FROM bukuAlamat WHERE telepon = ?";
    if (excludeId != null) {
        sql += " AND id != ?";
    }

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, nomorTelepon);
        if (excludeId != null) {
            pstmt.setInt(2, excludeId);
        }

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                // Jika COUNT > 0, berarti nomor telepon sudah ada
                return true;
            }
        }
    }
    return false;
}

}
