package pl.techstyle.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.Model.AllPost;
import pl.techstyle.Service.PostService;

@Controller
@RequestMapping(value="/post")
public class PostController {
	
	@Autowired
	PostService postService;

	@GetMapping(value="/all")
	public ModelAndView getAllBooks(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("posts",postService.allPost());
		mav.setViewName("allPost");
		return mav;
		
	}
	@GetMapping(value="/add")
	public ModelAndView addBook(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("post",new AllPost());
		mav.setViewName("addPost");
		return mav;
		
	}
	@PostMapping(value="/add")
	public ModelAndView addBookPost(@Valid AllPost allPost,BindingResult br){
		ModelAndView mav = new ModelAndView();
		postService.add(allPost);
		mav.addObject("post",new AllPost());
		mav.setViewName("addPost");
		return mav;
	}
}
