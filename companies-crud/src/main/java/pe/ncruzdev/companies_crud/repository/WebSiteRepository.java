package pe.ncruzdev.companies_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ncruzdev.companies_crud.entities.WebSite;

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {

}
