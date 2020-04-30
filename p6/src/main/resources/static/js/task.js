$(document).ready(function() {	
	$('.btn').click(function(){
		$.ajax({
			type:'get',
	        url: "http://localhost:8080/api/v1/task/"+$('.form-control').val(),
		}).then(function(response) {
			   console.log(response);
	        	let task = response;
	        	$("#id").text(task.id);
	        	$("#content").text(task.content);

	    });
	});    
});
