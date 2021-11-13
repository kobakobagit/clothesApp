package keigo.clothesApp.Controller;

import java.util.List;
import keigo.clothesApp.domain.Size;
import keigo.clothesApp.service.SizeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    private final SizeService sizeService;

    public IndexController(SizeService sizeService) {
        this.sizeService = sizeService;
    }

    @GetMapping("/")
    public String size(Model model) {
        List<Size> sizeList = sizeService.getAllSize();
        model.addAttribute("sizeList", sizeList);
        return "/size";
    }
}
