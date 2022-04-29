package BHNStore.Controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import BHNStore.domain.Category;
import BHNStore.domain.Product;
import BHNStore.model.ProductDTO;
import BHNStore.service.ProductService;
@Controller
@RequestMapping("admin/products")
public class ProductController {
	@Autowired
	ProductService productservice;
	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("product", new ProductDTO());
		return "admin/products/ProductAddorEdit";
	}
	@GetMapping("edit/{productId}")
	public String edit(Model model, @PathVariable("productId") Long productId) {
		Optional<Product> opt=productservice.findById(productId);
		ProductDTO dto=new ProductDTO();
		if(opt.isPresent()) {
			Product p=opt.get();
			BeanUtils.copyProperties(p, dto);
			dto.setIsEdit(true);

			model.addAttribute("product", dto);
			return "admin/products/ProductAddorEdit";
		}
		model.addAttribute("mes", "Product is Empty");
		return "forward: /admin/products/list";
	}
	@PostMapping("saveOrUpdate")
	public ModelAndView saveOrUpdate(ModelMap model, ProductDTO dto) {
		Product p=new Product();
		BeanUtils.copyProperties(dto, p);
		productservice.save(p);
		model.addAttribute("mes","Product is saved");
		return new ModelAndView("forward:/admin/products/list");
	}
	@GetMapping("delete/{productId}")
	public String delete(Model model, @PathVariable("productId") Long productId) {
		Optional<Product> opt=productservice.findById(productId);
		
		if(opt.isPresent()) {
			productservice.deleteById(productId);
			model.addAttribute("mes", "Product is Deleted");
			return "forward:/admin/products/list";
		}
		model.addAttribute("mes", "Product is Empty");
		return "forward:/admin/products/list";
	}
	@RequestMapping("list")
	public String list(Model model) {
		List<Product> list=productservice.findAll();
		model.addAttribute("products", list);
		return "admin/products/ProductList";
	}
	@RequestMapping("search")
	public String search(Model model, @RequestParam(name="name") String name){
		List<Product> list=null;
		if(!name.isEmpty()) {
			list=productservice.findByNameContaining(name);
		}
		else list=productservice.findAll();
		model.addAttribute("products", list);
		return "admin/products/ProductList";
	}

}
