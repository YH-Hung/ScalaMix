package hle.scalamix.dao;

import hle.scalamix.entity.ProductDefect;
import hle.scalamix.entity.ProductDefectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scala.Option;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductDefectRepository extends JpaRepository<ProductDefect, ProductDefectId> {
    // Scala Option can be directly return
    Option<ProductDefect> findById_ProductIdAndId_InspectDateAndId_DefectId(Integer productId, LocalDateTime inspectDate, Integer defectId);

    List<ProductDefect> findById_ProductIdAndId_InspectDate(Integer productId, LocalDateTime inspectDate);
}
