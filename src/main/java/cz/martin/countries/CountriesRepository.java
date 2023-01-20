package cz.martin.countries;

import tech.tablesaw.plotly.components.Line;

import java.sql.*;
import java.util.List;

public class CountriesRepository {
    public List<CountriesRepository> getEuropeanCountriesGdp() {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/superhero?user=root&password=password");
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("""
                SELECT 
""")
                ) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
