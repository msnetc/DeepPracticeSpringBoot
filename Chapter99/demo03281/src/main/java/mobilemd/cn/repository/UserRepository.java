package mobilemd.cn.repository;
import mobilemd.cn.entity.Role;
import mobilemd.cn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByNameLike(String name);
    User readByName(String name);
    List<User> getByCreatedateLessThan(Date star);


}
