package webadv.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TaskController {
	@Autowired
	private TaskFactory tf;


	@GetMapping("/task/{id}")
    public String task(Model model,@PathVariable String id) {
		System.out.println(id);
        model.addAttribute("task",tf.findBy(id));
        return "Index";
    }
}
