package productcrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrud.dao.ProductDao;
import productcrud.model.Product;

@Controller
public class MainController {

	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Product>list=productDao.getProducts();
		m.addAttribute("list", list);
		return "index";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "Add Products");
		return "addProductForm";
	}
	
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request)
	{
		productDao.createProduct(product);
		System.out.println(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete-product/{productId}")
	public RedirectView handleProduct(@PathVariable("productId") int id, HttpServletRequest request)
	{
		productDao.deleteProduct(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int id, Model m)
	{
		Product product=productDao.getProduct(id);
		m.addAttribute("id", id);
		m.addAttribute("product", product);
		return "updateForm";
	}
	
	@RequestMapping(path = "/update-product", method = RequestMethod.POST)
	public RedirectView updateForm(@ModelAttribute Product product, HttpServletRequest request)
	{
//		System.out.println(product);
		 	productDao.updateProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
