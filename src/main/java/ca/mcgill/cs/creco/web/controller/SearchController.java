package ca.mcgill.cs.creco.web.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.mcgill.cs.creco.web.model.ProductListVO;
import ca.mcgill.cs.creco.web.model.ProductVO;


@Controller
@RequestMapping("/")
public class SearchController
{
	private static final Logger LOG = LoggerFactory.getLogger(SearchController.class);
	
	
	@Autowired
	private ProductListVO productList;
		
	@RequestMapping(method = RequestMethod.GET)
	
	public String getCurrentProductList(Model model) {
		LOG.debug("Get Current Products");
		fillProducts();
		return "/search";
	}
			
	private void fillProducts() {
		ArrayList<ProductVO> products = new ArrayList<ProductVO>();		
		for (int i = 0; i < 5; i++) {
			ProductVO p = new ProductVO();
			p.setId(String.valueOf(i));
			p.setName("Product " + i);
			products.add(p);
		}
		productList.setProducts(products);		
	}
	
	@ModelAttribute("productList")
	private ProductListVO getProductList() {
		return productList;
	}


}
