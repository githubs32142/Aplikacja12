package pl.techstyle.Service;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.techstyle.Model.AllPost;
import pl.techstyle.Model.DetailPost;
import pl.techstyle.Model.Post;
import pl.techstyle.Repository.DetailPostRepository;
import pl.techstyle.Repository.PostRepository;

@Service
public class PostService {
	
	PostRepository postRepo;
	DetailPostRepository detailRepo;
	
	@Autowired
	public PostService(PostRepository postRepo, DetailPostRepository detailRepo) {
		this.postRepo = postRepo;
		this.detailRepo = detailRepo;
	}


	public void add(AllPost post) {
		Post p= new Post();
		p.setTitle(post.getTitle());
		postRepo.save(p);
		DetailPost detail = new DetailPost();
		detail.setCreatedBy(post.getCreatedBy());
		Date d= new Date();
		detail.setData(d);
		detail.setPost(p);
		detailRepo.save(detail);
	}
	public List<Post> allPost(){
		return postRepo.findAll();
	}

}
