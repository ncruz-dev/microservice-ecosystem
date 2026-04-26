package pe.ncruzdev.companies_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ncruzdev.companies_crud.entities.Company;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findByName(String name);

}
