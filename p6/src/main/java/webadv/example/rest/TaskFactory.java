package webadv.example.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


@Component
public class TaskFactory {
     public List<Task> gettask(){
    	 List<Task> list = new ArrayList();
    		 for(int i=0;i<9;i++) {
    				Task task = new Task();
    				task.setId(i+"");
                    task.setContent("17205133-郭超"+i);
    		 list.add(task);
    	 }
    	 return list;
    	 }


public Task findBy(String id) {
	 List<Task> list =gettask();
	 Task task=list.stream()
				.filter(x->x.getId().equals(id))
				.findFirst().orElse(null);
	 return task;
}


}











