package keigo.clothesApp.repository;

import keigo.clothesApp.domain.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Size, String> {
}
