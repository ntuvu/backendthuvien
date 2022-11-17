package com.example.btltute.repositories;

import com.example.btltute.domains.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

  Optional<Role> findRoleByName(String name);
}
