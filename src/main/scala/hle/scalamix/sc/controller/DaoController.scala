package hle.scalamix.sc.controller

import hle.scalamix.dao.ProductDefectRepository
import hle.scalamix.dto.ProductDefectQueryReq
import hle.scalamix.entity.ProductDefect
import hle.scalamix.sc.dal.ProductDefectDataAccess
import hle.scalamix.sc.model.SingleDefectKey
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RequestMapping, RestController}

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
@RequestMapping(value = Array("/dao"))
class DaoController {

  @Autowired
  val defectRepo : ProductDefectRepository = null

  @PostMapping
  def getByIdSample(@RequestBody body: ProductDefectQueryReq) : ProductDefect = {
    val queryKey = SingleDefectKey(body.getProductId, LocalDateTime.parse(body.getInspectDt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), body.getDefectId)
    ProductDefectDataAccess.findById(queryKey).run(defectRepo).orNull
  }
}
