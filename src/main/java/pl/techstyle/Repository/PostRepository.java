package pl.techstyle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.techstyle.Model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
