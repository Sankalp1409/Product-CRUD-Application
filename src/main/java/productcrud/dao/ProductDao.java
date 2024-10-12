package productcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import productcrud.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// create the product
	public void createProduct(Product product)
	{
		String query="insert into product values(?,?,?,?)";
		int result=jdbcTemplate.update(query, product.getId(),product.getName(),product.getDescription(),product.getPrice());
	}
	
	// get all product
	public List<Product> getProducts()
	{
		String query="select * from product";
		List<Product> list=jdbcTemplate.query(query, new RowMapperImplementation());
		return list;
	}
	
	// delete single product
	public void deleteProduct(int id)
	{
		String query="delete from product where id=?";
		int result=jdbcTemplate.update(query,id);
	}
	
	// get Single product
	public Product getProduct(int id)
	{
		String query="select * from product where id=?";
		Product product=jdbcTemplate.queryForObject(query, new RowMapperImplementation(),id);
		return product;
	}
	
	// update product
	public void updateProduct(Product product)
	{
		System.out.println("Product in Dao: "+product);
		String query="update product set name=?,description=?,price=? where id=?";
		jdbcTemplate.update(query,product.getName(),product.getDescription(),product.getPrice(),product.getId());
	}
}
