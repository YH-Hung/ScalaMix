package hle.scalamix.sc

import hle.scalamix.dao.ProductDefectRepository
import hle.scalamix.sc.dal.ProductDefectDataAccess
import hle.scalamix.sc.dto.ProductDefectQueryReq
import hle.scalamix.sc.model.SingleDefectKey
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.ParameterizedTypeReference
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.{ServerRequest, ServerResponse}

import scala.util.chaining.scalaUtilChainingOps

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Component
class ApiHandler {

  private val defectQueryKeyType = new ParameterizedTypeReference[ProductDefectQueryReq]() {}

  @Autowired
  val defectRepo: ProductDefectRepository = null

  def getByIdSample(request : ServerRequest) : ServerResponse = {
    defectQueryKeyType
      .pipe(request.body)
      .pipe(qk => SingleDefectKey(qk.productId, LocalDateTime.parse(qk.inspectDt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), qk.defectId))
      .pipe(ProductDefectDataAccess.findById)
      .run(defectRepo)
      .orNull
      .pipe(ServerResponse.ok().body)
  }
}
