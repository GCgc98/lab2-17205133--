package webadv.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class guochaoRestController {
	@Autowired
	private TaskFactory tf;
	
	@GetMapping("/task/")
	public List<Task> gettask(){
		return tf.gettask();
	}
	@GetMapping("/task/{id}")
    public Task task(@PathVariable String id) {
		return tf.findBy(id);
    }

}
