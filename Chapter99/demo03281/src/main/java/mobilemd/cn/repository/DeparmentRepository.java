package mobilemd.cn.repository;

import mobilemd.cn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentRepository  extends JpaRepository<Department, Long>, JpaSpecificationExecutor<Department>
{

}
