package hle.scalamix.sc.dto

import scala.beans.BeanProperty

class ProductDefectQueryReq {
  @BeanProperty var productId : Int = _
  @BeanProperty var inspectDt : String = _
  @BeanProperty var defectId : Int = _
}
