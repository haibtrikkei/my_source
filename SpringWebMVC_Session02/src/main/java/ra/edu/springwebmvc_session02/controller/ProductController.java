package ra.edu.springwebmvc_session02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.edu.springwebmvc_session02.model.entity.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/","/products"})
public class ProductController {

    @GetMapping
    public String home(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        products.add(new Product(LocalDate.parse("21/12/2025",dtf),15000000D,"Dell","p01","Máy tính",2025));
        products.add(new Product(LocalDate.parse("03/02/2026",dtf),8000000D,"Sanyo","p02","Tủ lanh",2025));
        products.add(new Product(LocalDate.parse("15/11/2027",dtf),11000000D,"Toshiba","p03","Tivi",2025));
        products.add(new Product(LocalDate.parse("11/10/2025",dtf),500000D,"Việt Tiến","p04","Áo sơ mi nam",2025));
        products.add(new Product(LocalDate.parse("02/07/2025",dtf),45000000D,"Honda","p05","Xe máy",2025));
        products.add(new Product(LocalDate.parse("26/12/2026",dtf),400000D,"Adidas","p06","Giày nam",2025));

        model.addAttribute("listProducts",products);
        return "listProducts";
    }


}
