package carmelo.spring.jpa.dao;

import carmelo.spring.jpa.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("productDaoJdbc")
public class ProductDaoImpl implements ProductDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Product> todos() {
        String sql = "select * from product";
        return this.jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product p = new Product();
                p.setId(rs.getInt("ID"));
                p.setName(rs.getString("NAME"));
                p.setPrice(rs.getDouble("PRICE"));
                return p;
            }
        });
    }

    @Override
    public Integer cantidad() {
        String sql = "select count(*) from product";
        return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Product buscar(Integer id) {
        String sql = "select * from product where ID = ?";
        return this.jdbcTemplate.queryForObject(sql, new ProductRowMapper(), id);
    }

    @Override
    public void insertar(Product product) {
        String sql = "insert into product (ID, NAME, PRICE) values (?, ?, ?)";
        this.jdbcTemplate.update(sql,
                product.getId(),
                product.getName(),
                product.getPrice());
    }

    @Override
    public void actualizar(Product product) {
        String sql = "update product set NAME = ?, PRICE = ? where ID = ?";
        this.jdbcTemplate.update(sql,
                product.getName(),
                product.getPrice(),
                product.getId());
    }

    @Override
    public void eliminar(Integer id) {
        String sql = "delete from product where ID = ?";
        this.jdbcTemplate.update(sql, id);
    }

    class ProductRowMapper implements RowMapper<Product> {

        @Override
        public Product mapRow(ResultSet rs, int i) throws SQLException {
            Product p = new Product();
            p.setId(rs.getInt("ID"));
            p.setName(rs.getString("NAME"));
            p.setPrice(rs.getDouble("PRICE"));
            return p;
        }

    }

}
