package pl.techstyle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.techstyle.Model.DetailPost;

public interface DetailPostRepository extends JpaRepository<DetailPost, Long> {

}
